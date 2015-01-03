package com.Freeman.buttons;

import com.Freeman.Alarm;
import com.Freeman.Label;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BuYn on 07.12.2014.
 */
public class BttnAlarm extends Button {
    //Buttons Block
    private JButton jbAlarm;
    //Labels Block
//    private Label lbAlarm;
//todo must retern buttons on set
    //Metods Block
    public  BttnAlarm(Alarm alNewAlarm){
        alAlarm = alNewAlarm;
        jbAlarm = new JButton("Set Alarm");
        jbAlarm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                alAlarm.resetAlarm();
                alAlarm.runUpdate();
            }
        });
    }
    //Geters block
    public JButton getJButton() {
        return jbAlarm;
    }

}
