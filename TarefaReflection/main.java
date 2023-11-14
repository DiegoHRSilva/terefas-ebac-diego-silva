package anotation;

@Tabela(nome = "Tabela Nova")
public class Main {

  public static void main(String[] args) {
    Class<?> minhaClasse = Main.class;

    if (minhaClasse.isAnnotationPresent(Tabela.class)) {
      Tabela tabelaAnnotation = minhaClasse.getAnnotation(Tabela.class);
      String nomeDaTabela = tabelaAnnotation.nome();
      System.out.println("O nome da tabela é: " + nomeDaTabela);
    } else {
      System.out.println("A classe não possui a anotação @Tabela.");
    }
  }
}
