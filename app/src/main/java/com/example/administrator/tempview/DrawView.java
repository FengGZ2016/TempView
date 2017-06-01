package com.example.administrator.tempview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/6/1.
 */

public class DrawView extends View{
    private List<TempData> mTempDataList=new ArrayList<>();
    private List<TempBean> mTempBeanList=new ArrayList<>();
    private final int RADIU=10;//半径

    public DrawView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initData();
        initBean();
    }

    /**
     * 初始化曲线的坐标
     * */
    private void initBean() {
        for (int i=0;i<mTempDataList.size();i++){
            int x = 50 + (i*150);
            int lowY = (40-(mTempDataList.get(i).getLow()))*RADIU;
            int highY=(40-(mTempDataList.get(i).getHigh()))*RADIU;
            TempBean bean=new TempBean(x,lowY,highY);
            mTempBeanList.add(bean);
        }
    }

    /**
     * 初始化天气数据
     * */
    private void initData() {
        TempData data01=new TempData(12,35,new Date(2017,6,1));
        TempData data02=new TempData(20,30,new Date(2017,6,2));
        TempData data03=new TempData(33,40,new Date(2017,6,3));
        TempData data04=new TempData(9,15,new Date(2017,6,4));
        TempData data05=new TempData(25,35,new Date(2017,6,5));
        TempData data06=new TempData(20,39,new Date(2017,6,6));
        TempData data07=new TempData(15,35,new Date(2017,6,7));
        mTempDataList.add(data01);
        mTempDataList.add(data02);
        mTempDataList.add(data03);
        mTempDataList.add(data04);
        mTempDataList.add(data05);
        mTempDataList.add(data06);
        mTempDataList.add(data07);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
