package com.Freeman.buttons;

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
    private Label lbAlarm;
//todo must retern buttons on set
    //Metods Block
    public JButton setAlarmButton(Label lbNewAlarm){
        this.lbAlarm = lbNewAlarm;
        jbAlarm = new JButton("Set doAlarm");
        jbAlarm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lbAlarm.doAlarm();
            }
        });
        return jbAlarm;
    }
    //Geters block
    public JButton getAlarm() {
        return jbAlarm;
    }

}
