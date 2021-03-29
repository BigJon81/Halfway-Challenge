package com.nology;

import java.util.Collections;
import static java.util.Collections.shuffle;

public class Main {

    public static void main(String[] args) {
	    CardGame poker = new CardGame("Poker");
        System.out.println(poker);
        System.out.println(poker.dealCard());
    }
}
