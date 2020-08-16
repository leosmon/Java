import java.util.Scanner;

public class Emprestimo {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor do emprestimo desejado :");
        double valorDoEmprestimo = scanner.nextDouble();
        System.out.println("Em quantas parcelas o emprestimo sera pago :");
        int numeroDeParcelas = scanner.nextInt();
        System.out.println("Salario total do solicitante :");
        double salario = scanner.nextDouble();

        double valorDasPArcelas = valorDoEmprestimo/numeroDeParcelas;
        double valorLimiteDeParcela = salario*30/100;

        if (valorDasPArcelas<=valorLimiteDeParcela){
            System.out.println("Emprestimo Aprovado");
            System.out.println("Valor do emprestimo R$"+valorDoEmprestimo);
            System.out.println("Pagamento em "+numeroDeParcelas+" parcelas de R$"+valorDasPArcelas);
        } else {
            System.out.println("Seu emprestimo não foi aprovado");
        }

    }
}
