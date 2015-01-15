package com.Freeman;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

/**
 * Created by BuYn on 12.01.2015.
 */
public class RadioSwitch {
    JPanel jPanel;
    JPanel jRadioPanel;
    JPanel jTextPanel;
    ButtonGroup jRadioGroup;
    JRadioButton jRButton1;
    JRadioButton jRButton2;
    JRadioButton jRButton3;
    JRadioButton jRButton4;
    JRadioButton jRButton5;

    public RadioSwitch(){
        jPanel = new JPanel();
        jRadioPanel = new JPanel();
        //seting vertical adding
        jRadioPanel.setLayout(new BoxLayout(jRadioPanel , BoxLayout.Y_AXIS));
        setButtons();
        jPanel.add(jRadioPanel);
    }

    private void setButtons(){
        jRadioGroup = new ButtonGroup();
        jRButton1 = new JRadioButton("Alarm set:", true);
        jRButton2 = new JRadioButton("Alarm set:");
        jRButton3 = new JRadioButton("Alarm set:");
        jRButton1.setMnemonic(KeyEvent.VK_1);
        jRButton2.setMnemonic(KeyEvent.VK_2);
        jRButton3.setMnemonic(KeyEvent.VK_3);
        jRButton1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

            }
        });
        //add to grup
        jRadioGroup.add(jRButton1);
        jRadioGroup.add(jRButton2);
        jRadioGroup.add(jRButton3);
        //add to radio panel
        jRadioPanel.add(jRButton1);
        jRadioPanel.add(jRButton2);
        jRadioPanel.add(jRButton3);
    }

    public JPanel getjPanel() {
        return jPanel;
    }
}
