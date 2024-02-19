/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author mehak
 */
public class WarPlayer extends Player {
    private Queue<Card> deck = new LinkedList<>(); 

    public WarPlayer(String name) {
        super(name);
    }

  
    public void addCardToDeck(Card card) {
        deck.add(card);
    }

    public Card play() {
        return deck.poll();
    }

 
    public boolean hasCards() {
        return !deck.isEmpty();
    }


    public int getDeckSize() {
        return deck.size();
    }


    public void addCardsToDeck(Queue<Card> cards) {
        deck.addAll(cards);
    }
}
}
