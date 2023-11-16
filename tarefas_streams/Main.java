package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

  public class Main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os dados neste formato nome - sexo separados por virgula");
        String dados = sc.nextLine();

          List<String> pessoas = Arrays.asList(dados.split(","));

          List<String> mulheres = pessoas.stream()
                  .filter(p -> p.split("-")[1].equals("Feminino"))
                  .collect(Collectors.toList());
          
          System.out.println("Pessoa do sexo Feminino:");
          mulheres.forEach(System.out::println);
      }
  }
