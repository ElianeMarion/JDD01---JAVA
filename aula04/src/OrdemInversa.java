import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        /*Leia um vetor A com 5 elementos
        * Criar um vetor B com a mesma dimensão, composto por os
        * elementos do vetor A em ordem inversa
        * A {1,2,3,4,5} - B {5,4,3,2,1}
        * */
        int[] vetA = new int[5];
        int[] vetB = new int[5];
        int i;
        for(i=0; i<5; i++){
            System.out.println("Digite o " + (i+1) + " valor: ");
            vetA[i]= leitor.nextInt();
        }
        int x = vetA.length -1;
        for(i=0; i<5; i++){
            vetB[i] = vetA[x];
            x--;
        }

        for(i=4; i>0; i--){
            vetB[4-i] = vetA[i];
        }


    }
}
