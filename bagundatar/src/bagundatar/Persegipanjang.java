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
class Persegipanjang {
    int panjang,lebar;
    double luas,keliling;
    Persegipanjang(int panjang, int lebar) {
       this.panjang = panjang;
       this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }
    
    double luas(){
        luas = panjang*lebar;
        return luas;
    }
    double keliling(){
        keliling = (panjang+lebar)*2;
        return keliling;
    }
}
