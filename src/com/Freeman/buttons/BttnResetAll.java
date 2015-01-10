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
    //Metods Block
    public  BttnResetAll(Alarm alNewAlarm, Watch wtNewWatch) {
        alAlarm = alNewAlarm;
        wtWatch = wtNewWatch;
        this.jButton = new JButton("<html><span style='font-size:20px' >"+"Reset All"+"</span></html>");
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

}
