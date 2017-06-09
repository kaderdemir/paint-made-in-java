/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.*;

/**
 *
 * @author migue
 */
public class Retangulo extends d2{
    private int base;
    private int largura;

    public Retangulo(int x, int y, Color cor,Graphics g, Color corInterna, boolean area, boolean perimetro,boolean cor_solida,int xfin,int yfin) {
        super(x, y, cor,g, corInterna, area, perimetro,cor_solida,xfin,yfin);
        this.base=Math.abs(x-xfin);
        this.largura=Math.abs(y-yfin);
    }
    @Override public double area(){
        return getBase()*getLargura();
    }
    @Override public double perimetro(){
        return 2*getBase()+2*getLargura();
    }
    public void desenhar(){
        super.desenhar();
        g.setColor(getCor());
        g.drawRect(getX(), getY(), getBase(), getLargura());
        if(!isCor_solida()){
                    g.setColor(getCorInterna());
                    g.fillRect(x, y,getBase(), getLargura());
                }
    }

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @return the largura
     */
    public int getLargura() {
        return largura;
    }
    
}
