/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

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
    final int maxRounds = 26;
    int currentRound = 0;
    
   
    ArrayList<Card> tempPile;

    while (players.get(0).hasCards() && players.get(1).hasCards() && currentRound < maxRounds) {
        currentRound++;
        System.out.println("\n---- Round " + currentRound + " of " + maxRounds + " ----");
        tempPile = new ArrayList<>();
        ArrayList<Card> playedCards = new ArrayList<>();

        for (Player player : players) {
            Card playedCard = player.playCard();
            if (playedCard != null) {
                playedCards.add(playedCard);
                 tempPile.add(playedCard);
                System.out.println(player.getName() + " plays: " + playedCard.toString());
            }
        }

        if (playedCards.size() == 2) { 
            int compare = playedCards.get(0).getValue() - playedCards.get(1).getValue();

            if (compare > 0) {
         players.get(0).receiveCards(tempPile);
    ((WarPlayer)players.get(0)).incrementRoundsWon(); 
    System.out.println(players.get(0).getName() + " Wins this round!");
} else if (compare < 0) {
    players.get(1).receiveCards(tempPile);
    ((WarPlayer)players.get(1)).incrementRoundsWon(); 
    System.out.println(players.get(1).getName() + " Wins this round!");
} else {
        System.out.println("This round is a tie, initiating war!");
             handleWar(tempPile);
               
            }
        }

        
        System.out.println("Current Score: [ " + players.get(0).getName() + ": " + ((WarPlayer)players.get(0)).getRoundsWon() + " ] [ " + players.get(1).getName() + ": " + ((WarPlayer)players.get(1)).getRoundsWon() + " ]");


   
    displayRemainingCards();
}
    
    declareWinner();
}
private void handleWar(ArrayList<Card> tempPile) {
    System.out.println("This round is a tie, initiating war!");
    
    while (true) {
        ArrayList<Card> warCards = new ArrayList<>();
        for (int i = 0; i < 2; i++) { 
            if (!players.get(i).hasCards()) {
                System.out.println(players.get(i).getName() + " cannot continue the war! Running out of cards!");
                return; 
            }
     Card card = players.get(i).playCard();
            warCards.add(card);
            tempPile.add(card); // Add drawn cards to the temp pile
            System.out.println(players.get(i).getName() + " draws for war: " + card.toString());
        }
      int compare = warCards.get(0).getValue() - warCards.get(1).getValue();
        if (compare > 0) {
            players.get(0).receiveCards(tempPile);
            ((WarPlayer)players.get(0)).incrementRoundsWon(); 
            System.out.println(players.get(0).getName() + " wins the war and gains " + tempPile.size() + " cards!");
            break; // Player 0 wins the war
        } else if (compare < 0) {
            players.get(1).receiveCards(tempPile);
            ((WarPlayer)players.get(1)).incrementRoundsWon(); 
            System.out.println(players.get(1).getName() + " wins the war and gains " + tempPile.size() + " cards!");
            break; 
        } else {
            System.out.println("The war continues!");
        }
    }
}
    
   

private void displayRemainingCards() {
    for (Player player : players) {
        System.out.println(player.getName() + " has " + ((WarPlayer)player).getDeckSize() + " remaining cards.");
    }
    
}



    public void declareWinner() {
    ArrayList<Player> players = getPlayers();
    int player1RoundsWon = ((WarPlayer) players.get(0)).getRoundsWon();
    int player2RoundsWon = ((WarPlayer) players.get(1)).getRoundsWon();

    System.out.println("\n---- FINAL SCORES ----");
    System.out.println(players.get(0).getName() + ": " + player1RoundsWon);
    System.out.println(players.get(1).getName() + ": " + player2RoundsWon);

    if (player1RoundsWon > player2RoundsWon) {
        System.out.println("*** " + players.get(0).getName() + " Wins! Congratulations! ***");
    } else if (player2RoundsWon > player1RoundsWon) {
        System.out.println("*** " + players.get(1).getName() + " Wins! Congratulations! ***");
    } else {
        System.out.println("*** The game is a draw! ***");
    }
}
}
