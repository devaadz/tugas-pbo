/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;
 
import view.*;
import model.*;
import controler.*;

/**
 *
 * @author PC
 */
public class MvcAdmin {
    ViewLoginAdmin viewLoginAdmin = new ViewLoginAdmin();
    ModelLoginAdmin modelLogin = new ModelLoginAdmin();
    ControllerLoginAdmin controllerAdmin = new ControllerLoginAdmin (viewLoginAdmin,modelLogin);
}