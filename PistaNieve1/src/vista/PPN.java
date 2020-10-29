/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.awt.RenderingHints.KEY_ANTIALIASING;
import static java.awt.RenderingHints.VALUE_ANTIALIAS_ON;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author David
 */
public class PPN extends JPanel {

    public PPN() {
        setSize(1600,1200);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        pintaComponente(g);
    }
    
    void pintaComponente(Graphics g) {
        int[] x = {50,100,0},
              y = {0,100,100};
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(KEY_ANTIALIASING, VALUE_ANTIALIAS_ON);

        int nArboles = 10;
        for (int i=0; i<nArboles; i++) {
            /*
            for () {
               x 
            }
            */
            
            g.drawPolygon(x, y, x.length);
        }
        
    }
    
    //<editor-fold defaultstate="collapsed" desc="main">
    ///*
    public static void main(String[] args) {
        JFrame f = new JFrame();
        PPN pPN = new PPN();
        f.setSize(800, 600);
        f.add(pPN);
        f.setDefaultCloseOperation(3);
        f.setVisible(true);
    }
    //*/
//</editor-fold>
}
