package com.Freeman;

import com.Freeman.buttons.*;
import com.Freeman.buttons.Button;
import com.Freeman.switches.SwitchPanel;
import javax.swing.*;
import java.awt.*;

/**
 * Created by BuYn on 03.12.2014.
 */
public class WinMain extends JFrame{
    private BttnResetAll    bResetAll;
    private ButtonExtender  bExtender;
    private Alarm           alAlarm;
    private Watch           waWatch;
    private SwitchPanel     panelSwitchs;

    public WinMain() {
    super("Alarm Stopwatch");
        setMainFrame();
    }
    private void setMainFrame(){
        setBounds(100, 100, 200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setComponennts();
    }
    private void setComponennts(){
        alAlarm         = new Alarm();
        waWatch         = new Watch();
        setLabels();
        setRadioButtons();
        setButtons();
    }
    private void setLabels(){
        JPanel jpLabels = new JPanel();
        jpLabels.setLayout(new BoxLayout(jpLabels , BoxLayout.Y_AXIS));
        jpLabels.add(waWatch.getJLabel());
        jpLabels.add(alAlarm.getjProgres());
        jpLabels.add(alAlarm.getJLabel());
        add(jpLabels, BorderLayout.CENTER);
    }
    private void setButtons(){
        //set reset buttons
        bResetAll           = new BttnResetAll(alAlarm , waWatch);
        add(bResetAll.getjButton(), BorderLayout.NORTH);
        //add to panel
        JPanel jpButtons    = new JPanel();
        jpButtons.setLayout(new BoxLayout(jpButtons , BoxLayout.X_AXIS));

        jpButtons.add(waWatch.getJButton());
        jpButtons.add(alAlarm.getJButton());
        bExtender = new ButtonExtender(panelSwitchs , this);
        jpButtons.add(bExtender.getjButton());
        add(jpButtons, BorderLayout.SOUTH);
    }
    private void setRadioButtons(){
        panelSwitchs        = new SwitchPanel(alAlarm);
        panelSwitchs.addSwitch(3);
        panelSwitchs.addSwitch(9,true);
        panelSwitchs.addSwitch(15);
        add(panelSwitchs.getjPanel(), BorderLayout.EAST);
    }

    public Button getbAlarm() {
        return alAlarm.getButton();
    }
    public Alarm getAlarm() {
        return alAlarm;
    }
    public Watch getWatch() {
        return waWatch;
    }
    public Button getbResetAll() {
        return bResetAll;
    }
}
