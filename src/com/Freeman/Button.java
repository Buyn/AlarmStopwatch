package com.Freeman;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BuYn on 07.12.2014.
 */
public class Button {
    //Buttons Block
    private JButton jbResetAll;
    private JButton jbStopWatch;
    private JButton jbAlarm;
    //Labels Block
    private Label lbWatch;
    private Label lbAlarm;
    //Metods Block
    public JButton setResetAllButton(Label lbNewWatch, Label lbNewAlarm){
        this.lbAlarm = lbNewAlarm;
        this.lbWatch = lbNewWatch;
        jbResetAll = new JButton("Reset All");
        jbResetAll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lbAlarm.resetAlarm();
                lbAlarm.doAlarm();
                lbWatch.resetTime();
                lbWatch.doTime();
            }
        });
        return jbResetAll;
    }
    public JButton setWatchButton(Label lNewWatch){
        this.lbWatch = lNewWatch;
        jbStopWatch = new JButton("Start");
        jbStopWatch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lbWatch.doTime();
            }
        });
        return jbStopWatch;
    }
    public JButton setAlarmButton(Label lbNewAlarm){
        this.lbAlarm = lbNewAlarm;
        jbAlarm = new JButton("Set Alarm");
        jbAlarm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lbAlarm.resetAlarm();
                lbAlarm.updateLabel();
            }
        });
        return jbAlarm;
    }
    //Geters block
    public JButton getAlarm() {
        return jbAlarm;
    }

    public JButton getStopWatch() {
        return jbStopWatch;
    }

    public JButton getResetAll() {
        return jbResetAll;
    }
}
