/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ue_03_1410653052.leistungsbeurteilung;

import ue_03_1410653052.leistungsbeurteilung.Vehicle.color;

/**
 *
 * @author 1410653052
 */
public class UE_03_1410653052Leistungsbeurteilung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Benennbar namedCar = new Car((short)4, (short)4, color.black ,(short)4);
        
        namedCar.setName("bmw");
        System.out.println(namedCar.getName());
    }
    
}
