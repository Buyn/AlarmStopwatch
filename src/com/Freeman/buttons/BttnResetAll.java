package com.Freeman.buttons;

import com.Freeman.Alarm;
import com.Freeman.Watch;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BuYn on 07.12.2014.
 */
public class BttnResetAll extends Button {
//    private JButton jButton;
    //Metods Block
    public  BttnResetAll(Alarm alNewAlarm, Watch wtNewWatch) {
        alAlarm = alNewAlarm;
        wtWatch = wtNewWatch;
        this.jButton = new JButton("Reset All");
        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                alAlarm.resetAlarm();
                alAlarm.runUpdate();
                wtWatch.resetTime();
                wtWatch.runUpdate();
            }
        });
    }
    //Geters block
//    public JButton getjButton() {
//        return jButton;
//    }

}
