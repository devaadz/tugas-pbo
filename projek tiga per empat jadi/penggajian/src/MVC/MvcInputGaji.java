/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;
import controler.*;
import view.*;
import model.*;


/**
 *
 * @author PC
 */
public class MvcInputGaji {
    ViewInputGaji vinputgaji =new ViewInputGaji();
    ModelInputGaji minputgaji = new ModelInputGaji();
    ControlerInputGaji cpreinputgaji = new ControlerInputGaji(minputgaji,vinputgaji);

}
