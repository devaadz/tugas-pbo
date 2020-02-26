/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagundatar;

/**
 *
 * @author PC
 */
public class Kubus extends Persegi {
    double volume,luaspermukaan;
    Kubus(int sisi) {
     super(sisi);    
    }
    
    double volume(){
        this.volume = super.luas()*super.getSisi();
        return volume;
    }
    
    public double luaspermukaan(){
        luaspermukaan = super.luas()*6;
        return luaspermukaan;
    }

}

