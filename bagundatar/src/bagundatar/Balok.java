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
public class Balok extends Persegipanjang{
    int tinggi;
    double volume,luaspermukaan;
    Balok(int panjang, int lebar, int tinggi) {
       super(panjang,lebar);
       this.tinggi=tinggi;
    }
    double volume(){
        volume = super.luas()*tinggi;
        return volume;
    }
    /* double luaspermukan(){
    return luaspermukaan;
    }*/

    double luaspermukaan() {
        luaspermukaan = (super.keliling()*2)+((super.getLebar()+tinggi)*2)+((super.getPanjang()+tinggi)*2);
        return luaspermukaan;   
    }
}
