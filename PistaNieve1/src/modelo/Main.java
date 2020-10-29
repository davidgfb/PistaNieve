/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

//<editor-fold defaultstate="collapsed" desc="imports">
import java.awt.Dimension;
import vista.PPN;
import vista.VPN;
//</editor-fold>


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
        VPN vPN = new VPN();
        PPN pPN = new PPN();
        pPN.setPreferredSize(new Dimension(1600,1200));
        vPN.getjScrollPane().setViewportView(pPN);
        vPN.setVisible(true);
    }
}
