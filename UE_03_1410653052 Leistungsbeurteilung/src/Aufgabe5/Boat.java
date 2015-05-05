/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aufgabe5;

/**
 *
 * @author 1410653052
 */
public class Boat extends Vehicle
{
    private double draft;
    private short propeller;
    private double cargo;

    public Boat(double draft, short propeller, double cargo, short wheels, short ps, color farbe) {
        super(wheels, farbe,ps, false, (short)0);
        this.draft = draft;
        this.propeller = propeller;
        this.cargo = cargo;
    }

    public double getDraft() {
        return draft;
    }

    public short getPropeller() {
        return propeller;
    }

    public double getCargo() {
        return cargo;
    }

    public void setDraft(double draft) {
        this.draft = draft;
    }

    public void setPropeller(short propeller) {
        this.propeller = propeller;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }
    
    public void unload() throws InterruptedException
    {
        cargo = 0;
        Thread.sleep(5000);
    }

    @Override
    public String toString() 
    {
        return ("Mein Wasserfahrzeug hat "+getPs()+" PS und einen Tifgang von "+getDraft());
    }
    
    
}
