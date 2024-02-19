/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;
import java.util.Collections;
import java.util.ArrayList;
/**
 *
 * @author mehak
 */
public class WarGame extends Game {
      public WarGame(String name) {
        super(name);
    }

    @Override
    public void play() {
        // Assuming the deck is a previously defined Deck object containing a standard 52-card deck
        Deck deck = new Deck();
        Collections.shuffle(deck.getCards()); // Ensure the deck is shuffled before dealing

        // Evenly distribute cards to players
        ArrayList<Player> players = getPlayers();
        int playerIndex = 0;
        while (!deck.isEmpty()) {
            players.get(playerIndex % players.size()).receiveCard(deck.draw());
            playerIndex++;
        }

        // Play rounds until one player has all the cards or a predefined condition is met
        boolean gameContinue = true;
        while (gameContinue) {
            ArrayList<Card> playedCards = new ArrayList<>();
            for (Player player : players) {
                if (player.hasCards()) {
                    Card playedCard = player.playCard();
                    playedCards.add(playedCard);
                    System.out.println(player.getName() + " plays " + playedCard);
                }
            }

        
        }
    }

    @Override
    public void declareWinner() {
   
        ArrayList<Player> players = getPlayers();
        Player winner = players.get(0); 
        System.out.println("Winner is " + winner.getName());
    }
}

