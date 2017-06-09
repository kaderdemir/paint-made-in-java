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
abstract public class d2 extends ponto {
    Color corInterna;
    int xfin;
    int yfin;
    private int recuoX = 10;
    private int recuoY = 10;
    private boolean exibirArea = false;
    private boolean exibirPerimetro = false;
    boolean cor_solida=false;

    public d2(int x, int y, Color cor,Graphics g,Color corInterna,boolean area,boolean perimetro,boolean cor_solida,int xfin,int yfin) {
        super(x, y, cor,g);
        this.exibirPerimetro= perimetro;
        this.corInterna=corInterna;
        this.exibirArea=area;
        this.cor_solida=cor_solida;
        this.xfin=xfin;
        this.yfin=yfin;
    } 
   
    abstract public double area();
    abstract public double perimetro();
    public void desenhar(){
        if(isExibirArea()&&isExibirPerimetro()){
            g.drawString("area: "+Double.toString(area())+" perimetro: "+Double.toString(perimetro()), getX()-getRecuoX(), getY()-getRecuoY());
        }else{
        
            if(isExibirArea()){
                g.drawString("area: "+Double.toString(area()), getX()-getRecuoX(), getY()-getRecuoY());
            }
            if(isExibirPerimetro()){
                g.drawString("perimetro: "+Double.toString(perimetro()), getX()-getRecuoX(), getY()-getRecuoY());
            }
        }
    }

    /**
     * @return the corInterna
     */
    public Color getCorInterna() {
        return corInterna;
    }

    /**
     * @param corInterna the corInterna to set
     */
    public void setCorInterna(Color corInterna) {
        this.corInterna = corInterna;
    }

    /**
     * @return the xfin
     */
    public int getXfin() {
        return xfin;
    }

    /**
     * @param xfin the xfin to set
     */
    public void setXfin(int xfin) {
        this.xfin = xfin;
    }

    /**
     * @return the yfin
     */
    public int getYfin() {
        return yfin;
    }

    /**
     * @param yfin the yfin to set
     */
    public void setYfin(int yfin) {
        this.yfin = yfin;
    }

    /**
     * @return the recuoX
     */
    public int getRecuoX() {
        return recuoX;
    }

    /**
     * @param recuoX the recuoX to set
     */
    public void setRecuoX(int recuoX) {
        this.recuoX = recuoX;
    }

    /**
     * @return the recuoY
     */
    public int getRecuoY() {
        return recuoY;
    }

    /**
     * @param recuoY the recuoY to set
     */
    public void setRecuoY(int recuoY) {
        this.recuoY = recuoY;
    }

    /**
     * @return the exibirArea
     */
    public boolean isExibirArea() {
        return exibirArea;
    }

    /**
     * @param exibirArea the exibirArea to set
     */
    public void setExibirArea(boolean exibirArea) {
        this.exibirArea = exibirArea;
    }

    /**
     * @return the exibirPerimetro
     */
    public boolean isExibirPerimetro() {
        return exibirPerimetro;
    }

    /**
     * @param exibirPerimetro the exibirPerimetro to set
     */
    public void setExibirPerimetro(boolean exibirPerimetro) {
        this.exibirPerimetro = exibirPerimetro;
    }

    /**
     * @return the cor_solida
     */
    public boolean isCor_solida() {
        return cor_solida;
    }
}
