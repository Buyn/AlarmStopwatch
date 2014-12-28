package com.Freeman;

import javax.swing.*;

/**
 * Created by BuYn on 09.12.2014.
 * todo runable
 * todo create label and button
 */
public class Watch  implements Runnable {
    Label   lbAlarm;
    Button  btAlarm;

    @Override
    public void run() {

    }
    /**
     * Constructors Block
     * */
    public Watch(){
        lbAlarm = new Label("doAlarm: ");
        btAlarm = new Button();
        btAlarm.setAlarmButton (lbAlarm);
    }
    /**
     *    wripers block
     */
    public void runUpdate(){
        lbAlarm.updateLabel();
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