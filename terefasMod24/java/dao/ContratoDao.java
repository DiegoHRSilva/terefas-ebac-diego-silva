package dao;


public class ContratoDao implements IContratoDao {

  @Override
  public void salvar() {
    throw new UnsupportedOperationException("Não funciona com o banco");
  }

  public void buscar() {
    throw new UnsupportedOperationException("Não funciona sem config de banco");
    // return "Sucesso";
  }

  public void excluir() {
    throw new UnsupportedOperationException("Não funciona sem config de banco");
    // return "Sucesso";
  }

  public void atualizar() {
    throw new UnsupportedOperationException("Não funciona sem config de banco");
    // return "Sucesso";
  }

}
