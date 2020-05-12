/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class AsistenLab extends Pendaftar implements Nilai{
    int nmicroteaching;
    double rata_rata;
    AsistenLab(String nama, int nim, int ntulis, int ncoding, int nwawancara, int nmicroteaching) {
        super(nama, nim, ntulis, ncoding, nwawancara);
        this.nmicroteaching = nmicroteaching;
        hitungNilai();
    }
    /*
    public void hitungNilai() {
    rata_rata = (super.ncoding + super.ntulis + super.nwawancara + nmicroteaching)/4;
    }*/

    @Override
    public void hitungNilai() {
    rata_rata = (super.ncoding + super.ntulis + super.nwawancara + nmicroteaching)/4;
    }

}
