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
public class linha extends d2{
    
    public linha(int x, int y, Color cor,Graphics g,Color corInterna,boolean area,boolean perimetro,boolean cor_solida,int xfin,int yfin) {
        super(x,y,cor,g,corInterna,false,false,false,xfin,yfin);
        
    }
    public  void desenhar(){
        super.desenhar();
        g.setColor(getCor());
        g.drawLine(getX(), getY(), getXfin(), getYfin());
    }

    /**
     * @return the xfin
     */
    public int getXfin() {
        return xfin;
    }

    /**
     * @return the yfin
     */
    public int getYfin() {
        return yfin;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimetro() {
        return 0;
    }
    
}
