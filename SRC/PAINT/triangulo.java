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
public class triangulo extends d2{
    int base,altura;

    public triangulo(int x, int y, Color cor, Graphics g, Color corInterna, boolean area, boolean perimetro, boolean cor_solida, int xfin, int yfin) {
        super(x, y, cor, g, corInterna, area, perimetro, cor_solida, xfin, yfin);
        this.base=Math.abs(x-xfin);
        this.altura=Math.abs(y-yfin);
    }
    @Override public double perimetro(){
        return base*3;
    }
    @Override public double area(){
        return (base*altura)/2;
    }
    public void desenhar(Graphics g){
        g.setColor(getCor());
    }
}
