package com.Freeman;

import javax.swing.*;

/**
 * Created by BuYn on 09.12.2014.
 */
public class Label {
    //Integer block
        private String  sTime;
        private String sText = "Sekunds: ";
        //labels block
        private JLabel jLabel;
        //doTime block
        //Constructor block
        public  Label(){
            jLabel = new JLabel(sText + sTime);
        }
        public  Label(String sNewText){
            sText=sNewText;
            jLabel = new JLabel(sText + sTime);
        }
        //mettods block
    public void updateLabel(){
        jLabel.setText(sText + sTime);
    }
    //Seters Block
    public void setText(String sNewText){
        sText = sNewText;
        updateLabel();
    }
    public void setTime(String sNewText){
        sTime = sNewText;
        updateLabel();
    }
    //    geters block
    public JLabel getJLabel() {
        return jLabel;
    }
}
