import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade = 0, media, numeroAluno;
        //inicializando a variável da condição
        numeroAluno = 1;
        while(numeroAluno <= 5) { //Definir a condição de repetição
            System.out.println("Digite a idade do "+ numeroAluno + "º aluno: ");
            idade = idade + leitor.nextInt();
            //Incremento - alterar a variável da condição para que em algum momento
            //a condição se torne falsa
            numeroAluno++;
        }
        media = idade/5;
        System.out.println("A média de idade dos alunos da escola é: " + media);


    }

}
