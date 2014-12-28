package com.Freeman;

import javax.swing.*;
import java.awt.*;


/**
 * Created by BuYn on 03.12.2014.
 */
public class WinMain extends JFrame{
//    private Label lbAlarm;
    private Label lbWatch;
    private Button bResetAll;
//    private Button bAlarm;
    private Button bWatch;
    private Alarm alAlarm;

    public WinMain() {
    super("doAlarm Stopwatch");
        setMainFrame();
    }
    private void setMainFrame(){
        setBounds(100, 100, 200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setComponennts();
    }
    private void setComponennts(){
        alAlarm = new Alarm();
        setLabels();
        setButtons();
//        delate coments for adding table
//        setTable();
    }
    private void setLabels(){
//        lbAlarm = alAlarm.getLabel();
        lbWatch = new Label();
        JPanel jpLabels = new JPanel();
        jpLabels.add(lbWatch.getLabel());
        jpLabels.add(alAlarm.getJLabel());
        add(jpLabels, BorderLayout.NORTH);
    }
    private void setButtons(){
        //set reset button
        bResetAll = new Button();
        bResetAll.setResetAllButton(lbWatch, alAlarm.getLabel());
        add(bResetAll.getResetAll());
        //create buttons for panell
//        bAlarm = new Button();
//        bAlarm.setAlarmButton (lbAlarm);
        bWatch = new Button();
        bWatch.setWatchButton (lbWatch);
        //add to panel
        JPanel jpButtons = new JPanel();
        jpButtons.add(bWatch.getStopWatch());
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
        return lbWatch;
    }
    public Label getLbAlarm() {
        return alAlarm.getLabel();
    }
    public Button getbWatch() {
        return bWatch;
    }
    public Button getbAlarm() {
        return alAlarm.getButton();
    }
    public Button getbResetAll() {
        return bResetAll;
    }
}
