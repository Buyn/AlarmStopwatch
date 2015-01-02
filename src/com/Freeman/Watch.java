package com.Freeman;

import com.Freeman.buttons.BttnStopwatch;
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
    Timer   tTime;
    BttnStopwatch btStopwatch;
    boolean bPause = false;

    @Override
    public void run() {
        while (true) {
            if (!bPause) runUpdate();
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
        tTime = new Timer();
        lbWatch.setTime(tTime.getFormatedTime());
        runUpdate();
        btStopwatch = new BttnStopwatch(this);
    }
 /**
  * Metods Block
  * */
    public void runUpdate(){
        lbWatch.setTime(tTime.getFormatDeltaTime());
        lbWatch.updateLabel();
    }
    public void trigerPause(){
        if (bPause) {
            unPause();
            return;
        }
        setPause();
    }
    public void setPause(){
        bPause = true;
        btStopwatch.setTextToButton("Start");
        tTime.setPause();
    }
    public void unPause(){
        bPause = false;
        tTime.unPause();
        btStopwatch.setTextToButton("Pause");
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
    public JButton getJButton() {
        return btStopwatch.getJButton();
    }
    public BttnStopwatch getButton() {
        return btStopwatch;
    }
    public Timer getTimer() {
        return tTime;
    }

}