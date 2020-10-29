/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

//<editor-fold defaultstate="collapsed" desc="imports">
import static java.awt.Color.white;
import java.awt.Dimension;
import vista.PPN;
import vista.VPN;
//</editor-fold>

/**
 *
 * @author David
 */
public class Main {

    //<editor-fold defaultstate="collapsed" desc="main">
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //no necesito setDCO(3)        
        VPN vPN = new VPN();
        PPN pPN = new PPN();
        pPN.setPreferredSize(new Dimension(1600,1200));
        vPN.getjScrollPane().setViewportView(pPN);
        vPN.setResizable(false);
        pPN.setBackground(white);
        vPN.setVisible(true);
    }
//</editor-fold>
}
