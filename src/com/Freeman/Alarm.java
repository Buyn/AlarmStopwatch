package com.Freeman;

import javax.swing.*;

/**
 * Created by BuYn on 09.12.2014.
 */
public class Alarm implements Runnable {
    Label   lbAlarm;
    Button  btAlarm;

    @Override
    public void run() {
        while (true) {
            runUpdate();
            try {
                Thread.sleep(Timer.SEKUNDS);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
/**
 * Constructors Block
 * */
    public Alarm(){
        lbAlarm = new Label("doAlarm: ");
        btAlarm = new Button();
        btAlarm.setAlarmButton (lbAlarm);
    }
/**
 *    wrapers block
 */
    public void runUpdate(){
        lbAlarm.doAlarm();
    }
/**
 * Geters and Seters block
*/
    public Label getLabel() {
        return lbAlarm;
    }
    public JLabel getJLabel() {
        return lbAlarm.getJLabel();
    }
    public Button getButton() {
        return btAlarm;
    }
    public JButton getJButton() {
        return btAlarm.getAlarm();
    }
}

/**experement block
 *
 *
 //mettods block
 //doTime block
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
 //    geters block
 public Timer getTimer() {
 return tTime;
 }
 }

 * */
