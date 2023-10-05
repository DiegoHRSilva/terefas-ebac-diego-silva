package terefa11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Digite os dados neste formato nome - sexo separados por virgula");
	        String dados = sc.nextLine();

	        String[] nomes = dados.split(",");
	        List<String> grupoMasculino = new ArrayList<>();
	        List<String> grupoFeminino = new ArrayList<>();

	        for (String nomeSexo : nomes) {
	            String[] partes = nomeSexo.split("-");
	            
	                String nome = partes[0];
	                String sexo = partes[1].toUpperCase();

	                if (sexo.equals("M")) {
	                    grupoMasculino.add(nome);
	                } else if (sexo.equals("F")) {
	                    grupoFeminino.add(nome);
	                } else {
	                	System.out.println(nome + ": sexo invalido");
	                }
	           
	        }

	        System.out.println("Grupo 1 (Sexo Masculino):");
	        for (String nome : grupoMasculino) {
	            System.out.println(nome);
	        }

	        System.out.println("Grupo 2 (Sexo Feminino):");
	        for (String nome : grupoFeminino) {
	            System.out.println(nome);
	        }

	}

}
