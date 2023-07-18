import java.util.Scanner;

public class Wrapper {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int num;
        System.out.print("informe um valor inteiro:");
        num = ler.nextInt();
        int num2 = Integer.valueOf(num);
        System.out.print(num2);
    }
}
