/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.*;
import model.*;
import mvc.*;

/**
 *
 * @author PC
 */
public class ControllerLogin {
 ModelLoginAdmin model;
 ViewLogin view;
    
    public ControllerLogin(ViewLogin viewLogin){//, Model modelLogin) {
       // this.model = modelLogin;
        this.view = viewLogin;
        view.btnLoginAdmin.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent ae) {
               view.setVisible(false);
               MvcAdmin loginadmin = new MvcAdmin();
            }  
        });
        
         view.btnLoginKaryawan.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent ae) {
                view.setVisible(false);
               MvcKaryawan loginKaryawan = new MvcKaryawan();
                
            }  
        });
        
    }
}
