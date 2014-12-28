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
        return lbWatch.getJLabel();
    }
    public Button getButton() {
        return btWatch;
    }

    public JButton getJButton() {
        return btWatch.getStopWatch();
    }
    /**experement block
     *
     *
     private String  sTime;
     private String sText = "Sekunds: ";
     //labels block
     private JLabel jlWatch;
     //doTime block
     //mettods block
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
     public void updateLabel(){
     jlWatch.setText(sText + sTime);
     }
     //Seters Block
     public void setText(String sNewText){
     sText = sNewText;
     updateLabel();
     }
     //    geters block
     public Timer getTimer() {
     return tTime;
     }
     public JLabel getJLabel() {
     return jlWatch;
     }
     }

     * */

}