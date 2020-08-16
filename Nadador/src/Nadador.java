import java.util.Scanner;

public class Nadador {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade");
        int idade = scanner.nextInt();
        String categoria = "";

        if (idade < 5) {
            System.out.println("Não possui a idade minnima para entrar na piscina");
        } else if (idade >= 5 && idade <= 10) {
            categoria = "infantil";
            System.out.println("Nadador categoria " + categoria);

        } else if (idade >= 11 && idade <= 17) {
            categoria = "Juvenil";
            System.out.println("Nadador categoria " + categoria);

        } else if (idade >18) {
            categoria = "Senior";
            System.out.println("Nadador categoria " + categoria);

        }
    }
}