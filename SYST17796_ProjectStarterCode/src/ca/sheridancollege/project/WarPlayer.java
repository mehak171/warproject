/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;
import java.util.LinkedList;
import java.util.Queue;

public class WarPlayer extends Player {
    private Queue<Card> deck = new LinkedList<>();
    
    @Override
public void receiveCard(Card card) {
    this.deck.add(card);
}


    public WarPlayer(String name) {
        super(name);
    }

    public void addCardToDeck(Card card) {
        deck.add(card);
    }

    @Override
    public void play() {
      
    }
    @Override
    public Card playCard() {
        return deck.poll();
    }

    @Override
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
