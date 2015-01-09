package com.Freeman.buttons;

import com.Freeman.Alarm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BuYn on 07.12.2014.
 */
public class BttnAlarm extends Button {
    //Buttons Block
//    private JButton jButton;
    //Labels Block
//    private Label lbAlarm;
//todo must retern buttons on set
    //Metods Block
    public  BttnAlarm(Alarm alNewAlarm){
        alAlarm = alNewAlarm;
        jButton = new JButton("Set Alarm");
        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                alAlarm.resetAlarm();
                alAlarm.runUpdate();
            }
        });
    }
    //Geters block
//    public JButton getjButton() {
//        return jButton;
//    }

}
