/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe3_richitg;

/**
 *
 * @author Carina Allmann
 */
public class Car extends Vehicle
{
     private boolean aircondition;
    private short airbag;
    
     public Car( short airbag, short wheels, color farbe, short ps) {
        super(wheels, farbe, ps, false, (short)0);
        this.aircondition = false;
        this.airbag = airbag;
    }
     
      public boolean isAircondition() {
        return aircondition;
    }

    public short getAirbag() {
        return airbag;
    }

    public void setAircondition(boolean aircondition) {
        this.aircondition = aircondition;
    }

    public void setAirbag(short airbag) {
        this.airbag = airbag;
    }
    
    
    
    
    public void startAircondition()
    {
        if ( aircondition == false)
        {
            aircondition = true;
        }
        else
        {
            System.out.println("Klimaanlage läuft bereits");
        }
                
    }
    
   public void stopAircondition()
   {
       if (aircondition == true)
       {
           aircondition = false;
       }
   }

    @Override
    public String toString() 
    {
        return ("Mein Auto hat "+ getPs()+" und fährt mit "+getSpeed()+" km/h");
        
    }
    
}
