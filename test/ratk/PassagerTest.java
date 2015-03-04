/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ratk;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author AUMEN
 */
public class PassagerTest {
    
    public PassagerTest() {
    }
    
    
     Autobus bus;
     Passager instance;
     
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
       
          bus =new Autobus(1,10,5) ;
     instance= new Passager ("aymen",3);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of estAssis method, of class Passager.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setNbPassagers");
         instance.setDestination(4);
        assertTrue(instance.getDestination() == 4);
    }
    
      @Test
    public void testSetEtat() {
        System.out.println("setNbPassagers");
         instance.setEtat(1);
        assertTrue(instance.getEtat() == 1);
    }
     
    @Test
    public void testEstAssis() {
        System.out.println("estAssis");
        boolean expResult = false;
        boolean result = instance.estAssis();
        assertEquals(expResult, result);
    }

    /**
     * Test of estDehors method, of class Passager.
     */
    @Test
    public void testEstDehors() {
        System.out.println("estDehors");
        boolean expResult = true;
        boolean result = instance.estDehors();
        assertEquals(expResult, result);
    }

    /**
     * Test of accepterPlace method, of class Passager.
     */
    @Test
    public void testAccepterPlace() {
        System.out.println("accepterPlace");
        int expResult=1;
        instance.accepterPlace();
        assertEquals(expResult, instance.getEtat());
    }

    /**
     * Test of accepterSortie method, of class Passager.
     */
    @Test
    public void testAccepterSortie() {
        System.out.println("accepterSortie");
        int expResult=0;
        instance.accepterSortie();
        assertEquals(expResult, instance.getEtat());
    }   

    /**
     * Test of nouvelArret method, of class Passager.
     */
    @Test
    public void testNouvelArret() {
        System.out.println("nouvelArret");
       
        int arret = 3;
        
        instance.nouvelArret(bus, arret);
        
        assertTrue("passager est arrivé à destination",  arret==instance.getDestination()) ;
        
        
    }

    /**
     * Test of monterDans method, of class Passager.
     */
    @Test
    public void testMonterDans() {
        System.out.println("monterDans");
    
        instance.monterDans(bus);
       
      assertTrue( "monter dans le bus",  bus.aPlace()) ;
    
    }

    /**
     * Test of toString method, of class Passager.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String a=instance.toString();
        assertTrue(a.equals("Passager{Nom=aymen, Destination=3}"));
    }
}