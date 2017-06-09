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
abstract public class d3 extends ponto{
    private Color corInterna;
    private int recuoX = 10;     private int recuoY = 10;
    private boolean cor_solida = false;
    private Color corexterna;
    int xfin;
    int yfin;
    public d3(int x, int y, Color corinterna,Graphics g,Color corexterna, boolean cor_solida,int xfin,int yfin) {
        super(x, y, corinterna,g);
        this.cor_solida=cor_solida;
        this.corexterna=corexterna;
        this.xfin=xfin;
        this.yfin=yfin;
    }
    public void desenhar(){
    }

    /**
     * @return the corInterna
     */
    public Color getCorInterna() {
        return corInterna;
    }

    /**
     * @return the recuoX
     */
    public int getRecuoX() {
        return recuoX;
    }

    /**
     * @return the recuoY
     */
    public int getRecuoY() {
        return recuoY;
    }

    

    /**
     * @return the cor_solida
     */
    public boolean isCor_solida() {
        return cor_solida;
    }

    /**
     * @return the corexterna
     */
    public Color getCorexterna() {
        return corexterna;
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
}
