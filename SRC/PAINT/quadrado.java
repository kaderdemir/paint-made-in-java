/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author migue
 */
public class quadrado extends d2{
    private int lado;

    public quadrado(int x, int y, Color cor,Graphics g, Color corInterna, boolean area, boolean perimetro,boolean cor_solida,int xfin,int yfin,int lado) {
        super(x, y, cor,g, corInterna, area, perimetro,cor_solida,xfin,yfin);
        this.lado=lado;
    }
    @Override public double area(){
        return getLado()*getLado();
    }
    @Override public double perimetro(){
        return 4*getLado();
    }
    public void desenhar(){
        super.desenhar();
        g.setColor(getCor());
        g.drawRect(getX(), getY(), getLado(), getLado());
        if(!isCor_solida()){
            g.setColor(getCorInterna());
            g.fillRect(x, y, getLado(), getLado());
        }
    }

    /**
     * @return the lado
     */
    public int getLado() {
        return lado;
    }
}
