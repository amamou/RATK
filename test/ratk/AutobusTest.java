/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ratk;

import java.util.List;
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
    
    
     Autobus instance;
     Passager p;
     
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        p= new Passager ("aymen",3);
        instance =new Autobus(1,10,5) ;
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
       instance.setId_bus(3);
        assertTrue(instance.getId_bus() == 3);
    }
    /**
     * Test of allerArretSuivant method, of class Autobus.
     */
    @Test
    public void testAllerArretSuivant() {
         int expResult = 1;
         instance.allerArretSuivant();
        assertEquals(expResult, instance.getArret());
    }
    /**
     * Test of demanderPlaceAssise method, of class Autobus.
     */
    @Test
    public void testDemanderPlaceAssise() {
        System.out.println("demanderPlaceAssise");
        instance.demanderPlaceAssise(p);
       int result= instance.getPlaces();
         int result2  =instance.getNbPassagers();
          assertEquals(9, result);
        assertEquals(1, result2);
    }
    /**
     * Test of demanderSortie method, of class Autobus.                                                                        
     */
    @Test
    public void testDemanderSortie() {
        System.out.println("demanderSortie");
         p.monterDans(instance);
        instance.demanderSortie(p);
        int nb_p=instance.getNbPassagers();
         assertEquals(0, nb_p);
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

      @Test
    public void testSetArret() {
        System.out.println("setArret");
            instance.setArret(4);
        assertTrue(instance.getArret() == 4);
      
    }
      
       @Test
    public void testSetNbArrets() {
        System.out.println("setNbArrets");
        instance.setNbArrets(20);
        assertTrue(instance.getNbArrets() == 20);
    }
       
          @Test
    public void testSetPlaces() {
        System.out.println("setPlaces");
         instance.setPlaces(8);
        assertTrue(instance.getPlaces() == 8);
    }

              @Test
    public void testSetPassagers() {
        System.out.println("setPassagers");
       p.monterDans(instance);
       String nom=instance.getPassagers().get(0).getNom();
       assertTrue(nom.equals("aymen"));
        
    }
              
                  @Test
    public void testSetNbPassagers() {
        System.out.println("setNbPassagers");
         instance.setNbPassagers(5);
        assertTrue(instance.getNbPassagers() == 5);
    }
      
    /**
     * Test of toString method, of class Autobus.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
       
       assertTrue(instance.toString().equals("Autobus{id_bus=1, Arret=0, NbArrets=5, Places=10, Passagers=[], NbPassagers=0}"));
        
    }
}