
package br.com.diego.services;

import br.com.diego.dao.IClienteDAO;
import br.com.diego.domain.Cliente;
import br.com.diego.exceptions.TipoChaveNaoEncontradaException;
import br.com.diego.services.generic.GenericService;


public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);		
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}
}
