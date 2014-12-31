package com.Freeman.buttons;

import com.Freeman.Alarm;
import com.Freeman.Label;
import com.Freeman.Watch;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BuYn on 07.12.2014.
 */
public class Button {
    //Buttons Block
    private JButton jbStopWatch;
    private JButton jbAlarm;
    //Labels Block
    private Label lbWatch;
    private Label lbAlarm;
    //
    protected Alarm alAlarm;
    protected Watch wtWatch;
    //Metods Block
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
                lbAlarm.doAlarm();
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
    //setter block
    public void setAlAlarm(Alarm alAlarm) {
        this.alAlarm = alAlarm;
    }
    public void setWtWatch(Watch wtWatch)


    {
        this.wtWatch = wtWatch;
    }
    public void setJStopWatch(JButton jbStopWatch) {
        this.jbStopWatch = jbStopWatch;
    }
}
