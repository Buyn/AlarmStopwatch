package com.Freeman;

import com.Freeman.buttons.*;

import javax.swing.*;
import java.awt.*;


/**
 * Created by BuYn on 03.12.2014.
 */
public class WinMain extends JFrame{
    private BttnResetAll bResetAll;
    private Alarm alAlarm;
    private Watch waWatch;
    private RadioSwitch rsRadioPanel;

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
        alAlarm = new Alarm();
        waWatch = new Watch();
        setLabels();
        setButtons();
        rsRadioPanel = new RadioSwitch(alAlarm);
        add(rsRadioPanel.getjPanel(), BorderLayout.EAST);

//        delate coments for adding table
//        setTable();
    }
    private void setLabels(){
        JPanel jpLabels = new JPanel();
        jpLabels.setLayout(new BoxLayout(jpLabels , BoxLayout.Y_AXIS));
        jpLabels.add(waWatch.getJLabel());
        jpLabels.add(alAlarm.getjProgres());
        jpLabels.add(alAlarm.getJLabel());
//        waWatch.getJLabel().setFont(new Font("Serif", Font.PLAIN, 140));
        add(jpLabels, BorderLayout.CENTER);
    }
    private void setButtons(){
        //set reset buttons
        bResetAll = new BttnResetAll(alAlarm , waWatch);
        add(bResetAll.getjButton(), BorderLayout.NORTH);
        //add to panel
        JPanel jpButtons = new JPanel();
        jpButtons.add(waWatch.getJButton());
        jpButtons.add(alAlarm.getJButton());
        add(jpButtons, BorderLayout.SOUTH);
    }
    private void setRadioButton(){
        JTextField jText = new JTextField("15");
    }
    private void setTable (){
        Object rowData[][] = {
                { "1 1", "1 2", "1 3" },
                { "2 1", "2 2", "2 3" }
        };
        Object columnNames[] = { "Колонка 1", "Колонка 2", "Колонка 3" };
        JTable table = new JTable(rowData, columnNames);
        add(table);
    }

    public com.Freeman.buttons.Button getbAlarm() {
        return alAlarm.getButton();
    }
    public Alarm getAlarm() {
        return alAlarm;
    }
    public Watch getWatch() {
        return waWatch;
    }
    public com.Freeman.buttons.Button getbResetAll() {
        return bResetAll;
    }
}
