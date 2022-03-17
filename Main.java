import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Deck baraja1 = new Deck();
        System.out.println("Baraja inicial:");
        for(String i:baraja1.getBaraja()){
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Cartas barajeadas");

       for(String i: baraja1.getShuffle()){
           System.out.println(i);
       }

       System.out.println();
       System.out.println("Carta de inicio:");
       baraja1.getHead();

       System.out.println();
       System.out.println("Cartas restantes:");
       for(String i: baraja1.barajaRandom){
           System.out.println(i);
       }

       System.out.println();
       System.out.println("Escogida al azar");
       baraja1.getPick();

        System.out.println();
        System.out.println("Cartas restantes: ");
        for(String i: baraja1.barajaRandom){
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Tu mano de 5 cartas: ");
        baraja1.getHand();

        System.out.println();
        System.out.println("Cartas restantes: ");
        for(String i: baraja1.barajaRandom){
            System.out.println(i);
        }










    }
}
