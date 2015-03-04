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
    
        Konoha_village instance = new Konoha_village();
        
    @Test
    public void testGetNinjas() {
        System.out.println("getNinjas");
    }

    /**
     * Test of setNinjas method, of class Konoha_village.
     */
    @Test
    public void testSetNinjas() {
        System.out.println("setNinjas");
    }

    /**
     * Test of getBus method, of class Konoha_village.
     */
    @Test
    public void testGetBus() {
        System.out.println("getBus");
    }

    /**
     * Test of setBus method, of class Konoha_village.
     */
    @Test
    public void testSetBus() {
        System.out.println("setBus");
    }

    /**
     * Test of ajouterBus method, of class Konoha_village.
     */
    @Test
    public void testAjouterBus() {
        System.out.println("AjouterBus");
        instance.ajouterBus(5,23,15);
        int expresult=5;
        int result=instance.Bus.get(0).getId_bus();
        assertEquals(expresult,result);
    }

    /**
     * Test of supprimerBus method, of class Konoha_village.
     */
    @Test
    public void testSupprimerBus() {
        System.out.println("supprimerBus");
        instance.supprimerBus(5);
        int expResult=0;
        int result=instance.Bus.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of nouveau_ninja_a_Konoha method, of class Konoha_village.
     */
    @Test
    public void testNouveau_ninja_a_Konoha() {
        System.out.println("nouveau_ninja_a_Konoha");
        boolean expResult = true;
        boolean result = instance.nouveau_ninja_a_Konoha("nom", "force", 10);
        assertEquals(expResult, result);
    }
}