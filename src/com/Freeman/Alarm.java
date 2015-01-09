package com.Freeman;
import com.Freeman.buttons.BttnAlarm;
import com.Freeman.buttons.Button;

import javax.swing.*;

/**
 * Created by BuYn on 09.12.2014.
 */
public class Alarm implements Runnable {
    Label lbAlarm;
    BttnAlarm btAlarm;
    Timer tTime;
    AlarmSound asSound ;

    @Override
    public void run() {
        while (true) {
            runUpdate();
            if (isAlarmSetoff()){
                playSound();
                resetAlarm(1);
            }
            try {
                Thread.sleep(Timer.SEKUNDS);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
    /**
     * Constructors Block
     */
    public Alarm() {
        asSound = new AlarmSound();
        lbAlarm = new Label("Alarm: ");
        tTime = new Timer();
        lbAlarm.setTime(tTime.getFormatedTime());
        runUpdate();
        btAlarm = new BttnAlarm(this);
    }
    /**
     * Metods block
     */
    public void runUpdate() {
        lbAlarm.setTime(tTime.getFormatTimeLeft());
        lbAlarm.updateLabel();
    }
    public boolean isAlarmSetoff (){
        if (tTime.getTimeLeft() <= 500) return true;
        return false;
    }
    public void resetAlarm(int iMinuts) {
        tTime.setAlarm(iMinuts);
        lbAlarm.updateLabel();
    }
    public void resetAlarm() {
        tTime.setAlarm();
        lbAlarm.updateLabel();
    }

    public void playSound(){
        Thread thSound = new Thread(asSound);
        thSound.start();
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
        return btAlarm.getjButton();
    }
    public Timer getTimer() {
        return tTime;
    }
}