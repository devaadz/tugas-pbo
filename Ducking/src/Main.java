/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */

import attack.ArrowAttack;
import attack.SwordAttack;
import defense.ArmorDefense;
import defense.ShiledDefense;
import fly.*;
import sound.*;



public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bebek superBebek = new Bebek(new RocetFly(),new ToaSound(),new ArrowAttack(), new ShiledDefense() );
        System.out.println("Super Bebek Behaviour ");
        System.out.print("Fly\t: ");superBebek.fly();
        System.out.print("Sound\t: ");superBebek.sound();
        System.out.print("Attack\t: ");superBebek.attack();
        System.out.print("Defend\t: ");superBebek.defense();
        
        System.out.println("");
        Bebek noobBebek = new Bebek(new WingsFly(), new NormalSound(), new SwordAttack(), new ArmorDefense());
        System.out.println("\nNoob Duck Behaviour : ");
        System.out.print("Fly\t: "); noobBebek.fly();
        System.out.print("Sound\t: "); noobBebek.sound();
        System.out.print("Attack\t: "); noobBebek.attack();
        System.out.print("Defend\t: "); noobBebek.defense();

        System.out.println("\nSuper Duck Change Fly and Defend Behaviour : ");
        superBebek.setBehaviourFly(new PlaneFly());
        superBebek.setBehaviourDefense(new ArmorDefense());
        System.out.print("Fly\t: "); superBebek.fly();
        System.out.print("Sound\t: "); superBebek.sound();
        System.out.print("Attack\t: "); superBebek.attack();
        System.out.print("Defend\t: "); superBebek.defense();
    }
}
    
