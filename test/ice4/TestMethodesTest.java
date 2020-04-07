/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ankur
 */
public class TestMethodesTest {
    
    public TestMethodesTest() {
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

    @Test
    public void testCharOucc() {
        System.out.println("CharOucc");
        String str = "";
        char ch = ' ';
        TestMethodes instance = new TestMethodes();
        instance.CharOucc(str, ch);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMaxChar() {
        System.out.println("MaxChar");
        String string = "";
        TestMethodes instance = new TestMethodes();
        instance.MaxChar(string);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCharExists() {
        System.out.println("CharExists");
        String str1 = "";
        char ch1 = ' ';
        TestMethodes instance = new TestMethodes();
        boolean expResult = false;
        boolean result = instance.CharExists(str1, ch1);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
