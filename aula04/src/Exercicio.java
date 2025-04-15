import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        /*Exercício 1: Preencha um vetor com 10 números.
        a) Exiba o maior valor.
        b) Some os elementos do vetor.
        c) Exiba a média dos elementos inseridos.
        d) Exiba o índice do primeiro positivo inserido.
        e) Exiba o índice do último negativo.

        * */
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[10];
        int i;
        for(i=0; i<10; i++){
            System.out.println("Digite um número: ");
            vetor[i] = leitor.nextInt();
        }
        int maior = vetor[0];
        //a) Exiba o maior valor.
        for(i=0; i<10; i++){
            if(maior < vetor[i])
                maior = vetor[i];
        }
        System.out.println("Maior elemento do vetor é: " + maior);
        int soma = 0;
        //b) Some os elementos do vetor.
        for(i=0; i<10; i++){
            soma += vetor[i];
        }
        System.out.println("Soma dos elementos = " + soma);
        //c) Exiba a média dos elementos inseridos.
        double media = soma / 10.0;
        System.out.println("Média = " + media);
        //d) Exiba o índice do primeiro positivo inserido.
        for(i=0; i<10; i++){
            if(vetor[i] > 0) {
                System.out.println("Índice do primeiro positivo é " + i);
                break;
            }
        }

        //e) Exiba o índice do último negativo.
        int indiceNegativo = -1;
        for(i=0; i<10; i++){
            if(vetor[i] < 0) {
                indiceNegativo = i;
            }
        }
        if(indiceNegativo == -1)
            System.out.println("Não existe número negativo no vetor");
        else
            System.out.println("Indice do ultimo negativo " + indiceNegativo);
    }
}
