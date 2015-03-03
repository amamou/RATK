/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ratk;

/**
 *
 * @author AUMEN
 */
import java.util.*;

public class Autobus
{
    // instance variables
    
    private int id_bus;

    public int getId_bus() {
        return id_bus;
    }

    public void setId_bus(int id_bus) {
        this.id_bus = id_bus;
    }
    private int Arret; // Arret courant
    private int NbArrets; //nombre d'arrets du bus.
    private int Places; // nombre de places  dans le bus.
    private List<Passager> Passagers; // Passagers du bus.
    private int NbPassagers;
    
    public Autobus(int id,int NbPlaces, int NbArret)
    {
        // initialise instance variables
        Places = NbPlaces;
    
        NbArrets=NbArret;
        Arret=0;
        Passagers = new ArrayList<Passager>();
        NbPassagers=0;  
        this.id_bus=id;
        
    }
    public void allerArretSuivant()
    {
        if(Arret<NbArrets){
            Arret++;
            for(Passager i:Passagers){
                i.nouvelArret(this,Arret);
            }
        }
    }
    public void demanderPlaceAssise(Passager p){
        if(aPlace()){
            p.accepterPlace();
            Places--;
            NbPassagers++;
            Passagers.add(p);
        }
    }
    public void demanderSortie(Passager p){
        if(p.estAssis()){
            Places++;
            NbPassagers--;
        }
        p.accepterSortie();
        Passagers.remove(p);
    }
    public boolean aPlace(){
        return(Places>0);
    }
    public int getArret(){
        return Arret;
    } 
    public void setArret(int a){
        Arret=a;
    } 
    public void setNbArrets(int a){
        NbArrets=a;
    } 
    public int getNbArrets(){
        return NbArrets;
    }     

    @Override
    public String toString() {
        return "Autobus{" + "id_bus=" + id_bus + ", Arret=" + Arret + ", NbArrets=" + NbArrets + ", Places=" + Places + ", Passagers=" + Passagers + ", NbPassagers=" + NbPassagers + '}';
    }

   
    
    
    
    
}
