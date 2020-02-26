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
public class Persegi {
    int sisi;
    double luas,keliling;
    
    Persegi(int sisi){
        this.sisi=sisi;
    }

    public int getSisi() {
        return sisi;
    }
     
     double luas(){
         luas = sisi*sisi;
        return luas;
     }
     double keliling(){
         keliling = sisi*4;
         return keliling;
     }
}
