import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioAtual {


    public static void main(String[] args) {
        DecimalFormat formatador = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano atual :");
        int anoAtual = scanner.nextInt();

        double salarioInicial =600;
        double aumento = 1.5;
        double salarioAtual = 0;
        var contador = 2003;
        while (contador <= anoAtual){


            salarioAtual = salarioInicial+(salarioInicial*aumento/100);
            System.out.println("\n");
            System.out.println("Salario em "+contador+" R$"+formatador.format(salarioAtual));
            System.out.println("o aumento foi de "+aumento+"%");
            aumento = aumento*2;

            contador++;
        }


    }


}
