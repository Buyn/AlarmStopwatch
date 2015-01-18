package com.Freeman.switches;

import com.Freeman.Alarm;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by BuYn on 17.01.2015.
 */
public class SwitchPanel {
    private JPanel jPanelSwitchers;
    private ArrayList<Switch> alSwitchers;
    private ButtonGroup groupSwitches;
    private Alarm aAlarm;

    public SwitchPanel(Alarm newAlarm){
        aAlarm              = newAlarm;
        jPanelSwitchers     = new JPanel();
        jPanelSwitchers.setLayout(new BoxLayout(jPanelSwitchers , BoxLayout.Y_AXIS));
        groupSwitches       = new ButtonGroup();
        alSwitchers         = new ArrayList<Switch>(3);
    }

    public void addSwitch(int iInitalSet){
        alSwitchers.add(new Switch(aAlarm, iInitalSet));
        jPanelSwitchers.add(alSwitchers.get(alSwitchers.size()-1).getjPanel());
        groupSwitches.add(alSwitchers.get(alSwitchers.size()-1).getjRadioButton());
    }
    public void addSwitch(int iInitalSet, boolean bState){
        alSwitchers.add(new Switch(aAlarm, iInitalSet, bState));
        jPanelSwitchers.add(alSwitchers.get(alSwitchers.size()-1).getjPanel());
        groupSwitches.add(alSwitchers.get(alSwitchers.size()-1).getjRadioButton());
    }

    public JPanel getjPanel() {
        return jPanelSwitchers;
    }
}
