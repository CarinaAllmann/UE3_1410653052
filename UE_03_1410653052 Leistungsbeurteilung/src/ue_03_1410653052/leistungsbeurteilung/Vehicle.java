/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ue_03_1410653052.leistungsbeurteilung;

/**
 *
 * @author 1410653052
 */
public class Vehicle implements Benennbar
{
    public Vehicle(short wheels, color farbe, short ps, boolean gestartet, short speed) {
        this.wheels = wheels;
        this.farbe = farbe;
        this.ps = ps;
        this.gestartet = gestartet;
        this.speed = speed;
        this.name = name;
    }
    

    public short getWheels() {
        return wheels;
    }

    public color getFarbe() {
        return farbe;
    }

    public short getPs() {
        return ps;
    }

    public boolean isGestartet() {
        return gestartet;
    }

    public short getSpeed() {
        return speed;
    }

    public void setWheels(short wheels) {
        this.wheels = wheels;
    }

    public void setFarbe(color farbe) {
        this.farbe = farbe;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public void setGestartet(boolean gestartet) {
        this.gestartet = gestartet;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }
    
    
    
    private short wheels;
    private color farbe;
    private short ps;
    private boolean gestartet;
    private short speed;
    private String name;
    
    public void start()
    {
        gestartet = true;
    }
    
    public void stop()
    {
        gestartet = false;
    }
    public void accelerate (short s)
    {
        if (gestartet == true)
        {
             if (speed + s < 250)
            {
            speed += s;
            }
    
        }
        else
        {
            System.out.println("Geschwindigkeit erhöhen ist nich möglich");
        }
    }
    
    public void bremsen (short s)
    {
        if (gestartet == true)
        {
            if (speed -s >= 0)
            {
                speed -= s;
            }
        }
    }

    @Override
    public String getName() 
    {
       return name;
    }

    @Override
    public void setName(String _n) 
    {       
        name = _n;
    }
    
    
    public enum color
    {
        black, silver, red, grey, yellow, blue;
    }
}
