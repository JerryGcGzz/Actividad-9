public class Card {
    String Color;
    String Palo;
    String Valor;

    public Card (String colorCard, String paloCard, String valorCard){
        Color = colorCard;
        Palo = paloCard;
        Valor = valorCard;
    }

    public String toString(){
        return "{"+Color+"}"+","+"{"+Palo+"}"+","+"{"+Valor+"}";
    }
}
