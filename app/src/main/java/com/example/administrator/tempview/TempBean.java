package com.example.administrator.tempview;

/**
 * Created by Administrator on 2017/6/1.
 */

public class TempBean {
    private int x;
    private int lowY;
    private int highY;

    public TempBean(){}
    public TempBean(int x,int lowY,int highY){
        this.x=x;
        this.lowY=lowY;
        this.highY=highY;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getLowY() {
        return lowY;
    }

    public void setLowY(int lowY) {
        this.lowY = lowY;
    }

    public int getHighY() {
        return highY;
    }

    public void setHighY(int highY) {
        this.highY = highY;
    }
}
