/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ratk;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AUMEN
 */
public class AutobusTest {
    
    public AutobusTest() {
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
     * Test of getId_bus method, of class Autobus.
     */
    @Test
    public void testGetId_bus() {
        System.out.println("getId_bus");
        Autobus instance = null;
        int expResult = 0;
        int result = instance.getId_bus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_bus method, of class Autobus.
     */
    @Test
    public void testSetId_bus() {
        System.out.println("setId_bus");
        int id_bus = 0;
        Autobus instance = null;
        instance.setId_bus(id_bus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allerArretSuivant method, of class Autobus.
     */
    @Test
    public void testAllerArretSuivant() {
        System.out.println("allerArretSuivant");
        Autobus instance = null;
        instance.allerArretSuivant();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of demanderPlaceAssise method, of class Autobus.
     */
    @Test
    public void testDemanderPlaceAssise() {
        System.out.println("demanderPlaceAssise");
        Passager p = null;
        Autobus instance = null;
        instance.demanderPlaceAssise(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of demanderSortie method, of class Autobus.
     */
    @Test
    public void testDemanderSortie() {
        System.out.println("demanderSortie");
        Passager p = null;
        Autobus instance = null;
        instance.demanderSortie(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aPlace method, of class Autobus.
     */
    @Test
    public void testAPlace() {
        System.out.println("aPlace");
        Autobus instance = null;
        boolean expResult = false;
        boolean result = instance.aPlace();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArret method, of class Autobus.
     */
    @Test
    public void testGetArret() {
        System.out.println("getArret");
        Autobus instance = null;
        int expResult = 0;
        int result = instance.getArret();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArret method, of class Autobus.
     */
    @Test
    public void testSetArret() {
        System.out.println("setArret");
        int a = 0;
        Autobus instance = null;
        instance.setArret(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNbArrets method, of class Autobus.
     */
    @Test
    public void testSetNbArrets() {
        System.out.println("setNbArrets");
        int a = 0;
        Autobus instance = null;
        instance.setNbArrets(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNbArrets method, of class Autobus.
     */
    @Test
    public void testGetNbArrets() {
        System.out.println("getNbArrets");
        Autobus instance = null;
        int expResult = 0;
        int result = instance.getNbArrets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Autobus.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Autobus instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}