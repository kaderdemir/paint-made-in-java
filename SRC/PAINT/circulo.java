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
public class circulo extends d2{
    private int raio;

    public circulo(int x, int y, Color cor,Graphics g, Color corInterna, boolean area, boolean perimetro,boolean cor_solida,int xfin,int yfin) {
        super(x, y, cor,g, corInterna, area, perimetro,cor_solida,xfin,yfin);
        this.raio=Math.abs(x-xfin);
    }
    @Override public double perimetro(){
        return 2*Math.PI*getRaio();
    }
    @Override public double area(){
        return Math.PI*getRaio()*getRaio();
    }
    @Override
    public void desenhar(){
        super.desenhar();
        g.setColor(cor);
        g.drawOval(x, y,Math.abs(x-xfin), Math.abs(y-yfin));
        if(!cor_solida){
            g.setColor(corInterna);
            g.fillOval(x, y,Math.abs(x-xfin), Math.abs(y-yfin));
        }
    }

    /**
     * @return the raio
     */
    public int getRaio() {
        return raio;
    }
}
