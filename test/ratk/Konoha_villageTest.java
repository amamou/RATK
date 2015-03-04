/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ratk;

import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author AUMEN
 */
public class Konoha_villageTest {
    
    public Konoha_villageTest() {
    }
     Konoha_village instance;
    @BeforeClass
    public static void setUpClass() {
          
    }
    
     @Before
    public void setUp() {
       instance = new Konoha_village();
         
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
       
        instance.nouveau_ninja_a_Konoha("aymen", "Magic", 50);
        

        String result=instance.getNinjas().get(0).getNom();
      
         assertTrue(result.equals("aymen"));
        
    }

    /**
     * Test of setNinjas method, of class Konoha_village.
     */
    @Test
    public void testSetNinjas() {
        System.out.println("setNinjas");
         instance.nouveau_ninja_a_Konoha("aymen", "Magic", 50);
         String name=instance.getNinjas().get(0).getNom();
         assertTrue(name.equals("aymen"));
        
        
    
    }

    /**
     * Test of getBus method, of class Konoha_village.
     */
    @Test
    public void testGetBus() {
        System.out.println("getBus");
        instance.ajouterBus(1, 10, 15);
        int result=instance.getBus().get(0).getId_bus();
          assertTrue(result==1);
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
        System.out.println("Ajouter nouveau ninja dans le village");
        boolean expResult = true;
        boolean result = instance.nouveau_ninja_a_Konoha("nom", "force", 10);
        assertEquals(expResult, result);
    }
}