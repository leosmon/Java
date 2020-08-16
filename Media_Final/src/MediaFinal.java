import java.util.Scanner;

public class MediaFinal {


    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));

        System.out.print("Digite a primeira nota :");
        float nota1 = scanner.nextFloat();
        System.out.print("Digite a Segunda nota :");
        float nota2 = scanner.nextFloat();
        System.out.print("Digite a Terceira nota :");
        float nota3 = scanner.nextFloat();

        float media = (nota1+nota2+nota3) /3;

        System.out.println("\n");
        System.out.println("Sua media é :"+media);

    }
}
