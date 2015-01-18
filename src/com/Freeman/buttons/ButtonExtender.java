package com.Freeman.buttons;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BuYn on 18.01.2015.
 */
public class ButtonExtender {
    JButton jButton;
    boolean bOpen = false;

    public ButtonExtender(){
         jButton =  new JButton(">>");
         jButton.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 System.out.println("WinMain.actionPerformed");
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
        System.out.println("ButtonExtender.closePanel");
        jButton.setText(">>");
    }
    private void openPanel(){
        bOpen = true;
        System.out.println("ButtonExtender.openPanel");
        jButton.setText("<<");
    }

    public JButton getjButton() {
        return jButton;
    }
}
