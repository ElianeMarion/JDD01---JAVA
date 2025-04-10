import java.sql.Connection;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        int idade = 0, media, numeroAluno;
        String continuar;
        //inicializando a variável da condição
        numeroAluno = 0;
         do{
            System.out.println("Digite a idade do "+ (numeroAluno+1) + "º aluno: ");
            idade = idade + leitor.nextInt();
            //Incremento - alterar a variável da condição para que em algum momento
            //a condição se torne falsa
            numeroAluno++;
             System.out.println("Deseja informar a idade de outro aluno? [S/N]");
             continuar = leitorTexto.nextLine();
        }while(continuar.equalsIgnoreCase("s") || continuar.equalsIgnoreCase("sim"));
        media = idade/numeroAluno;
        System.out.println("A média de idade dos alunos da escola é: " + media);
    }
}
