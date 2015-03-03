/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ratk;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AUMEN
 */
public class GeninTest {
    
    public GeninTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of test_ninjutsu method, of class Genin.
     */
    @Test
    public void testTest_ninjutsu() {
        System.out.println("test_ninjutsu");
        Genin instance = new Genin();
        instance.test_ninjutsu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNinjaName method, of class Genin.
     */
    @Test
    public void testGetNinjaName() {
        System.out.println("getNinjaName");
        Genin instance = new Genin();
        String expResult = "";
        String result = instance.getNinjaName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPower method, of class Genin.
     */
    @Test
    public void testGetPower() {
        System.out.println("getPower");
        Genin instance = new Genin();
        String expResult = "";
        String result = instance.getPower();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStrength method, of class Genin.
     */
    @Test
    public void testGetStrength() {
        System.out.println("getStrength");
        Genin instance = new Genin();
        int expResult = 0;
        int result = instance.getStrength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNinjaName method, of class Genin.
     */
    @Test
    public void testSetNinjaName() {
        System.out.println("setNinjaName");
        String ninja_name = "";
        Genin instance = new Genin();
        instance.setNinjaName(ninja_name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPower method, of class Genin.
     */
    @Test
    public void testSetPower() {
        System.out.println("setPower");
        String ninja_name = "";
        Genin instance = new Genin();
        instance.setPower(ninja_name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStrength method, of class Genin.
     */
    @Test
    public void testSetStrength() {
        System.out.println("setStrength");
        int strength = 0;
        Genin instance = new Genin();
        instance.setStrength(strength);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of entreinementNinjustu method, of class Genin.
     */
    @Test
    public void testEntreinementNinjustu() {
        System.out.println("entreinementNinjustu");
        Genin naruto = null;
        Genin instance = new Genin();
        instance.entreinementNinjustu(naruto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}