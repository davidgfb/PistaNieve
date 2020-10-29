/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

//<editor-fold defaultstate="collapsed" desc="imports">
import static java.lang.System.out;
import java.util.Arrays;
//</editor-fold>

/**
 *
 * @author David
 */
public class Arbol {
    
    //<editor-fold defaultstate="collapsed" desc="vars">
    int x=0,
        y=0;
    //spriteX sX, spriteY sY
    int[] sX = {x+50,x+100,x},
          sY = {y,y+100,y+100};
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="constructor">
    public Arbol(int x, int y) {
        setX(x);
        setY(y);
        setsX(x);
        setsY(y);
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="setters">
    private void setX(int x) {
        this.x = x;
    }

    private void setY(int y) {
        this.y = y;
    }

    private void setsX(int x) {
        this.sX = new int[]{x+50,x+100,x};
    }

    private void setsY(int y) {
        this.sY = new int[]{y,y+100,y+100};
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getters">
    public int[] getsX() {    
        return sX;
    }
    
    public int[] getsY() {
        return sY;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="tostring">
    @Override
    public String toString() {
        return "Arbol{" + "x=" + x + ", y=" + y + ", sX= " + Arrays.toString(sX) + ", sY= " + Arrays.toString(sY) + '}';
    }
//</editor-fold>
}
