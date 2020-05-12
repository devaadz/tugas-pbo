
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Main {
    private static final int Asisten = 1;
    private static final int Admin = 2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char balik;
        int menu=0;
        do {
        System.out.println("== MENU FORM PENDAFTARAN ==");
        System.out.println("1. Asisten Laboratorium");
        System.out.println("2. Admin Laboratorium");
        System.out.print("Pilih : ");
        try {
            menu = input.nextInt();
            System.out.println("");
            switch(menu){
                case Asisten:{
                    int jumlah=0;
                    String nama;
                    int nim, ntulis,ncoding,nwawancara,nmicroteaching;
                    System.out.println("FORM PENDAFTARAN ASISTEN LABORATORIUM");
                    System.out.print("Input berapa banyak data : ");
                    jumlah = input.nextInt();
                    for (int i = 0; i < jumlah; i++) {
                        System.out.print("Input NIM : ");
                        nim = input.nextInt();
                        System.out.print("Input Nama : ");
                        input.nextLine();
                        nama = input.nextLine();
                        System.out.print("Input Nilai Tulis : ");
                        ntulis = input.nextInt();
                        System.out.print("Input Nilai Coding : ");
                        ncoding = input.nextInt();
                        System.out.print("Input Nilai Wawancara : ");
                        nwawancara = input.nextInt();
                        System.out.print("Input Nilai Microteaching : ");
                        nmicroteaching = input.nextInt();
                        AsistenLab asisten = new AsistenLab(nama, nim, ntulis, ncoding, nwawancara, nmicroteaching);
                        System.out.println("Nilai Rata-rata : " + asisten.rata_rata);
                        if(asisten.rata_rata > 85){
                            System.out.println("KETERANGAN : LOLOS");
                            System.out.println("Selamat kepada  "+asisten.nim+" telah diterima sebagai Aslab");
                        }
                        else{
                            System.out.println("KETERANGAN : TIDAK LOLOS");
                            System.out.println("Mohon maaf kepada  "+asisten.nim+" anda tidak diterima sebagai Aslab. Coba lagi tahun depan");
                        }
                    }
                    break;
                }
                case Admin:{
                    int jumlah=0;
                    String nama;
                    int nim, ntulis, ncoding, nwawancara, npraktek;
                    System.out.println("FORM PENDAFTARAN ADMIN LABORATORIUM");
                    System.out.print("Input berapa banyak data : ");
                    jumlah = input.nextInt();
                    for (int i = 0; i < jumlah; i++) {
                        System.out.print("Input NIM : ");
                        nim = input.nextInt();
                        System.out.print("Input Nama : ");
                        input.nextLine();
                        nama = input.nextLine();
                        System.out.print("Input Nilai Tulis : ");
                        ntulis = input.nextInt();
                        System.out.print("Input Nilai Coding : ");
                        ncoding = input.nextInt();
                        System.out.print("Input Nilai Wawancara : ");
                        nwawancara = input.nextInt();
                        System.out.print("Input Nilai Tes Jaringan : ");
                        npraktek = input.nextInt();
                        AdminLab admin = new AdminLab(nama, nim, ntulis, ncoding, nwawancara, npraktek);
                        System.out.println("Nilai Rata-rata : " + admin.rata_rata);
                        if(admin.rata_rata > 85){
                            System.out.println("KETERANGAN : LOLOS");
                            System.out.println("Selamat kepada "+admin.nim+" telah diterima sebagai Admin Lab");
                            System.out.println("");
                        }
                        else{
                            System.out.println("KETERANGAN : TIDAK LOLOS");
                            System.out.println("Mohon maaf kepada "+admin.nim+" anda tidak diterima sebagai Admin Lab. Coba lagi tahun depan");
                            System.out.println("");
                        }
                    }
                    break;
                }
            }
            
        } catch (InputMismatchException e) {
            System.err.println("Input harus berupa angka!");
            input.nextLine();
        }
            System.out.print("Kembali ke menu? (y/n) : ");
            balik = input.next().charAt(0);
            System.out.println("");
        } while (balik == 'y' || balik == 'Y');
        
    }
   }
    
