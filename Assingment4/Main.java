package Assingment4;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.createDeck();
        deck.showCards();
        deck.shuffleDeck();
        System.out.println("");
        deck.shuffleDeck();
        deck.showCards();
        System.out.println(deck.topCard());
    }
}