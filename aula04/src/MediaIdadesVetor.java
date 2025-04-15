import java.util.Scanner;

public class MediaIdadesVetor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Variável => tipo nome;
        int i;
        //vetor armazena um conjunto finito de elementos
        int[] numeros = new int[5];

        // Construiu um vetor nomes com 4 posições
        String[] nomes = {"Ana", "Eliane", "André", "Maria"};
        int[] idades = {4,6,7,8,4,5,6};
        char[] nome = new char[10];//Eliane
        numeros[0]= 4;
        int soma =0;
        System.out.println(numeros[0]);
        for(i=0; i < 5; i++){
            System.out.println("Digite a idade do "+ (i+1) + " aluno: ");
            numeros[i] = leitor.nextInt();
            soma += numeros[i];
        }
        int media = soma / numeros.length;
        System.out.println("Média de idades: " + media);
        for (i=0; i<5; i++)
            System.out.println("Idade do " + (i+1) + " aluno: " + numeros[i]);


    }
}
