/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagundatar;

import java.util.Scanner;



public class Bagundatar {

   
    public static void main(String[] args) {
        int pilih,sisi,panjang,lebar,tinggi;
        Scanner input = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. persegi");
        System.out.println("2. kubus");
        System.out.println("3. persegi panjang");
        System.out.println("4. balok");
        System.out.print("PILIH = ");
        pilih = input.nextInt();
        
    switch (pilih){
        case 1 :
            System.out.println("persegi");
            System.out.print("masukan sisi  = ");
            sisi = input.nextInt();
            Persegi hitungpersegi = new Persegi(sisi); 
            System.out.println("luas = "+hitungpersegi.luas());
            System.out.println("keliling  = "+hitungpersegi.keliling());
        break;
        case 2 :
            System.out.println("kubus");
            System.out.print("masukan sisi  = ");
            sisi = input.nextInt();
            Kubus hitungkubus;
            hitungkubus = new Kubus(sisi);
            System.out.println("volume = "+hitungkubus.volume());
            System.out.println("luaspermukaan  = "+hitungkubus.luaspermukaan());
        break ;
        case 3 :
            System.out.println("persegi panjang");
            System.out.print("masukan panjang  = ");
            panjang = input.nextInt();
            System.out.print("masukan lebar  = ");
            lebar = input.nextInt();
            Persegipanjang persegipanjang = new Persegipanjang(panjang,lebar); 
            System.out.println("luas = "+persegipanjang.luas());
            System.out.println("keliling  = "+persegipanjang.keliling());
        break;
        case 4 :
            System.out.println("balok");
            System.out.print("masukan panjang  = ");
            panjang = input.nextInt();
            System.out.print("masukan lebar  = ");
            lebar = input.nextInt();
            System.out.print("masukan tinggi = ");
            tinggi = input.nextInt();
            Balok hitungbalok = new Balok(panjang,lebar,tinggi); 
            System.out.println("volume = "+hitungbalok.volume());
            System.out.println("luaspermukaan  = "+hitungbalok.luaspermukaan());
        }
    }
    
}
