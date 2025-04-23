import java.util.Scanner;

public class SistemaFiap {

    //Variável global
    public static String email, senha;
    //Constante
    static final int MAX = 50;
    public static String[] equipamentoSerie = new String[MAX];
    public static String[] equipamentoDescricao = new String[MAX];
    public static String[] equipamentoStatus = new String[MAX];
    public static int qtdEquipamentos = 0;
    //Cadastrar o equipamento na memória usando os vetores globais.
    public static void cadastrarEquipamento(Scanner leitor){
        if(qtdEquipamentos < MAX) {
            System.out.println("=======================================" +
                    "\nCadastro de Equipamento" +
                    "\n------------------------------------");
            System.out.println("Número de série: ");
            equipamentoSerie[qtdEquipamentos] = leitor.nextLine();
            System.out.println("Descrição: ");
            equipamentoDescricao[qtdEquipamentos] = leitor.nextLine();
            System.out.println("Status: ");
            equipamentoStatus[qtdEquipamentos] = leitor.nextLine();
            qtdEquipamentos++;
            System.out.println("Equipamento cadastrado com sucesso!");
        }
        else{
            System.out.println("Limite de equipamentos atingido.");
        }
    }
    //mostrar equipamentos em manutenção
    public static void exibirEquipamentosEmManutencao(){
        System.out.println("=======================================" +
                "\nRelatório de equipamentos em manutenção" +
                "\n------------------------------------");
        for(int i = 0; i < qtdEquipamentos; i++){
            if(equipamentoStatus[i].equalsIgnoreCase("em manutenção")){
                System.out.println(equipamentoDescricao[i] + " número de série " +
                        equipamentoSerie[i]);
            }
        }
    }
    public static int quantidadeEquipamentosEmManutencao(){
        int quantidade = 0;
        for(int i = 0; i < qtdEquipamentos; i++){
            if(equipamentoStatus[i].equalsIgnoreCase("em manutenção")){
                quantidade++;
            }
        }
        return quantidade;
    }

    //Procedimento que altera o status de um equipamento
    public static void alterarStatus(String numSerie){
        Scanner leitor = new Scanner(System.in);
        boolean encontrado = false;
        int op;
        for(int i = 0; i < qtdEquipamentos; i++){
            if (equipamentoSerie[i].equalsIgnoreCase(numSerie)) {
                System.out.println("Deseja alterar o status atual para [1] - Em manutenção" +
                        "/[2] - Finalizado");
                op = leitor.nextInt();
                equipamentoStatus[i] = (op == 1) ? "Em manutenção" : "Finalizado";
                encontrado = true;
//                if(op == 1)
//                    equipamentoStatus[i] = "Em manutenção";
//                else
//                    equipamentoStatus[i] = "Finalizado";
            }
        }
        if(!encontrado){
            System.out.println("Nenhum equipamento encontrado com este número de série.");
        }
    }
    public static void exibirMenuPrincipal(){
        System.out.println("FIAP System");
        System.out.println("1 - Cadastrar usuário");
        System.out.println("2 - Efetuar login");
        System.out.println("3 - Sair");
        System.out.println("Digite a opção desejada: ");
    }

    public static String cadastrarUsuario(Scanner leitor){
        //nome, telefone, email, senha, apelido
        String nome, telefone, apelido;
        System.out.println("Digite seu nome: ");
        nome = leitor.nextLine();
        System.out.println("Digite seu telefone: ");
        telefone = leitor.nextLine();
        System.out.println("Digite seu email: ");
        email = leitor.nextLine();
        System.out.println("Digite sua senha: ");
        senha = leitor.nextLine();
        System.out.println("Como deseja ser chamado? ");
        apelido = leitor.nextLine();
        return nome + " seu cadastro foi realizado com sucesso";
    }
    //Verificar se o usuário e senha digitados são iguais aos "cadastrados"
    public static boolean validarLogin(String user, String password){
        if(user.equalsIgnoreCase(email) && password.equals(senha))
            return true;
        return false;
    }

    public static void subMenu(){

        System.out.println("Digite 1 para registrar um equipamento");
        System.out.println("Digite 2 para mostrar equipamentos em manutenção");
        System.out.println("Digite 3 para exibir quantidade de equipamentos em manutenção");
        System.out.println("Digite 4 para alterar status do equipamentos");
        System.out.println("Digite 0 para voltar para o menu principal");
        System.out.println("Opção desejada .: ");
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNumerico = new Scanner(System.in);
        int opcao = 0, opcaoSubMenu = 0;
        String user, password;
        do{
            exibirMenuPrincipal();
            opcao = leitorNumerico.nextInt();
            switch (opcao){
                case 1 -> {
                    System.out.println(cadastrarUsuario(leitor));
                }
                case 2 ->{
                    System.out.println("Login");
                    System.out.println("Digite seu email: ");
                    user = leitor.nextLine();
                    System.out.println("Digite sua senha: ");
                    password = leitor.nextLine();
                    if(validarLogin(user, password)){
                        System.out.println("Usuário logado com sucesso!");
                        do{
                            subMenu();
                            opcaoSubMenu = leitorNumerico.nextInt();
                            switch (opcaoSubMenu){
                                case 1 -> cadastrarEquipamento(leitor);
                                case 2 -> exibirEquipamentosEmManutencao();
                                case 3 -> System.out.println(quantidadeEquipamentosEmManutencao() + " equipamento(s) em manutenção");
                                case 4 -> {
                                    System.out.println("Alterar status");
                                }

                            }

                        }while(opcaoSubMenu != 0);

                    }else{
                        System.out.println("Usuário e/ou senha inválidas");
                    }
                }

            }

        }while (opcao != 3);
    }
}
