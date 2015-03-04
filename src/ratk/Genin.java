/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ratk;
/**
 *
 * @author AUMEN
 */
public class Genin extends Passager 
{  // instance variables - replace the example below with your own
    public String power;
    public int strength;

    /**
     * Constructor for objects of class Genin
     * 
     */
    public Genin(){
        this.power="";
        this.strength=0;
    }
    public Genin(String ninja_name,String power, int strength)
    {
        // initialise instance variables
        this.setNom(ninja_name);
        this.power=power;
        this.strength=strength;    
    }
     public boolean test_ninjutsu()
    {
        // put your code here
        return (this.strength>10);
    }
 
    public String getPower(){ return this.power;}
    public int getStrength(){ return this.strength;}
    
    public void setPower(String power){this.power=power;}
    public void setStrength(int strength){this.strength=strength;}
    
      
    public void entreinementNinjustu(){
        strength++;
    }
    
   
   

    
    
    
    
}
