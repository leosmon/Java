import java.text.DecimalFormat;
import java.util.Scanner;

public class Posto {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");

        //variaveis de condição do while
        var litroMenoQueZero = false;
        while (litroMenoQueZero == false ){

        //variaveis usadas no programa
        double desconto = 0,valorTotal = 0 ,valorLt = 0;
        String tipoDeCombustivel = " ";

        // var combustivel recebe o combustivel soliitado
        System.out.println("Alcool(A) ou gasolina(G)");
        var combustivel = scanner.nextLine();

        // var litros recebe a quantidade de litros
        System.out.println("Litros :");
        float litros = scanner.nextFloat();

            litroMenoQueZero = (litros>0);


        if (combustivel.equalsIgnoreCase("A")) {

            tipoDeCombustivel =" Acool";

            if (litros > 0 && litros <= 20) {

                 valorLt = 2.90;
                 desconto = litros * (valorLt * 3 / 100);
                valorTotal = litros * valorLt - desconto;

            } else if (litros > 20) {

                 valorLt = 2.90;
                 desconto = litros * (valorLt * 5 / 100);
                valorTotal = litros * valorLt - desconto;


            } else {
                System.out.println("A quantidade em litros deve ser maior que zero(0) ");
            }
        } else if (combustivel.equalsIgnoreCase("G")){

            tipoDeCombustivel ="Gasolina";

            if (litros > 0 && litros <= 20) {

                 valorLt = 3.30;
                 desconto = litros * (valorLt * 4 / 100);
                valorTotal = litros * valorLt - desconto;

            } else if (litros > 20) {

                 valorLt = 3.30;
                 desconto = litros * (valorLt * 6 / 100);
                valorTotal = litros * valorLt - desconto;

            } else {

                System.out.println("A quantidade em litros deve ser maior que zero(0) ");
            }
        }
        if(litroMenoQueZero == true){
            System.out.println("Litros       Combustivel         valor Lt      desconto     valor Total");
            System.out.println((" "+litros+"         "+tipoDeCombustivel+"            R$"+formatador.format(valorLt))+"         R$"+formatador.format(desconto)+"        R$"+formatador.format(valorTotal));
        }

        }

    }
}

