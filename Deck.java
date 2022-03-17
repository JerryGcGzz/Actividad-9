import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Deck {
    List <String> baraja = new ArrayList<>(52);
    List <String> barajaRandom = new ArrayList<>(52);

    Random randomNumbers = new Random();



    //Método para llenar baraja o deck
    public List<String> getBaraja() {
        String [] Color = {"Negro","Rojo"};
        String [] Palo = {"Treboles","Picas","Corazones","Diamantes"};
        String [] Valor = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        for(int i=0; i<52; i++) {
            if (i < 26) {
                baraja.add(new Card(Color[0], Palo[i/13], Valor[i%13]).toString());
            } else {
                baraja.add(new Card(Color[1], Palo[i/13], Valor[i%13]).toString());
            }
        }
        return baraja;
    }

    //Método para barajear las cartas
    public List<String> getShuffle(){
        int [] numbers = new int[52];
        for(int i=0; i<52; i++){
            numbers[i] = i;
        }

        for(int i=0; i<52; i++) {
            int aleatorio =(int) (Math.random()*10);

            int temp = numbers[i];
            numbers[i] = numbers[aleatorio];
            numbers[aleatorio] = temp;
        }

        for(int i=0; i<52; i++){
            barajaRandom.add(baraja.get(numbers[i]));
        }
        return barajaRandom;
    }

    //Metodo para sacar tarjeta del principio de la baraja y eliminarla del deck
    public void getHead (){
        System.out.println(barajaRandom.get(0));
        barajaRandom.remove(0);
        System.out.print("Quedan: "+barajaRandom.size()+" cartas");
    }

    //Metdo para sacar una tarjeta al azar y eliminarla del deck
    public void getPick(){
        int aleatorio2 = randomNumbers.nextInt(0, 51);
        System.out.println(barajaRandom.get(aleatorio2));
        barajaRandom.remove(aleatorio2);
        System.out.println("Quedan: "+barajaRandom.size()+" cartas");
    }

    //Metodo para sacar 5 cartas del deck
    public void getHand(){
        int index=0;
        for(int i=0; i<5; i++) {
            System.out.println(barajaRandom.get(index));
            barajaRandom.remove(index);
        }
        System.out.println("Quedan: "+barajaRandom.size()+" cartas");;
    }

}
