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
 *    wripers block
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
        return lbAlarm.getLabel();
    }
    public Button getButton() {
        return btAlarm;
    }
    public JButton getJButton() {
        return btAlarm.getAlarm();
    }
}

