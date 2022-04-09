import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        showMenu();
    }

    //Metodo de acceso a menu de Deck
    public static void showMenu() throws Exception{
        Deck baraja1 = new Deck();
        baraja1.getBaraja();

        Scanner entrada = new Scanner(System.in);
        int opcion;
        boolean condicion = false;

        while(!condicion) {
            try{
            System.out.println("Bienvenido a Poker!\n"
                    + "1 Mezclar deck\n"
                    + "2 Sacar una carta\n"
                    + "3 Carta al azar\n"
                    + "4 Generar una mano de 5 cartas\n"
                    + "0 salir");
            System.out.println("Eliga una opción: ");
            opcion = entrada.nextInt();

            if(opcion > 4 || opcion < 0) throw new Exception("Opción no válida");

            switch (opcion) {
                case 0:
                    System.out.println("Programa Finalizado");
                    condicion = true;
                    break;
                case 1:
                    baraja1.getShuffle();
                    break;
                case 2:
                    baraja1.getHead();
                    break;
                case 3:
                    baraja1.getPick();
                    break;
                case 4:
                    baraja1.getHand();
                    break;
            }
        } catch (InputMismatchException e){
                System.out.println("Opción no válida");
                entrada.next();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}


