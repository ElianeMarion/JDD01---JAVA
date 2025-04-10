import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        //Fatorial : solicitar um número
        //4! = 4 * 3 * 2 * 1
        //5! = 5 * 4 * 3 * 2 * 1
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = leitor.nextInt();
        int fat = 1;
        for(int i = numero; i >= 1; i--){
            fat = fat * i;
        }
        System.out.println(numero + "! + " + fat);
    }
}
