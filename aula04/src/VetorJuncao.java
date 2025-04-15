import java.util.Scanner;

public class VetorJuncao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        /*Ler o vetor A e o vetor B com 4 elementos cada
        Criar o vetorC que vai a junção dos vetores A e B
        * */
        int[] vetA = new int[4];
        int[] vetB = new int[4];
        int[] vetC = new int[8];
        int i;
        System.out.println("Preenchendo o vetor A");
        for(i=0; i<4; i++){
            System.out.println("Digite um número: ");
            vetA[i] = leitor.nextInt();
        }
        System.out.println("\nPreenchendo o vetor B");
        for(i=0; i<4; i++){
            System.out.println("Digite um número: ");
            vetB[i] = leitor.nextInt();
        }
        for(i=0; i<4; i++){
            vetC[i] = vetA[i];
            vetC[i+4] = vetB[i];
        }
        for(i=0; i<8; i++){
            System.out.println(vetC[i]);
        }

    }
}
