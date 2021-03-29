package com.nology;

public class Card {
    private String suit;
    private String symbol;
    int value[];

    public Card(String suit, String symbol) {
        this.suit = suit;
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "{" + symbol + " of " + suit + "'s }";
    }
}
