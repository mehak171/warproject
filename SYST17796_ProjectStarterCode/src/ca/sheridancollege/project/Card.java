/*
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 * @author mehakdeep dhalimeh 
 * @date 19 Feb 2023
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public  class Card {
    priate String suit; 
    private int value;
    //default modifier for child classes
    public Card(String suit, int value) {
      this.suit = suit;
      this.value = value;
    }
    *@return
    public String getSuit() {
        return suit;
    }
    *@return
    public int getValue() {
        return value;
    }
    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    @Override
    public  String toString( String valueString;
        switch (value) {
            case 11:
                valueString = "Jack";
                break;
            case 12:
                valueString = "Queen";
                break;
            case 13:
                valueString = "King";
                break;
            case 14:
                valueString = "Ace";
                break;
            default:
                valueString = String.valueOf(value);
                break;
        }
        return valueString + " of " + suit;
    }
);

}
