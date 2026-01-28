package com.scientific;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                Calculator frame = new Calculator();
                frame.setVisible(true);
            }
        });
    }
}