/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Outi
 */
public class StatisticsTest {
    
    Statistics stats;
    Reader readerStub = new Reader() {

        @Override
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();
            
            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };
    
    public StatisticsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of search method, of class Statistics.
     */
    @Test
    public void testSearchFound() {
        System.out.println("search");
        String name = "Semenko";
        Statistics instance = new Statistics(readerStub);
        Player expResult = instance.firstPlayer();
        System.out.println(instance.getSize());
        System.out.println(instance.firstPlayer());
        Player result = instance.search(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSearchNull() {
        System.out.println("search");
        Statistics instance = new Statistics(readerStub);
        Player testi = new Player("Pavel", "Lel", 1, 1);
        //this.stats = new Statistics(readerStub);
        String name = "Pavel";
        Player expResult = testi;
        Player result = instance.search(name);
        assertEquals(null, result);
    }
    /**
     * Test of team method, of class Statistics.
     */
    @Test
    public void testTeam() {
        System.out.println("team");
        String teamName = "";
        Statistics instance = null;
        List<Player> expResult = null;
        List<Player> result = instance.team(teamName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of topScorers method, of class Statistics.
     */
    @Test
    public void testTopScorers() {
        System.out.println("topScorers");
        int howMany = 0;
        Statistics instance = null;
        List<Player> expResult = null;
        List<Player> result = instance.topScorers(howMany);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
