/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe3_richitg;

import Aufgabe3_richitg.Vehicle.color;

/**
 *
 * @author Carina Allmann
 */
public class Aufruf 
{ public static void main (String[] args)
{
    Benennbar namedCar = new Car((short)4, (short)4, color.black ,(short)4);
    namedCar.setName("Rosi");
    System.out.println("Mein Auto heißt " +namedCar.getName());
}
    
}
