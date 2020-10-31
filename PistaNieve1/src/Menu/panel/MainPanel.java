/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu.panel;

//<editor-fold defaultstate="collapsed" desc="imports">
import static java.awt.Color.white;
import javax.swing.JFrame;
import javax.swing.Timer;
//</editor-fold>

/**
 *
 * @author David
 */
public class MainPanel {
    
    //<editor-fold defaultstate="collapsed" desc="main">
    public static void main(String[] args) {
        JFrame f = new JFrame();
        PMenu pM = new PMenu();
        Timer t = new Timer(1000,pM);
        t.start();
        
        f.setDefaultCloseOperation(3);
        f.setSize(800, 600);
        pM.setBackground(white);
        f.add(pM);
        f.setVisible(true);
    }
//</editor-fold>
}
