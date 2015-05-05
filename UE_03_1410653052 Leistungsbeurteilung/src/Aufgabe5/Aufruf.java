/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe5;

import Aufgabe4.*;
import Aufgabe5.Vehicle.color;

/**
 *
 * @author Carina Allmann
 */
public class Aufruf 
{
    public static void main (String[] args)
    {
        Boat b= new Boat(2,(short)3, 79, (short)5,(short)5, color.grey);
        Car bmw = new Car((short) 4,(short)4, color.silver, (short) 220);
        Car audi = new Car((short)8, (short) 4, color.black, (short) 180);
        Boat titanic = new Boat(10.54, (short)3, 51000, (short)0,(short)100000, color.blue);
        
       
        
        Liste a = new Liste(3);
        a.save(bmw);
        a.save(audi);
        a.save(titanic);
        
        
        System.out.println(a.toString());
        
    }
            
    
}
