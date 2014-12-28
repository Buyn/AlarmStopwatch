package com.Freeman;

import javax.swing.*;
import java.awt.*;


/**
 * Created by BuYn on 03.12.2014.
 */
public class WinMain extends JFrame{
    private Button bResetAll;
    private Alarm alAlarm;
    private Watch waWatch;

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
//        delate coments for adding table
//        setTable();
    }
    private void setLabels(){
//        lbWatch = new Label();
        JPanel jpLabels = new JPanel();
        jpLabels.add(waWatch.getJLabel());
        jpLabels.add(alAlarm.getJLabel());
        add(jpLabels, BorderLayout.NORTH);
    }
    private void setButtons(){
        //set reset button
        bResetAll = new Button();
        bResetAll.setResetAllButton(waWatch.getLabel(), alAlarm.getLabel());
        add(bResetAll.getResetAll());
        //add to panel
        JPanel jpButtons = new JPanel();
        jpButtons.add(waWatch.getJButton());
        jpButtons.add(alAlarm.getJButton());
        add(jpButtons, BorderLayout.SOUTH);
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

    public Label getLbWatch() {
        return waWatch.getLabel();
    }
    public Label getLbAlarm() {
        return alAlarm.getLabel();
    }
    public Button getbWatch() {
        return waWatch.getButton();
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
