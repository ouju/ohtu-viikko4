/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtuesimerkki;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Outi
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ohtuesimerkki.MainTest.class, ohtuesimerkki.ReaderTest.class, ohtuesimerkki.PlayerReaderTest.class, ohtuesimerkki.StatisticsTest.class, ohtuesimerkki.PlayerTest.class})
public class OhtuesimerkkiSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
