import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        /*Exercício 1: Caixa eletrônico
Utilizando a estrutura switch case, elabore um programa que leia um valor
 referente a uma transação bancária de acordo com as opções abaixo:
1 – Depósito
2 – Saque
3 – Ver saldo
4 - Sair
Lembre-se: o saldo começa com 0 (zero). O programa deve controlar o valor
 do saldo a cada depósito ou saque. A conta pode ficar negativa.
 O usuário permanecerá no programa até digitar a opção 4 – sair.
*/
        Scanner leitor = new Scanner(System.in);
        int opcao;
        double saldo = 0, valor;
        System.out.println("Bem vindo ao Banco FIAP");
       do {
           System.out.println("\nOperações disponíveis neste caixa:" +
                   "\n\n1 - Depósito\t\t2 - Saque" +
                   "\n3 - Consultar Saldo\t4 - Sair");
           System.out.println("Opção: ");
           opcao = leitor.nextInt();
           switch (opcao) {
               case 1:
                   System.out.println("Informe o valor a ser depositado: R$ ");
                   valor = leitor.nextDouble();
                   saldo += valor;
                   break;
               case 2:
                   System.out.println("Informe o valor a ser retirado: R$ ");
                   valor = leitor.nextDouble();
                   if (saldo >= valor)
                       saldo -= valor;
                   break;
               case 3:
                   System.out.println("Saldo R$ " + saldo);
                   break;
               case 4:
                   System.out.println("Obrigada por usar o nosso sistema");
                   break;
               default:
                   System.out.println("Opção inválida");
                   break;
           }
       }while (opcao != 4);
    }
}
