package com.Freeman;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

/**
 * Created by BuYn on 12.01.2015.
 */
public class RadioSwitch {
    private JPanel jPanel;
    private JPanel jRadioPanel;
    private JPanel jTextPanel;
    private ButtonGroup jRadioGroup;
    private JRadioButton jRButton1;
    private JRadioButton jRButton2;
    private JRadioButton jRButton3;
    //spiners
    private JSpinner jSpinner1;
    private JSpinner jSpinner2;
    private JSpinner jSpinner3;
    /*
    * Construktor
    * */
    public RadioSwitch(){
        jPanel = new JPanel();
        setButtons();
        setTextFelds();
    }

    private void setButtons(){
        jRadioPanel = new JPanel();
        //seting vertical adding
        jRadioPanel.setLayout(new BoxLayout(jRadioPanel , BoxLayout.Y_AXIS));
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
                if (jRButton1.isSelected()) {
                    System.out.println("RadioSwitch.itemStateChanged" + jSpinner1.getValue());

                }
            }
        });
        jRButton2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
            }
        });
        jRButton3.addItemListener(new ItemListener() {
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
        jPanel.add(jRadioPanel);
    }

    private void setTextFelds(){
        jTextPanel = new JPanel();
        //seting vertical adding
        jTextPanel.setLayout(new BoxLayout(jTextPanel , BoxLayout.Y_AXIS));
        //int spiners
        jSpinner1 = new JSpinner(setModel(3));
        jSpinner2 = new JSpinner(setModel(9));
        jSpinner3 = new JSpinner(setModel(15));
//        jSpinner1.get
        jTextPanel.add(jSpinner1);
        jTextPanel.add(jSpinner2);
        jTextPanel.add(jSpinner3);
        jPanel.add(jTextPanel);
    }

    private SpinnerModel setModel(int iSet){
        return new SpinnerNumberModel(
                iSet , //inital
                1,  //from
                999,//to
                1);//step

    }

    public JPanel getjPanel() {
        return jPanel;
    }
}
