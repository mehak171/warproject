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
      
        Deck deck = new Deck();
        Collections.shuffle(deck.getCards()); 
      
        ArrayList<Player> players = getPlayers();
        int playerIndex = 0;
        while (!deck.isEmpty()) {
            players.get(playerIndex % players.size()).receiveCard(deck.draw());
            playerIndex++;
        }

      
        boolean gameContinue = true;
        while (gameContinue) {
            ArrayList<Card> playedCards;
            playedCards = new ArrayList<>();
            for (Player player : players) {
                if (player.hasCards()) {
                    Card playedCard = player.playCard();
                    playedCards.add(playedCard);
                    System.out.println(player.getName() + " plays " + playedCard);
                }
            }
            

        
        }
        if(!players.isEmpty()){
        while(!deck.isEmpty()){
            players.get(playerIndex % players.size()).receiveCard(deck.draw());
            playerIndex++;
        }
        }else{
                System.out.println("No players have been added to the game.");}
        
        
    }
    
public void addPlayer(Player player) {
    getPlayers().add(player);
}
    @Override
    public void declareWinner() {
   
        ArrayList<Player> players = getPlayers();
        Player winner = players.get(0); 
        System.out.println("Winner is " + winner.getName());
    }

}

