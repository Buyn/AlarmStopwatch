package com.Freeman;

import javax.swing.*;

/**
 * Created by BuYn on 09.12.2014.
 * todo raname button
 * todo set Text
 * todo
 */
public class Watch  implements Runnable {
    Label   lbWatch;
    Button  btWatch;
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
     * */
    public Watch(){
        lbWatch = new Label();
        btWatch = new Button();
        tTime = new Timer();
        lbWatch.setTime(tTime.getFormatedTime());
        doTime();
        btWatch.setWatchButton(lbWatch);
    }
    public void doTime(){
        lbWatch.setTime(tTime.getFormatDeltaTime());
        lbWatch.updateLabel();
    }
    /**
     *    wripers block
     */
    public void runUpdate(){
        doTime();
    }
    public void resetTime(){
        tTime.setToZeroStart();
        doTime();
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