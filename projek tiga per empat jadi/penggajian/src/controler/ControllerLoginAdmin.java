/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

/**
 *
 * @author PC
 */
import model.*;
import view.*;
import mvc.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ControllerLoginAdmin {
ViewLoginAdmin view;
ModelLoginAdmin model;


    public ControllerLoginAdmin(ViewLoginAdmin viewLoginAdmin, ModelLoginAdmin modelLogin) {
        this.view = viewLoginAdmin;
        this.model = modelLogin;
        
       
        view.btnMasukAdmin.addActionListener (new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent ae) {
              
               String pass = view.getTfPass();
               String nik = view.getTfNik();
               
               model.ModelLoginAdmin(nik, pass);
               
              
              
               
            }
          });
        view.btnKembaliAdmin.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent ae) {
                view.setVisible(false);
                MvcLogin login = new MvcLogin();
            }

    });
    }

 
}

