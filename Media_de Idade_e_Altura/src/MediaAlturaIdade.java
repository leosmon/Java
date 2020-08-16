import java.util.Scanner;

public class MediaAlturaIdade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idadeMaiorQue20 = 0;
        int somaDaAltura = 0;
        int alturaMenorQue170 = 0;
        int somaDaIdade=0;
        int menorQue20eMenor170 = 0;
        int somaDaIdadeMenorque20= 0;
        int naoSeEncaixam = 0;


        //o contador pode ser alterado para a quantidade de alunos na sala
        var contador = 0;
        while (contador<10){



            System.out.println(" digite a idade do aluno ");
            int idade = scanner.nextInt();
            System.out.println("Digite a altura do aluno");
            int altura = scanner.nextInt();

            if (idade >=20){

                    if(altura < 170){

                        //quantidade de alunos com mais de 20 e altura menor que 170
                        alturaMenorQue170++;
                        somaDaIdade = somaDaIdade + idade;
                    }

                //quantidade de alunos com mais de 20 anos independete da altura
                idadeMaiorQue20++;
                somaDaAltura = somaDaAltura + altura;

            } else if ( altura <170 && idade<20  ){

                //quantidade de alunos com menos de 20 e com altura de menor que 170
                menorQue20eMenor170++;
                somaDaIdadeMenorque20 = somaDaIdadeMenorque20 +idade;

            } else {
                //quantidade de alunos com menos de 20 anos e com alturma maior que 170
                naoSeEncaixam++;

            }
            //adicionando +1 ao contador do while
            contador++;

        }


         double alturaMedia = (somaDaIdadeMenorque20+somaDaIdade)/(alturaMenorQue170 + menorQue20eMenor170);
        System.out.println("existem "+(alturaMenorQue170+menorQue20eMenor170)+" de alunos com menos de 170 de altura a media de idade desses alunos e de "+alturaMedia+" anos");
        double mediaDeAltura = somaDaAltura/alturaMenorQue170;
        System.out.println("existem "+idadeMaiorQue20+" alunos com mais de 20 anos a altura media desses alunos e de "+mediaDeAltura+" metros");
        System.out.println(naoSeEncaixam+" alunos tem menos de 20 anos e mais de 170 de altura");

    }
}
