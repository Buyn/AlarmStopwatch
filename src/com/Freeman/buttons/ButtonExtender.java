package com.Freeman.buttons;

import com.Freeman.switches.SwitchPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BuYn on 18.01.2015.
 */
public class ButtonExtender {
    public JButton jButton;
    public boolean bOpen = true;
    public SwitchPanel panelSwitchers;
    public JFrame jFrame;

    public ButtonExtender(SwitchPanel swPanel, JFrame newjFrame){
        jFrame = newjFrame;
        panelSwitchers = swPanel;
        jButton =  new JButton(">>");
        jButton.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 trigerButton();
             }
        });
    }
    public ButtonExtender(SwitchPanel swPanel){
        panelSwitchers = swPanel;
         jButton =  new JButton(">>");
         jButton.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 trigerButton();
             }
         });
     }

    private void trigerButton(){
        if (bOpen){
            closePanel();
            return;
        }
        openPanel();
    }
    private void closePanel(){
        bOpen = false;
        panelSwitchers.getjPanel().setVisible(false);
        jFrame.pack();
        jButton.setText(">>");
    }
    private void openPanel(){
        bOpen = true;
        panelSwitchers.getjPanel().setVisible(true);
        jFrame.pack();
        jButton.setText("<<");
    }

    public JButton getjButton() {
        return jButton;
    }
}
