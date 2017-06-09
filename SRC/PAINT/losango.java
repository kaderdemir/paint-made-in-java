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
public class losango extends d2{
    private int base;
    private int altura;

    public losango(int x, int y, Color cor,Graphics g, Color corInterna, boolean area, boolean perimetro,boolean cor_solida,int xfin,int yfin) {
        super(x, y, cor,g, corInterna, area, perimetro,cor_solida,xfin,yfin);
        this.base=Math.abs(x-xfin);
        this.altura=Math.abs(y-yfin);
    }
    @Override public double area(){
        return (getBase()*getAltura())/2;
    }
    @Override public double perimetro(){
        return 2*getBase()+2*getAltura();
    }
    public void desenhar(){
        super.desenhar();
        int posicoesx[]={getX()-getBase()/2,getX()+getBase()/2, getX(), getX()},posicoesy[]={getY(), getY(),getY()-getAltura()/2,getY()-getAltura()/2};
        g.setColor(getCor());
        g.drawPolygon(posicoesx, posicoesy, 4);
        if(!isCor_solida()){
                    g.setColor(getCorInterna());
                    g.fillPolygon(posicoesx, posicoesy,4);
                }
    }

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }
}
