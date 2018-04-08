package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Timer;

public class TimerSample {
    public static void main(String args[]){

        Runnable runner = new Runnable() {
            @Override
            public void run() {
                ActionListener actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        System.out.println("Timer from Action Listener!");

                    }
                };
                //Timer timer = new Timer(500, actionListener);
            }
        };
        EventQueue.invokeLater(runner);
    }
}
