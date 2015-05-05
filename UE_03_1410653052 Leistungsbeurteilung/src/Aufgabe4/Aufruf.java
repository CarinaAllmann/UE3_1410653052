/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe4;

/**
 *
 * @author Carina Allmann
 */
public class Aufruf 
{
    public static void main (String[] args)
    {
        Liste a = new Liste(3);
        a.save(2.0);
        a.save(5.0);
        a.save(200.0);
        
        System.out.println(a.toString());
        
    }
            
    
}
