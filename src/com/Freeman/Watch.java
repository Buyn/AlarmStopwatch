package com.Freeman;

import javax.swing.*;

/**
 * Created by BuYn on 09.12.2014.
 * todo runable
 * todo create label and button
 */
public class Watch  implements Runnable {
    Label   lbWatch;
    Button  btWatch;

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
        btWatch.setWatchButton(lbWatch);
    }
    /**
     *    wripers block
     */
    public void runUpdate(){
        lbWatch.doTime();
    }
    /**
     * Geters and Seters block
     */
    public Label getLabel() {
        return lbWatch;
    }
    public JLabel getJLabel() {
        return lbWatch.getLabel();
    }
    public Button getButton() {
        return btWatch;
    }
    public JButton getJButton() {
        return btWatch.getStopWatch();
    }
}