import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showMenu();
    }


    //Metodo de acceso a menu de Deck
    public static void showMenu(){
        Deck baraja1 = new Deck();
        baraja1.getBaraja();

        Scanner entrada = new Scanner(System.in);
        int opcion = -1;

        while(opcion != 0 ){
            System.out.println("Bienvenido a Poker!\n"
                    +"1 Mezclar deck\n"
                    +"2 Sacar una carta\n"
                    +"3 Carta al azar\n"
                    +"4 Generar una mano de 5 cartas\n"
                    +"0 salir");
            System.out.println("Eliga una opción: ");
            opcion = entrada.nextInt();

            switch (opcion){
                case 0:
                    System.out.println("Programa Finalizado");
                    break;
                case 1:
                        baraja1.getShuffle();
                    break;
                case 2: baraja1.getHead();
                    break;
                case 3: baraja1.getPick();
                    break;
                case 4: baraja1.getHand();
                    break;
                default:
                    System.out.println("Opción no valida, digite un numero del 0 al 4");
            }
        }
    }
}


