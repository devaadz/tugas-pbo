/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
class AdminLab extends Pendaftar implements Nilai{
    final int npraktek;
    double rata_rata;
    AdminLab(String nama, int nim, int ntulis, int ncoding, int nwawancara, int npraktek) {
        super(nama, nim, ntulis, ncoding, npraktek);
        this.npraktek = npraktek;
        hitungNilai();
    }
    /*
    public void hitungNilai() {
    rata_rata = (super.ncoding + super.ntulis + super.nwawancara + nmicroteaching)/4;
    }*/

    @Override
    public void hitungNilai() {
    rata_rata = (super.ncoding + super.ntulis + super.nwawancara + npraktek)/4;
    }
}
