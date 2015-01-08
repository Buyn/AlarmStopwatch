package com.Freeman;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

/**
 * Created by BuYn on 08.01.2015.
 */
public class AlarmSound implements Runnable {
    String sUrl = "alarm.wav";


    @Override
    public void run(){
        runSound();
    }

    public void runSound(){
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                    new File("/alarm.wav"));
            clip.open(inputStream);
            clip.start();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}