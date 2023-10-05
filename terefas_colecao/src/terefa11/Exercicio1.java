package terefa11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Exercicio1 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		System.out.print("Digite nomes separados por virgula: ");
		String nomes = sc.nextLine(); 
		list = Arrays.asList((nomes.split(",")));
		
		
		
		Collections.sort(list);
		
		
			System.out.println(list);

	}

}
