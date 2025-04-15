import java.util.Scanner;
/*
* 1. Solicitar ao usuário o número de doações recebidas no mês.
2. Para cada doação, solicitar ao usuário o valor doado.
3. Calcular e armazenar o valor total das doações recebidas.
4. Verificar se o valor total das doações é superior a R$ 10.000,00.
   a) Se for superior, exibir a mensagem "Parabéns! O valor das doações é significativo para a ONG.".
   b) Se for igual ou inferior, exibir a mensagem "O valor das doações precisa ser aumentado para garantir a continuidade dos projetos da ONG.".
5. Solicitar ao usuário o número de projetos que a ONG realizou no mês.
6. Verificar se o número de projetos é maior ou igual a 3.
   a) Se for maior ou igual a 3, exibir a mensagem "A ONG está realizando um excelente trabalho! Parabéns a toda a equipe.".
   b) Se for inferior a 3, exibir a mensagem "É importante realizar mais projetos para impactar ainda mais vidas.".
7. Calcular e armazenar a média de valor das doações recebidas por projeto (valor total das doações dividido pelo número de projetos).
8. Exibir a média de valor das doações por projeto com duas casas decimais.
9. Exibir a quantidade de doações recebidas.
10. Exibir o valor total das doações recebidas.
11. Exibir a média de valor das doações recebidas por projeto.
12. Encerrar o programa exibindo uma mensagem de agradecimento e encorajamento para a continuidade do trabalho da ONG.
*/
public class Doacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double doacoes, valor, totalDoacoes=0;
        //* 1. Solicitar ao usuário o número de doações recebidas no mês.
        System.out.println("Informe o número de doações: ");
        doacoes = leitor.nextDouble();
        //Para cada doação, solicitar ao usuário o valor doado.
        for(int i = 1;  i < doacoes; i++)
        {
            System.out.println("Qual o valor doado na " + i + " doação: R$ ");
            valor = leitor.nextDouble();
            //Calcular e armazenar o valor total das doações recebidas.
            totalDoacoes += doacoes;
        }
        //Verificar se o valor total das doações é superior a R$ 10.000,00.
        if(totalDoacoes > 10000)
        {
            System.out.println("Parabéns! O valor das doações é significativo para a ONG.");
        }
        else
        {
            System.out.println("O valor das doações precisa ser aumentado para garantir a continuidade dos projetos da ONG.");
        }
//5. Solicitar ao usuário o número de projetos que a ONG realizou no mês.
        System.out.println("Informe o número de projetos que a ong realizou no mês: ");
        double nroProjetos = leitor.nextDouble();
        if(nroProjetos >= 3)
        {
            System.out.println("A ONG está realizando um excelente trabalho! Parabéns a toda a equipe.");
        }
        else
        {
            System.out.println("É importante realizar mais projetos para impactar ainda mais vidas");
        }
        double valorDoacaoProjeto, valorTotalProjeto = 0;
        for (int i = 1; i < nroProjetos; i++)
        {
            System.out.println("Qual o valor doado no " + i + "º projeto: R$ ");
            valorDoacaoProjeto = leitor.nextDouble();
            valorTotalProjeto += valorDoacaoProjeto;
        }
        double mediaProjeto = valorTotalProjeto / nroProjetos;

        System.out.println("A quantidade de doações recebidas foram: " + doacoes);
        System.out.println("Valor total de doações: " + totalDoacoes);
        System.out.println("A média de doações foi " + mediaProjeto);

        System.out.println("Agradecemos sua contribuição e continue nos ajudando!");
    }



}
