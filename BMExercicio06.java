import java.util.Scanner;

public class BMExercicio06 {
    
    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);

        int diaSemana = 0;

        do{
            System.out.print("Digite um numero entre 1 e 7 e vira o dia da semana correspondente: ");
            diaSemana = scan.nextInt();

            System.out.print("Dia da semana correspondente e: ");
            switch(diaSemana){

                case 1:
                System.out.println("Domingo");
                break;
                
                case 2:
                System.out.println("Segunda-feira");
                break;

                case 3:
                System.out.println("Terca-feira");
                break;

                case 4:
                System.out.println("Quarta-feira");
                break;

                case 5:
                System.out.println("Quinta-feira");
                break;

                case 6:
                System.out.println("Sexta-feira");
                break;

                case 7:
                System.out.println("Sabado");
                break;
                
            }

            System.out.println("\nDigite 0 se quiser parar o programa.\n");

        }while(diaSemana!=0);

           
        


    }

}
