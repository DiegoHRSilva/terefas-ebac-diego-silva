package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
   
    Carro carro1 = new CarroEsportivo("Civic Type R", "Civic", 2022, true);
    Carro carro2 = new CarroSedan("New City Sedan", "City", 2021, 4);

    
    List<Carro> listaDeCarros = new ArrayList<>();

   
    listaDeCarros.add(carro1);
    listaDeCarros.add(carro2);

    
    System.out.println("Lista de Carros:");
    for (Carro carro : listaDeCarros) {
      System.out.println(carro);
    }
  }
}
