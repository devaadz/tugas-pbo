/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.*;

/**
 *
 * @author asus
 */
public class ViewMenu extends JFrame{
    JLabel lblCek = new JLabel("Berhasil ke Menu");
    public ViewMenu (){
        
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(400,400);
        setTitle("Halaman Menu");
        
        add (lblCek);
            lblCek.setBounds(100,100,100,20);
        
        
        
        
    }
    
   
   
}
