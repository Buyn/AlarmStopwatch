package com.Freeman;

import javax.swing.*;

/**
 * Created by BuYn on 09.12.2014.
 */
public class Label {
    //Integer block
        private String  sTime;
        private String sText = "Sekunds: ";
        //labels block
        private JLabel jlWatch;
        //doTime block
        Timer tTime;
        //Constructor block
        public  Label(){
            tTime =new Timer();
            sTime = tTime.getFormatedTime();
            jlWatch = new JLabel(sText + sTime);
        }
        public  Label(String sNewText){
            sText=sNewText;
            tTime =new Timer();
            sTime = tTime.getFormatedTime();
            jlWatch = new JLabel(sText + sTime);
        }
        //mettods block
    public void doTime(){
        sTime = tTime.getFormatDeltaTime();
        updateLabel();
    }
    public void resetTime(){
        tTime.setToZeroStart();
        updateLabel();
    }
    public void resetAlarm(int iMinuts){
        tTime.setAlarm(iMinuts);
        updateLabel();
    }
    public void resetAlarm(){
        tTime.setAlarm();
        updateLabel();
    }
    public void doAlarm(){
        sTime = tTime.getFormatTimeLeft();
        updateLabel();
    }
    public void updateLabel(){
        jlWatch.setText(sText + sTime);
    }
    //Seters Block
    public void setText(String sNewText){
        sText = sNewText;
        updateLabel();
    }    public void setTime(String sNewText){
        sTime = sNewText;
        updateLabel();
    }
    //    geters block
    public Timer getTimer() {
        return tTime;
    }
    public JLabel getJLabel() {
        return jlWatch;
    }
}
