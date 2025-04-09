public class While {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Par");
        while (i <= 20){
            System.out.println(i);
            i += 2;
        }
        System.out.println("Impar");
        i = 1;
        while (i <= 20){
            System.out.println(i);
            i += 2;
        }
        System.out.println("Invertido");
        i = 20;
        while (i >= 0){
            System.out.println(i);
            i -= 2;
        }

    }

}
