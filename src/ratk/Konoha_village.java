/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ratk;
/**
 *
 * @author AUMEN
 */
import java.util.List;
import java.util.ArrayList;
public class Konoha_village 
{
    // instance variables - replace the example below with your own
    public List<Genin> Ninjas;
    public List<Autobus> Bus; 
     /**
     * 
     * Constructor for objects of class Konoha_village
     */
    public Konoha_village()
    {
        // initialise instance variables   
        this.Ninjas=new ArrayList<Genin>();
        this.Bus=new ArrayList<Autobus>();
    }
    
    
    
    public List<Genin> getNinjas() {
        return Ninjas;
    }
    public List<Autobus> getBus() {
        return Bus;
    }

  public void ajouterBus(int id,int NbPlaces, int NbArret)
  {
      Autobus b= new Autobus(id,NbPlaces,NbArret);
      this.Bus.add(b);
  }
  public void supprimerBus(int idBus)
  {
       for (Autobus b : Bus) {
    if (b.getId_bus()==idBus)
    {
        System.out.println(idBus);
      
        int index= Bus.indexOf(b);
        System.out.println(index);
        this.Bus.remove(index);
    }
        
    }
        
  }
    
  
    public boolean nouveau_ninja_a_Konoha(String name_ninja, String power, int strength)
    {
        Genin nouveau_ninja_a_Konoha=new Genin(name_ninja,power,strength);
        
        return Ninjas.add(nouveau_ninja_a_Konoha);
        
        
    }
    
  
    
}
