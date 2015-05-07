package com.Freeman.switches;

import com.Freeman.Alarm;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by BuYn on 17.01.2015.
 */
public class Switch {
    private JPanel          jPanel;
    private JRadioButton    jRadioButton;
    private JSpinner        jSpinner;
    private Alarm           aAlarm;

    public Switch (Alarm newAlarm ,int iInitialSet, boolean bState){
        aAlarm =newAlarm;
        setButton(bState);
        setSpinner(iInitialSet);
        setPanel();
    }
    public Switch (Alarm newAlarm ,int iInitialSet){
        aAlarm =newAlarm;
        setButton();
        setSpinner(iInitialSet);
        setPanel();
    }
    //private metods
    private void setButton(){
        jRadioButton = new JRadioButton("Alarm set:");
        //addChangeListener
        jRadioButton.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (jRadioButton.isSelected())
                    aAlarm.setTimerAlarm((Integer)(jSpinner.getValue()));
            }
        });
    }
    private void setButton(boolean bState){
        jRadioButton = new JRadioButton("Alarm set:" , bState);
        jRadioButton.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (jRadioButton.isSelected())
                    aAlarm.setTimerAlarm((Integer)(jSpinner.getValue()));
            }
        });
    }
    private void setListeners(){
        //addChangeListener
        jRadioButton.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                if (jRadioButton.isSelected())
                    aAlarm.setTimerAlarm((Integer)(jSpinner.getValue()));
            }
        });
        jRadioButton.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent event) {
                if (jRadioButton.isSelected())
                    aAlarm.setTimerAlarm((Integer) (jSpinner.getValue()));
            }
        });
    }

    private void setSpinner(int iInitialSet){
        jSpinner = new JSpinner(new SpinnerNumberModel(
                iInitialSet , //inital value
                1,  //from
                999,//to
                1)//step
        );
    }
    private void setPanel(){
        jPanel = new JPanel();
        jPanel.add(jRadioButton);
        jPanel.add(jSpinner);
    }
    //geters
    public JRadioButton getjRadioButton() {
        return jRadioButton;
    }
    public JPanel getjPanel() {
        return jPanel;
    }
}
