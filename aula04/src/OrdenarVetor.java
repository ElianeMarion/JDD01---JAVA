import java.util.Arrays;

public class OrdenarVetor {
    public static void main(String[] args) {
        String[] nomes = {"Maria", "João", "Pedro", "Ana", "Carolina", "Daniela", "Lucia"};

        System.out.println("Exibindo vetor original");
        for(int i=0; i< 7; i++)
            System.out.println(nomes[i]);

        Arrays.sort(nomes);
        System.out.println("\nExibindo vetor ordenado");
        for(int i=0; i< 7; i++)
            System.out.println(nomes[i]);
    }

}
