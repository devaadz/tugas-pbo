/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import controler.ControllerLoginKaryawan;
import model.ModelLoginKaryawan;
import view.ViewLoginKaryawan;

/**
 *
 * @author asus
 */
public class MvcKaryawan {
    
    ModelLoginKaryawan modelKaryawan = new ModelLoginKaryawan ();
    ViewLoginKaryawan viewKaryawan = new ViewLoginKaryawan ();
    ControllerLoginKaryawan controllerKaryawan = new ControllerLoginKaryawan (viewKaryawan,modelKaryawan);
    
    
    
}
