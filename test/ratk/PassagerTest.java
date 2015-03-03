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
public class PassagerTest {
    
    public PassagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of estAssis method, of class Passager.
     */
    @Test
    public void testEstAssis() {
        System.out.println("estAssis");
        Passager instance = new Passager();
        boolean expResult = false;
        boolean result = instance.estAssis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estDehors method, of class Passager.
     */
    @Test
    public void testEstDehors() {
        System.out.println("estDehors");
        Passager instance = new Passager();
        boolean expResult = false;
        boolean result = instance.estDehors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of accepterPlace method, of class Passager.
     */
    @Test
    public void testAccepterPlace() {
        System.out.println("accepterPlace");
        Passager instance = new Passager();
        instance.accepterPlace();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of accepterSortie method, of class Passager.
     */
    @Test
    public void testAccepterSortie() {
        System.out.println("accepterSortie");
        Passager instance = new Passager();
        instance.accepterSortie();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nouvelArret method, of class Passager.
     */
    @Test
    public void testNouvelArret() {
        System.out.println("nouvelArret");
        Autobus bus = null;
        int arret = 0;
        Passager instance = new Passager();
        instance.nouvelArret(bus, arret);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of monterDans method, of class Passager.
     */
    @Test
    public void testMonterDans() {
        System.out.println("monterDans");
        Autobus bus = null;
        Passager instance = new Passager();
        instance.monterDans(bus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Passager.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Passager instance = new Passager();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}