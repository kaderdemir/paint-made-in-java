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
public class piramide extends d3{

    public piramide(int x, int y, Color corinterna, Graphics g, Color corexterna, boolean cor_solida, int xfin, int yfin) {
        super(x, y, corinterna, g, corexterna, cor_solida, xfin, yfin);
    }

  public void desenhar(){
      super.desenhar();
        int[] posicoesx={x+Math.abs(x-xfin),Math.abs(x),Math.abs(xfin),x+Math.abs(x-xfin)};
        int[] posicoesy={y,y+2*Math.abs(y-yfin)/3,y+2*Math.abs(y-yfin)/3,yfin};
        g.setColor(getCor());
        g.drawPolygon(posicoesx, posicoesy, 4);
        if(!isCor_solida()){
                    g.setColor(getCorInterna());
                    g.fillPolygon(posicoesx, posicoesy,4);
                }
        g.drawLine(x+Math.abs(x-xfin), y, x+Math.abs(x-xfin), y);
  }
}
