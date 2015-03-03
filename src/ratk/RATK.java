/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ratk;

/**
 *
 * @author AUMEN
 */
import ratk.Konoha_village;

public class RATK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
  
    Autobus dauphine = new Autobus(1,6, 10);

    Passager aymen = new Passager("aymen", 5);

    dauphine.allerArretSuivant();
    // debogue
    System.out.println(dauphine);

    aymen.monterDans(dauphine);

    Passager hamza = new Passager("hamza", 4);
    hamza.monterDans(dauphine);

    dauphine.allerArretSuivant();
    // debogue
    System.out.println(dauphine);
    System.out.println(aymen);
    System.out.println(hamza);

    Passager anissa = new Passager("Anissa", 5);
    anissa.monterDans(dauphine);

    dauphine.allerArretSuivant();
    // debogue
  
    System.out.println(dauphine);
    
    System.out.println(aymen);
    System.out.println(hamza);
    System.out.println(anissa);

    dauphine.allerArretSuivant();
    // debogue
    System.out.println(dauphine);
    System.out.println(aymen);
    System.out.println(hamza);
    System.out.println(anissa);

    dauphine.allerArretSuivant();
    // debogue
    System.out.println(dauphine);
    System.out.println(aymen);
    System.out.println(hamza);
    System.out.println(anissa);
  

    
    
    
    // test création genin and konoha village
        Genin Sakura=new Genin("Sakura","Sharingan",28);
        System.out.println(Sakura.getNom() + " ninja veut faire partie de Konoha");
        Konoha_village Konoha=new Konoha_village();
        boolean accepted=Konoha.nouveau_ninja_a_Konoha("Sakura","Sharingan",28);
        System.out.println(" le ninja est il accepté au sein de Konoha? " + accepted);
        
          Genin naruto=new Genin("Naruto","razengan",2);
        System.out.println("un nouveu ninja rejoint Konoha, il s'apel "+naruto.getNom()+" et son pouvoir est "+naruto.getPower());
        System.out.println("\n Ce ninja est il digne du rang Genin,  a t il reussi sont test de ninjutsu?\n");
        naruto.test_ninjutsu();
        
 
        Autobus PC1=new Autobus (5, 23, 15);
        Autobus PC3=new Autobus (2, 20, 10);
        Autobus PC4=new Autobus (3, 23, 15);
        Autobus PC2=new Autobus (4, 20, 10);
        Autobus PC5=new Autobus (6, 23, 15);
        Autobus PC6=new Autobus (7, 20, 10);
        
        
        Konoha.ajouterBus(dauphine);
        Konoha.ajouterBus(PC1);
        Konoha.ajouterBus(PC2);
          Konoha.ajouterBus(PC3);
        Konoha.ajouterBus(PC4);
          Konoha.ajouterBus(PC5);
        Konoha.ajouterBus(PC6);
        
        System.out.println("**** bus  " + PC5.getId_bus() + "  ajouté dans le village de konoha avec succès*****"  );
        Konoha.supprimerBus(6);
        System.out.println("**** bus  " + PC5.getId_bus() + "  supprimé du village de konoha avec succès*****"  );
      
    
    
    
    
    }
    
}
