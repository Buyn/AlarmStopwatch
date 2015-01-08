package com.Freeman;

import java.text.SimpleDateFormat;

/**
 * Created by BuYn on 12.12.2014.
 */
public class Timer {
    //Constants
    public static int SEKUNDS = 1000;
    public static int MINUTS = SEKUNDS * 60;
    public static int HOURS = MINUTS * 60;
    public static int UA = HOURS * 2;
    public static int DEFAULT_ALARM = 9;
    //INECEALISATION
    private long lStart = 0;
    private long lSet   = 0;
    private long lPause = 0;
    private SimpleDateFormat sdf;
//    End of Intedger Block
// Bagen of Constructors block
    public Timer(){
        sdf = new SimpleDateFormat("HH:mm:ss");
        lStart = System.currentTimeMillis();
        long lMinuts =   MINUTS *9;
        lSet = lStart + (DEFAULT_ALARM * MINUTS);
    }
    public Timer(int iMinuts) {
        lStart = System.currentTimeMillis();
        lSet = lStart + (iMinuts * MINUTS);
        sdf = new SimpleDateFormat("HH:mm:ss");
    }
    //    end of Constructors block
//    Bagen of Metods block
//    Private Metods
    private String formatLong(long lConvert){
        return sdf.format(lConvert - UA);
    }
    private long getNow(){
        return System.currentTimeMillis();
    }
//  Public  Metods
    public String getFormatTimeLeft(){
        return formatLong(getTimeLeft());
    }
    public long getTimeLeft(){
        return lSet - getNow();
    }
    public String getFormatDeltaTime(){
        return formatLong(getDeltaTime());}
    public long getDeltaTime() {
        return getNow() - lStart + lPause;
    }
    public String getFormatedTime(){
        return formatLong(getNow());
    }
    public void setPause(){
        lPause = getNow() - lStart + lPause;
        lStart = getNow();
    }
    public void unPause(){
        lStart = getNow();
    }
//    End of Metods block
//  seters and geters
    public void setToZeroStart(){
        lStart = getNow();
        lPause = 0;
    }
    public void setAlarm() {
        lSet = getNow() + (DEFAULT_ALARM * MINUTS);
    }
    public void setAlarm(int iMinuts) {
        lSet = getNow() + (iMinuts * MINUTS);
    }
    public void setStart(long dStart) {
        this.lStart = dStart;
    }
    public void setPause(long lPause) {
        this.lPause = lPause;
    }
    public long getPause() {
        return lPause;
    }
    public long getAlarm() {
        return lSet;
    }
    public long getStart() {
        return lStart;
    }

}
