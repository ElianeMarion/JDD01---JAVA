import java.util.Scanner;

public class FuncoesComVetor {
    //Procedimento que exibe um vetor
    public static void exibirVetor(double[] vetor){
        System.out.println("Vetor");
        for(int i = 0; i< vetor.length;i++)
            System.out.println(vetor[i]);
    }
    //Função que retorna o primeiro elemento de um vetor
    public static double primeiroElemento(double[] vetor){
        return vetor[0];
    }

    //Função que ordena um vetor
    public static double[] ordenaVetor(double[] vetor){
        double auxiliar;
        for(int i = 0 ; i < vetor.length; i++){
            for(int j = i+1; j < vetor.length; j++){
                if(vetor[i] > vetor[j]){
                    auxiliar = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = auxiliar;
                }
            }
        }
        return vetor;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] vetNum = new double[5];
        for(int i = 0; i < vetNum.length; i++){
            System.out.println("Digite o " + (i+1) + " número");
            vetNum[i] = leitor.nextDouble();
        }
        exibirVetor(vetNum);
        System.out.println("O primeiro elemento do vetor é: " + primeiroElemento(vetNum));
        vetNum = ordenaVetor(vetNum);
        exibirVetor(vetNum);
    }
}
