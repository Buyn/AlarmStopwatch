package com.Freeman;

import javax.swing.*;

/**
 * Created by BuYn on 09.12.2014.
 */
public class Watch {
    //Integer block
    public int iTime = 0;
    private String  sTime;
    private String sText = "Sekunds: ";
    //labels block
    private JLabel jlWatch;
    //doTime block
    Timer tTime;
    //Constructor block
    public Watch(){
        tTime =new Timer();
        sTime = tTime.getFormatedTime();
        jlWatch = new JLabel(sText + sTime);
    }
    public Watch(String sNewText){
        sText=sNewText;
        tTime =new Timer();
        sTime = tTime.getFormatedTime();
        jlWatch = new JLabel(sText + sTime);
    }
    //mettods block
    public int doTime(){
        sTime = tTime.getFormatDeltaTime();
        updateLabel();
        return iTime;
    }
    public int resetTime(){
        tTime.setToZeroStart();
        updateLabel();
        return iTime;
    }
    public int resetAlarm(int iMinuts){
        tTime.setAlarm(iMinuts);
        updateLabel();
        return iTime;
    }
    public int resetAlarm(){
        tTime.setAlarm();
        updateLabel();
        return iTime;
    }
    public int doAlarm(){
        sTime = tTime.getFormatTimeLeft();
        updateLabel();
        return iTime;
    }
    public void updateLabel(){
        jlWatch.setText(sText + sTime);
    }
    //Seters Block
    public void setText(String sNewText){
        sText = sNewText;
        updateLabel();
    }
    //    geters block
    public Timer getTimer() {
        return tTime;
    }
    public JLabel getLabel() {
        return jlWatch;
    }
}
