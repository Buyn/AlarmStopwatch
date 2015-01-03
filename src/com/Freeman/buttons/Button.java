package com.Freeman.buttons;

import com.Freeman.Alarm;
import com.Freeman.Label;
import com.Freeman.Watch;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BuYn on 07.12.2014.
 */
public abstract class Button {
    //Buttons Block
    //Labels Block
    //
    protected Alarm alAlarm;
    protected Watch wtWatch;
    //setter block
    public void setAlAlarm(Alarm alAlarm) {
        this.alAlarm = alAlarm;
    }
    public void setWtWatch(Watch wtWatch){
        this.wtWatch = wtWatch;
    }
    //Metods Block
    //Geters block
    public Alarm getAlAlarm() {
        return alAlarm;
    }
    public Watch getWatch() {
        return wtWatch;
    }
}
