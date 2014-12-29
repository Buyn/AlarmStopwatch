package com.Freeman;

import com.Freeman.buttons.Button;

import javax.swing.*;

/**
 * Created by BuYn on 09.12.2014.
 * todo raname buttons
 * todo set Text
 * todo
 */
public class Watch  implements Runnable {
    Label   lbWatch;
    Button btWatch;
    Timer   tTime;

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
    public Watch(){
        lbWatch = new Label();
        btWatch = new Button();
        tTime = new Timer();
        lbWatch.setTime(tTime.getFormatedTime());
        runUpdate();
        btWatch.setWatchButton(lbWatch);
    }
 /**
  * Metods Block
  * */
    public void runUpdate(){
        lbWatch.setTime(tTime.getFormatDeltaTime());
        lbWatch.updateLabel();
    }
    public void resetTime(){
        tTime.setToZeroStart();
        runUpdate();
    }
    /**
     * Geters and Seters block
     */
    public Label getLabel() {
        return lbWatch;
    }
    public JLabel getJLabel() {
        return lbWatch.getJLabel();
    }
    public Button getButton() {
        return btWatch;
    }
    public JButton getJButton() {
        return btWatch.getStopWatch();
    }
    public Timer getTimer() {
        return tTime;
    }
}