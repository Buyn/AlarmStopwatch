package com.Freeman.buttons;

import com.Freeman.Alarm;
import com.Freeman.Watch;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by BuYn on 07.12.2014.
 */
public class BttnStopwatch extends Button{
    private JButton jbResetAll;
    //Metods Block
    public JButton setResetAllButton(Alarm alNewAlarm, Watch wtNewWatch) {
        alAlarm = alNewAlarm;
        wtWatch = wtNewWatch;
        this.jbStopWatch = new JButton("Reset All");
        jbStopWatch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                alAlarm.resetAlarm();
                alAlarm.runUpdate();
                wtWatch.resetTime();
                wtWatch.runUpdate();
            }
        });
        return jbResetAll;
    }
    //Geters block
    public JButton getJbStopWatch() {
        return jbStopWatch;
    }
    public void setJbResetAll(JButton jbResetAll) {
        this.jbResetAll = jbResetAll;
    }
}
