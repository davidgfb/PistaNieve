/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaNevada;

//<editor-fold defaultstate="collapsed" desc="imports">
import java.awt.Graphics;
import javax.swing.JPanel;
//</editor-fold>

/**
 *
 * @author David
 */
public class PPN extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        //linea horizontal
        g.drawLine(0, 0, 100, 0);
    }
}
