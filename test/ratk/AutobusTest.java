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
    
     Autobus instance =new Autobus(1,10,5) ;
     Passager p= new Passager ("aymen",3);
     
       
     
    @Test
    public void testGetId_bus() {
        System.out.println("getId_bus");
       
        int expResult = 1;
        int result = instance.getId_bus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of setId_bus method, of class Autobus.
     */
    @Test
    public void testSetId_bus() {
       
    }

    /**
     * Test of allerArretSuivant method, of class Autobus.
     */
    @Test
    public void testAllerArretSuivant() {
        System.out.println("allerArretSuivant");
       
         int expResult = 4;
         int result = instance.getArret();
        assertEquals(expResult, result);
       
 
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
       
    }

    /**
     * Test of demanderSortie method, of class Autobus.
     */
    @Test
    public void testDemanderSortie() {
        System.out.println("demanderSortie");
        
        instance.demanderSortie(p);
        
        
     
    }

    /**
     * Test of aPlace method, of class Autobus.
     */
    @Test
    public void testAPlace() {
        System.out.println("aPlace");
      
        boolean expResult = true;
        boolean result = instance.aPlace();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getArret method, of class Autobus.
     */
    @Test
    public void testGetArret() {
        System.out.println("getArret");
         instance.setArret(3);
        int expResult = 3;
        int result = instance.getArret();
        assertEquals(expResult, result);     }
     /**
     * Test of getArret method, of class Autobus.
     */
    @Test public void testGetNbArrets() {
        System.out.println("getNbArrets");
       
        int expResult = 5;
        int result = instance.getNbArrets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of toString method, of class Autobus.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
       
       
        
    }
}