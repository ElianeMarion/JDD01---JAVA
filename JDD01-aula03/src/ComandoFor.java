import java.util.Scanner;

public class ComandoFor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade = 0, media, numeroAluno;
        for(numeroAluno = 1; numeroAluno <= 5; numeroAluno++){
            System.out.println("Digite a idade do " + numeroAluno + "º aluno: ");
            idade = idade + leitor.nextInt();
        }
        media = idade / 5;
        System.out.println("A média de idade dos alunos da escola é: " + media);
    }
}
