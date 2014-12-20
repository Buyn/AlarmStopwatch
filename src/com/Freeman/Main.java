package com.Freeman;

public class Main {

    public static void main(String[] args) {
//	write your code here
        WinMain winMain = new WinMain();
        winMain.setVisible(true);
        winMain.pack();
        Label lAlarm    = winMain.getLbAlarm();
        Label lTime     = winMain.getLbWatch();
        while (true){
            lAlarm.doAlarm();
            lTime.doTime();
            try {
                Thread.sleep(Timer.SEKUNDS);
            }catch (InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
    }
}