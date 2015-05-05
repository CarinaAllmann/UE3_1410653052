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
public class Liste <D> //Datentyp D
{
  // int[] a = new int [10]; normales Array
   D [] array;
   
   
   public Liste( int size) //Konstruktor um neue Liste zu erstellen
   {
       //array = new Object [size]; 
      //array = (T[]) new T [size];       
       array = (D []) (new Object [size]);
       
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
        for (D a : array)
        {
            listeninhalt += a+"  ";
        }
        return listeninhalt;
    }
   
   
    
}
