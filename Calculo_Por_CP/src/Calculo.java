import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculo {

    public static void main(String[] args) {

        DecimalFormat formatador = new DecimalFormat("0.00");
        Scanner scanner =new Scanner(System.in);
        double valorTotal = 0;


        System.out.print("Digite o valor do Protduto(PE) :");
        double pe = scanner.nextDouble();

        //variavel de condição para o while
        var testCP = 0;
        while (testCP <= 0 || testCP > 4) {
            System.out.print("Digite o Codigo da CP :");
            int cp = scanner.nextInt();

            //variavel de condição do while recebe o valor de cp e checa se e maior que zero ou menor do que 4
              testCP = cp;

            if (cp == 1) {

                valorTotal = pe - (pe * 10 / 100);
                System.out.println("O valor total da sua compra é de R$" + valorTotal + " com 10% de desconto");

            } else if (cp == 2) {

                valorTotal = pe - (pe * 5 / 100);
                System.out.println("O valor total da sua compra é de R$" + valorTotal + " com 5% de desconto");

            } else if (cp == 3) {

                double parcela = pe / 2;
                valorTotal = pe;
                System.out.println("O valor total da sua compra é de R$" + valorTotal + " dividido e 2x de R$" + parcela);

            } else if (cp == 4) {

                double acrescimo = pe * 10 / 100;
                double parcela = (pe + acrescimo) / 3;
                valorTotal = pe + acrescimo;
                System.out.println("O valor total da sua compra é de " + valorTotal + " com 10% de acrescimo no valor de R$" + acrescimo + " dividido em 3x de R$" + formatador.format(parcela));

            } else {
                // se a condição não for atendita sera solicitado o codigo de cp novamente
                System.out.println("Digite um codigo de CP valido");

            }
        }
    }
}
