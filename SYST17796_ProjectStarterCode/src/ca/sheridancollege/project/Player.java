/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author mehak dhalimeh
 */
public abstract class Player {
    private String name; //the unique name for this player

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
     public Player(String name) {
        this.name = name;
    }
    /**
     * @return the player name
     */
       public String getName() {
        return name;
    }


    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
      public void setName(String name) {
        this.name = name;
    }


    public abstract void play();

    public abstract void receiveCard(Card card); // Method to receive a card
    public abstract boolean hasCards(); // Method to check if the player has cards
    public abstract Card playCard(); // Method to play a card
}