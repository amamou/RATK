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
{
    // instance variables - replace the example below with your own
    public String ninja_name;
    public String power;
    public int strength;

    /**
     * Constructor for objects of class Genin
     * 
     */
    public Genin(){
        this.ninja_name=null;
        this.power=null;
        this.strength=0;
    }
    
    public Genin(String ninja_name,String power, int strength)
    {
        // initialise instance variables
        this.ninja_name=ninja_name;
        this.power=power;
        this.strength=strength;
        
    }
     public void test_ninjutsu()
    {
        // put your code here
        if(this.strength>10) 
        System.out.println("test ninjustsu reussi!");

        else System.out.println("test ninjustsu perdu!");;
    }
 

    public String getNinjaName(){ return this.ninja_name;}
    public String getPower(){ return this.power;}
    public int getStrength(){ return this.strength;}
    
    public void setNinjaName(String ninja_name){this.ninja_name=ninja_name;}
    public void setPower(String ninja_name){this.power=power;}
    public void setStrength(int strength){this.strength=strength;}
    
      
    public void entreinementNinjustu(Genin naruto){
            
        int p=naruto.getStrength();
        naruto.setStrength(p++);
        
   
    }
    
   
   

    
    
    
    
}
