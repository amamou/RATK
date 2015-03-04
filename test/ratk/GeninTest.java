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
    Genin instance = new Genin("Naruto","power",15);
    
    @Test
    public void testTest_ninjutsu() {
        boolean expResult=true;
        boolean result=instance.test_ninjutsu();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNinjaName method, of class Genin.
     */
    @Test
    public void testGetNinjaName() {
        System.out.println("getNinjaName");
             assertTrue(instance.getNom().equals("Naruto"));
          
        
    }

    /**
     * Test of getPower method, of class Genin.
     */
    @Test
    public void testGetPower() {
        System.out.println("getPower");
         assertTrue(instance.getPower().equals("power"));
          
    
    }

    /**
     * Test of getStrength method, of class Genin.
     */
    @Test
    public void testGetStrength() {
        System.out.println("getStrength");
         assertTrue(instance.getStrength()==15);
    }

    /**
     * Test of setNinjaName method, of class Genin.
     */
    @Test
    public void testSetNinjaName() {
        System.out.println("setNinjaName");
         Genin instance2 = new Genin();
         instance2.setNom("Hamza");
        assertTrue(instance2.getNom().equals("Hamza"));
        
    }

    /**
     * Test of setPower method, of class Genin.
     */
    @Test
    public void testSetPower() {
        
         Genin instance2 = new Genin();
           instance2.setPower("Fatality");
        assertTrue(instance2.getPower().equals("Fatality"));
    }

    /**
     * Test of setStrength method, of class Genin.
     */
    @Test
    public void testSetStrength() {
        System.out.println("setStrength");
         Genin instance2 = new Genin();
             instance2.setStrength(16);
        assertTrue(instance2.getStrength() == 16);
    }

    /**
     * Test of entreinementNinjustu method, of class Genin.
     */
    @Test
    public void testEntreinementNinjustu() {
        System.out.println("entreinementNinjustu");
        int expResult=16;
        instance.entreinementNinjustu();
        int result=instance.getStrength();
        assertEquals(expResult, result);
        
}
}