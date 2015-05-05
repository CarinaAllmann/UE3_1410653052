/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe5;



/**
 *
 * @author Carina Allmann
 */
public class Liste <D extends Benennbar> //Datentyp D welcher von Benennbar erbt
{
 
   Benennbar [] array;   
   
   public Liste( int size) //Konstruktor um neue Liste zu erstellen
   {      
       array = new Benennbar [size];
       
   }
   
   public void save (D value)
   {
    for (int i= 0; i<= array.length; i++)//gibt es noch Platz im Arrray?
    {
        if (array[i]== null)
        {        
            array[i] = value;
            System.out.println("Wert wurde an der Stelle "+i+" gespeichert");
            break; // ohne break üble Fehlermeldungen
        }    
        
        
    }
   }

    @Override
    public String toString() 
    {
        String listeninhalt = "Die Werte in diesem Array lauten: ";
        for (Benennbar a : array)
        {
            listeninhalt += a+" \n "; //neue Zeile
        }
        return listeninhalt;
    }
   
   
    
}
