/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ratk;

import ratk.Autobus;
/**
 *
 * @author AUMEN
 */
public class Passager
{
    // instance variables - replace the example below with your own
    private String Nom; // nom du passager
    private int Destination; // Arret de destination
    private int Etat; // 0 = Dehors, 1 = Assis dans le bus

    
    public Passager()
    {
       this.Nom=null;
       this.Destination=0;
       this.Etat= 0;
    }
    public Passager(String Nom, int Destination)
    {
        // initialise instance variables
        this.Nom=Nom;
        this.Destination=Destination;
        Etat=0;
    }

    public boolean estAssis()
    {
       return (Etat==1);
    } 
     public boolean estDehors()
    {
       return (Etat==0);
    }
    public void accepterPlace(){
        Etat=1;
    }
    public void accepterSortie(){
        Etat=0;
    }
    public void nouvelArret(Autobus bus, int arret){
        if(arret>= Destination)
            bus.demanderSortie(this);
    }
    public void monterDans(Autobus bus){
        if(bus.aPlace())
            bus.demanderPlaceAssise(this);
    }

    @Override
    public String toString() {
        return "Passager{" + "Nom=" + Nom + ", Destination=" + Destination + '}';
    }
    
    
}
