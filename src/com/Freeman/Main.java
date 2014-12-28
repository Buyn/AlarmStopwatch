package com.Freeman;

public class Main {

    public static void main(String[] args) {
//	write your code here
        WinMain winMain = new WinMain();
        winMain.setVisible(true);
        winMain.pack();
        Thread tAlarm = new Thread(winMain.getAlarm());
        Thread tWatch = new Thread(winMain.getWatch());
        tAlarm.start();
        tWatch.start();
        /*
        Label lAlarm    = winMain.getLbAlarm();
        Label lTime     = winMain.getLbWatch();
            lTime.doTime();
            lAlarm.doAlarm();
        */
        while (true){
            try {
                Thread.sleep(Timer.SEKUNDS);
            }catch (InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
    }
}