package br.com.diego;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.diego.dao.generic.jdbc.dao.ProdutoDAO;
import br.com.diego.dao.generic.jdbc.dao.IProdutoDAO;
import br.com.diego.domin.Produto;

public class ProdutoTest {

	
	private IProdutoDAO produtoDAO;
	
	
	@Test
	public void cadastrarTest() throws Exception {
		produtoDAO = new ProdutoDAO();
		
		Produto produto = new Produto();
		produto.setCodigo("10");
		produto.setNome("teste");
		Integer countCad = produtoDAO.cadastrar(produto);
		assertTrue(countCad == 1);
		
		Produto produtoBD = produtoDAO.buscar("10");
		assertNotNull(produtoBD);
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getNome(), produtoBD.getNome());
		
		Integer countDel = produtoDAO.excluir(produtoBD);
		assertTrue(countDel == 1);
	}
	
	@Test
	public void buscarTest() throws Exception {
		produtoDAO = new ProdutoDAO();
		
		Produto produto = new Produto();
		produto.setCodigo("10");
		produto.setNome("teste");
		Integer countCad = ProdutoDAO.cadastrar(produto);
		assertTrue(countCad == 1);
		
		Produto produtoDB = ProdutoDAO.buscar("10");
		assertNotNull(clienteBD);
		assertEquals(produto.getCodigo(), produtoDB.getCodigo());
		assertEquals(produto.getNome(), produtoDB.getNome());
		
		Integer countDel = ProdutoDAO.excluir(produtoDB);
		assertTrue(countDel == 1);
	}
	
	@Test
	public void excluirTest() throws Exception {
		produtoDAO = new ProdutoDAO();
		
		Produto produto = new Produto();
		produto.setCodigo("10");
		produto.setNome("teste");
		Integer countCad = produtoDAO.cadastrar(produto);
		assertTrue(countCad == 1);
		
		Produto produtoBD = produtoDAO.buscar("10");
		assertNotNull(produtoBD);
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getNome(), produtoBD.getNome());
		
		Integer countDel = produtoDAO.excluir(produtoBD);
		assertTrue(countDel == 1);
	}
	
	@Test
	public void buscarTodosTest() throws Exception {
		produtoDAO = new ProdutoDAO();
		
		Produto produto = new Produto();
		produto.setCodigo("10");
		produto.setNome("teste");
		Integer countCad = ProdutoDAO.cadastrar(produto);
		assertTrue(countCad == 1);
		
		Produto produtos = new Produto();
		produtos.setCodigo("20");
		produtos.setNome("teste2");
		Integer countCad2 = ProdutoDAO.cadastrar(produtos);
		assertTrue(countCad2 == 1);
		
		List<Produto> list = produtoDAO.buscarTodos();
		assertNotNull(list);
		assertEquals(2, list.size());
		
		int countDel = 0;
		for (Produto pro : list) {
			ProdutoDAO.excluir(pro);
			countDel++;
		}
		assertEquals(list.size(), countDel);
		
		list = produtoDAO.buscarTodos();
		assertEquals(list.size(), 0);
	}
	
	@Test
	public void atualizarTest() throws Exception {
		produtoDAO = new ProdutoDAO();
		
		Produto produto = new Produto();
		produto.setCodigo("10");
		produto.setNome("teste");
		Integer countCad = produtoDAO.cadastrar(produto);
		assertTrue(countCad == 1);
		
		Produto produtoDB = produtoDAO.buscar("10");
		assertNotNull(produtoDB);
		assertEquals(produto.getCodigo(), produtoDB.getCodigo());
		assertEquals(produto.getNome(), produtoDB.getNome());
		
		produtoDB.setCodigo("20");
		produtoDB.setNome("teste2");
		Integer countUpdate = produtoDAO.atualizar(produtoDB);
		assertTrue(countUpdate == 1);
		
		Produto produtoDB1 = produtoDAO.buscar("10");
		assertNull(produtoDB1);
		
		Produto produtoDB2 = produtoDAO.buscar("20");
		assertNotNull(produtoDB2);
		assertEquals(produtoDB.getId(), produtoDB2.getId());
		assertEquals(produtoDB.getCodigo(), produtoDB2.getCodigo());
		assertEquals(produtoDB.getNome(), produtoDB2.getNome());
		
		List<Cliente> list = produtoDAO.buscarTodos();
		for (Produto pro : list) {
			clienteDAO.excluir(pro);
		}
	}
}
