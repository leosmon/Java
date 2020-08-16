import java.util.Scanner;

public class ValorDoBonus {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Salario do funcionario : ");
        double salario = scanner.nextDouble();
        System.out.println("Tempo de empresa : ");
        int tempoDeEmpresa = scanner.nextInt();

        if (tempoDeEmpresa >= 5){
            var bonus = salario*20/100;
            System.out.println("O bonus do funcionario e de R$"+bonus);
        } else {
            var bonus = salario*10/100;
            System.out.println("O bonus do funcionario e de R$"+bonus);
        }



    }
}
