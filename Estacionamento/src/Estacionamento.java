import java.util.Scanner;

public class Estacionamento {

    //um algoritimo que tem como base que o posto fica aberto de 08:00 as 19:00
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("hora da entrada");
        int he = scanner.nextInt();
        System.out.print("minutos da entrada");
        int me = scanner.nextInt();

        System.out.print("hora da saida.");
        int hs = scanner.nextInt();
        System.out.print("minutos da saida");
        int ms = scanner.nextInt();


            int horaDeEstacionamento = hs - he;

            if(ms > me){
                horaDeEstacionamento = horaDeEstacionamento+1;
            }
            if (horaDeEstacionamento == 1){
                double pag = 4;
                System.out.println("valor total R$"+pag);

            }else if (horaDeEstacionamento == 2) {
                double pag = 6;
                System.out.println("valor total R$" + pag);
            } else if (horaDeEstacionamento > 2){
                double pag = 6+(horaDeEstacionamento-2);
                System.out.println("valor total R$" + pag);
            }


    }
}
