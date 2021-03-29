package com.nology;

import java.util.*;

public class CardGame {
    public String name;
    private List<Card> deckOfCards = new ArrayList<Card>();
    String[] symbol = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] suit = {"\u2660", "\u2665", "\u2666", "\u2663"};
    int value = 0;

    public CardGame(String name) {
        this.name = name;
        getDeck();
    }

    public List<Card> getDeck(){
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < symbol.length; j++) {
                this.deckOfCards.add(new Card(suit[i], symbol[j]));
            }
            sortDeckInSymbolOrder();
//            sortDeckIntoSuits();
//            shuffleDeck();
        }
        listCards();

        return deckOfCards;
    }

    public void listCards() {
        for (Card card : deckOfCards) {
            value++;
            System.out.println("Card " + value + ": " + card);
        }
    }

    public Card dealCard() {
        return deckOfCards.stream().findFirst().orElse(null);
    }

    public void sortDeckInSymbolOrder() {
        deckOfCards.sort(Comparator.comparing(Card::getSymbol));
    }

    public void sortDeckIntoSuits() {
        deckOfCards.sort(Comparator.comparing(Card::getSuit));
    }

    public void shuffleDeck() {
        Collections.shuffle(deckOfCards);
    }

    @Override
    public String toString() {
        return "CardGame{" +
                "name='" + name + "}";
    }
}
