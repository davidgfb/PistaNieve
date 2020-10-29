/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaNevada;

import java.awt.Color;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author David
 */
public class Main {
    public static void main(String[] args) {
        VPN vPN = new VPN();
        PPN pPN = new PPN();
        //vPN.getContentPane().add(pPN);
        
        /*esto deberia ser semi-transparente añadiendo "niebla"
         *siendo 0 transparente y 255 opaco
         */
        pPN.setBackground(new Color(255,255,255,128));
        vPN.getContentPane().add(pPN, new AbsoluteConstraints(0, 0, 800, 600));

        vPN.setVisible(true);
    }
}
