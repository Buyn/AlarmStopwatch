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
public class BttnResetAll extends Button {
    private JButton jbResetAll;
    //Metods Block
    public  BttnResetAll(Alarm alNewAlarm, Watch wtNewWatch) {
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
    }
    //Geters block
    public JButton getJResetAll() {
        return jbStopWatch;
    }
    public void setJResetAll(JButton jbResetAll) {
        this.jbResetAll = jbResetAll;
    }
}
