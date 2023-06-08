public class ClassePrincipal {
    public static void main(String args[]){
        Divida divida= new Divida();
        System.out.println("Programa de Cadastro de divida.");
        divida.cadastrarCodigo(1);
        System.out.print("Codigo: ");
        System.out.println(divida.getCodigo());
        divida.cadastrarPessoa("Diego");
        System.out.print("Pessoa: ");
        System.out.println(divida.getPessoa());
        divida.cadastrarvalor(10.5);
        System.out.print("Valor: ");
        System.out.println(divida.getValor());

    }
}
