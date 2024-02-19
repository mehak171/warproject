/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;
import java.util.Scanner;/**
 *
 * @author mehak
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        WarGame game = new WarGame("War Card Game");

     
        System.out.print("Enter Player 1's name: ");
        String player1Name = scanner.nextLine(); 
        String player2Name = "Param"; //


        WarPlayer player1 = new WarPlayer(player1Name);
        WarPlayer player2 = new WarPlayer(player2Name);

        // Add players to the game
        game.addPlayer(player1);
        game.addPlayer(player2);

        Deck deck = new Deck();
        deck.shuffle();

      
        while (!deck.isEmpty()) {
            player1.addCardToDeck(deck.draw());
            if (!deck.isEmpty()) {
                player2.addCardToDeck(deck.draw());
            }
        }

      
        game.play();

        scanner.close();
    } 
}
