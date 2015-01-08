package com.Freeman;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * Created by BuYn on 08.01.2015.
 */
public class AlarmSound implements Runnable {
    String sUrl = "alarm.wav";

    @Override
    public void run(){
        System.out.println("AlarmSound.run - start");
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                Main.class.getResourceAsStream("/sounds/" + sUrl));
            clip.open(inputStream);
            clip.start();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("AlarmSound.run - end");
    }
}