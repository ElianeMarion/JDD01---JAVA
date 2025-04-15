import java.util.Scanner;

public class Vendas {
    public static void main(String[] args) {
        /*Elaborar um programa que calcule a quantidade de vendas dos
        * 5 vendedores da empresa*/
        Scanner leitor = new Scanner(System.in);
        double[] vendas = new double[5];
        String[] nomesVendedores ={"Ana", "Eliane", "Fernando", "Julia", "Maria"};
        double somaVendas=0;
        for(int i = 0; i < vendas.length; i++){
            System.out.println("Digite a venda do(a) vendedor(a) " + nomesVendedores[i]);
            vendas[i] = leitor.nextDouble();
            somaVendas += vendas[i];
        }
        System.out.println("Total de vendas R$ " + somaVendas);
        for (int i = 0; i < vendas.length; i++)
            System.out.println(nomesVendedores[i] + " vendeu R$ " + vendas[i]);



    }
}
