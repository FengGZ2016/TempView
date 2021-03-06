package com.example.administrator.tempview;

import java.util.Date;

/**
 * Created by Administrator on 2017/6/1.
 */

public class TempData {
    private int low;//最低温
    private int high;//最高温
    private Date mDate;//日期

    public TempData(){}

    public TempData(int low,int high,Date date){
        this.low=low;
        this.high=high;
        mDate=date;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }
}
