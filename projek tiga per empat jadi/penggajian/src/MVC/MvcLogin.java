/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;
import view.*;
import controler.*;

/**
 *
 * @author PC
 */
public class MvcLogin {
    ViewLogin viewLogin = new ViewLogin();
   // Model modelLogin = new Model();
    ControllerLogin controllerLogin = new ControllerLogin (viewLogin);//,modelLogin);
    
}
