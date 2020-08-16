import java.util.Scanner;

public class AprovadoOuReprovado {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeira nota :");
        double nota1 = scanner.nextDouble();
        System.out.print("Segunda nota :");
        double nota2 = scanner.nextDouble();
        System.out.print("Total de aulas do Curso : ");
        int totalDeAulas = scanner.nextInt();
        System.out.print("Total de aulas presente : ");
        int aulasPresente = scanner.nextInt();

        double media = (nota1 + nota2 )/2;
        double frequencia = aulasPresente*100/totalDeAulas;

        if (media >= 6 && frequencia >=75 ){
            System.out.println("\n");
            System.out.println("Media : "+media);
            System.out.println("Frequencia :"+frequencia);
            System.out.println("Parabens voce foi Aprovado !!");
        } else {
            System.out.println("\n");
            System.out.println("Media : "+media);
            System.out.println("Frequencia :"+frequencia);
            System.out.println("Sinto muito você foi Reprovado");
        }





    }

}

