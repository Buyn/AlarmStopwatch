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
     */
    public Alarm() {
        lbAlarm = new Label("Alarm: ");
        tTime = new Timer();
        lbAlarm.setTime(tTime.getFormatedTime());
        runUpdate();
        btAlarm = new BttnAlarm(this);
//        btAlarm = new BttnAlarm(lbAlarm);
    }
    /**
     * Metods block
     */
    public void runUpdate() {
        lbAlarm.setTime(tTime.getFormatTimeLeft());
        lbAlarm.updateLabel();
    }
    public void resetAlarm(int iMinuts) {
        tTime.setAlarm(iMinuts);
        lbAlarm.updateLabel();
    }
    public void resetAlarm() {
        tTime.setAlarm();
        lbAlarm.updateLabel();
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
        return btAlarm.getJButton();
    }
    public Timer getTimer() {
        return tTime;
    }
}