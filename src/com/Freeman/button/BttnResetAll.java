package com.Freeman.button;

import com.Freeman.Button;
import com.Freeman.Label;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BuYn on 07.12.2014.
 */
public class BttnResetAll extends Button {
    //Buttons Block
    private JButton jbResetAll;
    //Labels Block
    private Label lbWatch;
    private Label lbAlarm;
//todo must retern buttons on set
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
    //Geters block
    public JButton getResetAll() {
        return jbResetAll;
    }
}
