/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

//<editor-fold defaultstate="collapsed" desc="imports">
import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.awt.RenderingHints.KEY_ANTIALIASING;
import static java.awt.RenderingHints.VALUE_ANTIALIAS_ON;
import java.util.Random;
import javax.swing.JPanel;
import modelo.Arbol;
//</editor-fold>

/**
 *
 * @author David
 */
public class PPN extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        pintaComponente(g);
    }
    
    Arbol[] arboles = new Arbol[10];
    void pintaArboles(int anchoP, int altoP) {
        int nArboles = 10;
        //se puede usar arrayList
        
        Random r = new Random();
        for (int i=0; i<nArboles; i++) {
            arboles[i]=new Arbol(r.nextInt(anchoP), r.nextInt(altoP));
        }
        //out.println(Arrays.toString(arboles));
    }
    
    boolean arbolesPintados = false;
    //por cada repaint
    void pintaComponente(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(KEY_ANTIALIASING, VALUE_ANTIALIAS_ON);

        int anchoP = getWidth(), 
            altoP = getHeight();
        
        if (arbolesPintados==false) {
            pintaArboles(anchoP, altoP);
            arbolesPintados=true;
        }
        
        for (Arbol a : arboles) {
            int[] x = a.getsX();
            g.drawPolygon(x, a.getsY(), x.length);
        }
    }
}
