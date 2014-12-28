package com.Freeman;
import javax.swing.*;

/**
 * Created by BuYn on 09.12.2014.
 */
public class Alarm implements Runnable {
    Label lbAlarm;
    Button btAlarm;
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
        btAlarm = new Button();
        tTime = new Timer();
        lbAlarm.setTime(tTime.getFormatedTime());
        runUpdate();
        btAlarm.setAlarmButton(lbAlarm);
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
        return btAlarm.getAlarm();
    }
    public Timer getTimer() {
        return tTime;
    }
}