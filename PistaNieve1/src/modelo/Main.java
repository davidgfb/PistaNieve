/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JFrame;
import vista.PPN;
import vista.VPN;

/**
 *
 * @author David
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //no necesito setDCO(3)
        /*
        VPN vPN = new VPN();
        vPN.setVisible(true);
        */
        
        ///*
    
        VPN vPN = new VPN();
        PPN pPN = new PPN();
        //vPN.setSize(800, 600);
        //vPN.add(pPN);
        //f.setDefaultCloseOperation(3);
        //vPN.getContentPane().setP
        //jScrollPane
        vPN.getjScrollPane().setViewportView(pPN);
        vPN.setVisible(true);
    
        //*/
    }
}
