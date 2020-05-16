/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import controler.*;
import model.*;
import view.*;

/**
 *
 * @author PC
 */
public class MvcInputDataKariawan {
    ViewInputDataKariawan vinputgaji =new ViewInputDataKariawan();
    ModelInputDataKariawan minputgaji = new ModelInputDataKariawan();
    ControlerInputDataKariawan cpreinputgaji = new ControlerInputDataKariawan(minputgaji,vinputgaji);

    
}
