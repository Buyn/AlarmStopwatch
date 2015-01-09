package com.Freeman.buttons;

import com.Freeman.Watch;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by BuYn on 07.12.2014.
 */
public class BttnStopwatch extends Button{
//    private JButton jButton;

    public BttnStopwatch(Watch wtNewWatch){
        super.wtWatch = wtNewWatch;
        jButton = new JButton("Pause");
        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                wtWatch.trigerPause();
                wtWatch.runUpdate();
            }
        });
    }
    //Metods Block
//    public void setTextToButton(String sText){
//    jButton.setText(sText);
//    }
    //Geters block
//    public JButton getjButton() {
//        return jButton;
//    }
}
