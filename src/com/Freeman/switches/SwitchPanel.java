package com.Freeman.switches;

import com.Freeman.Alarm;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by BuYn on 17.01.2015.
 */
public class SwitchPanel {
    private JPanel jPanelSwitchers;
    private JPanel jPanelHidenSwitchers;
    private JPanel jPanelSuming;
    private ArrayList<Switch> alSwitchers;
    private ButtonGroup groupSwitches;
    private Alarm aAlarm;

    public SwitchPanel(Alarm newAlarm){
        aAlarm              = newAlarm;
        jPanelSwitchers     = new JPanel();
        jPanelSwitchers.setLayout(new BoxLayout(jPanelSwitchers , BoxLayout.Y_AXIS));
        jPanelHidenSwitchers     = new JPanel();
        jPanelHidenSwitchers.setLayout(new BoxLayout(jPanelHidenSwitchers , BoxLayout.Y_AXIS));
        jPanelSuming     = new JPanel();
        jPanelSuming.setLayout(new BoxLayout(jPanelSuming , BoxLayout.X_AXIS));
        jPanelSuming.add(jPanelSwitchers);
        jPanelSuming.add(jPanelHidenSwitchers);
        jPanelHidenSwitchers.setVisible(false);
        groupSwitches       = new ButtonGroup();
        alSwitchers         = new ArrayList<Switch>(3);
    }

    public void addSwitch(int iInitalSet, boolean bState){
        alSwitchers.add(new Switch(aAlarm, iInitalSet, bState));
        //to get Last addet element - alSwitchers.get(alSwitchers.size()-1)
        jPanelSwitchers.add(alSwitchers.get(alSwitchers.size()-1).getjPanel());
        alSwitchers.get(alSwitchers.size()-1).setButtonGroupListener(groupSwitches);
    }
    public void addSwitch(int iInitalSet){
        alSwitchers.add(new Switch(aAlarm, iInitalSet));
        //to get Last addet element - alSwitchers.get(alSwitchers.size()-1)
        jPanelSwitchers.add(alSwitchers.get(alSwitchers.size()-1).getjPanel());
        alSwitchers.get(alSwitchers.size()-1).setButtonGroupListener(groupSwitches);
    }
    public void addHidenSwitch(int iInitalSet){
        alSwitchers.add(new Switch(aAlarm, iInitalSet));
        //to get Last addet element - alSwitchers.get(alSwitchers.size()-1)
        jPanelHidenSwitchers.add(alSwitchers.get(alSwitchers.size()-1).getjPanel());
        alSwitchers.get(alSwitchers.size()-1).setButtonGroupListener(groupSwitches);
    }

    public JPanel getjPanel() {
        return jPanelSuming;
    }
}
