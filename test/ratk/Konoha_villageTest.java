/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ratk;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AUMEN
 */
public class Konoha_villageTest {
    
    public Konoha_villageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getNinjas method, of class Konoha_village.
     */
    @Test
    public void testGetNinjas() {
        System.out.println("getNinjas");
        Konoha_village instance = new Konoha_village();
        List expResult = null;
        List result = instance.getNinjas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNinjas method, of class Konoha_village.
     */
    @Test
    public void testSetNinjas() {
        System.out.println("setNinjas");
        List<Genin> Ninjas = null;
        Konoha_village instance = new Konoha_village();
        instance.setNinjas(Ninjas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBus method, of class Konoha_village.
     */
    @Test
    public void testGetBus() {
        System.out.println("getBus");
        Konoha_village instance = new Konoha_village();
        List expResult = null;
        List result = instance.getBus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBus method, of class Konoha_village.
     */
    @Test
    public void testSetBus() {
        System.out.println("setBus");
        List<Autobus> Bus = null;
        Konoha_village instance = new Konoha_village();
        instance.setBus(Bus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterBus method, of class Konoha_village.
     */
    @Test
    public void testAjouterBus() {
        System.out.println("ajouterBus");
        Autobus b = null;
        Konoha_village instance = new Konoha_village();
        instance.ajouterBus(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supprimerBus method, of class Konoha_village.
     */
    @Test
    public void testSupprimerBus() {
        System.out.println("supprimerBus");
        int idBus = 0;
        Konoha_village instance = new Konoha_village();
        instance.supprimerBus(idBus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nouveau_ninja_a_Konoha method, of class Konoha_village.
     */
    @Test
    public void testNouveau_ninja_a_Konoha() {
        System.out.println("nouveau_ninja_a_Konoha");
        String name_ninja = "";
        String power = "";
        int strength = 0;
        Konoha_village instance = new Konoha_village();
        boolean expResult = false;
        boolean result = instance.nouveau_ninja_a_Konoha(name_ninja, power, strength);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}