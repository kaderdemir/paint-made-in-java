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
public class ponto {
    int x;
    int y;
    Color cor;
    Graphics g;
    public void desenhar(){
        g.setColor(getCor());
        g.drawLine(getX(), getY(), getX(), getY());
    }

   ponto(int x,int y,Color cor,Graphics g){
        this.x=x;
        this.y=y;
        this.cor=cor;
        this.g=g;
    }
    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the cor
     */
    public Color getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(Color cor) {
        this.cor = cor;
    }

    
  

    
    
}
