/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mehak
 */
public class DeckTest {
    
    public DeckTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

   /**
     * Test of draw method, of class Deck.
     */
    @Test
    public void testDrawFromFullDeck() {
        System.out.println("drawFromFullDeck   Good");
        Deck instance = new Deck();
        Card result = instance.draw();
        assertNotNull(result);
        assertEquals(51,instance.size());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   @org.junit.jupiter.api.Test
   public void testDrawFromEmptyDeck() {
        System.out.println("drawFromEmptyDeck   Bad ");
        Deck instance = new Deck();
        for(int i = 0; i < 52; i++) {
        instance.draw();
    }
        Card result = instance.draw();
        assertNotNull(result);
        assertEquals(0,instance.size());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   @org.junit.jupiter.api.Test
 
   public void testDrawFromLastDeck() {
        System.out.println("drawFromLastDeck   Boundary");
        Deck instance = new Deck();
        for(int i = 0; i < 51; i++) {
        instance.draw();
    }
        Card result = instance.draw();
        assertNotNull(result);
        assertEquals(0,instance.size());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
