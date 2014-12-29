package com.Freeman.buttons;

import com.Freeman.Label;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by BuYn on 07.12.2014.
 */
public class BttnStopwatch extends Button{
    //Buttons Block
    private JButton jbStopWatch;
    //Labels Block
    private Label lbWatch;
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
    //Geters block
    public JButton getStopWatch() {
        return jbStopWatch;
    }
}
