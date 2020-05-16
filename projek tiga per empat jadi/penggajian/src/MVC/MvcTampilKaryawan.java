/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;
import view.*;
import controler.*;
import model.*;

/**
 *
 * @author PC
 */
public class MvcTampilKaryawan {
    
    public MvcTampilKaryawan(String nik) {
        ViewKaryawan view = new ViewKaryawan(nik);
        ModelTampilanKaryawan mview = new ModelTampilanKaryawan();
        ControllerTampilanKaryawan controler = new ControllerTampilanKaryawan(view,mview);
    }
    
    
}
