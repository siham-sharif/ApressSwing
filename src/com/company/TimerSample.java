package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerSample {

    public static void main(String args[]){

        Runnable runner = new Runnable() {
            @Override
            public void run() {

                ActionListener actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        System.out.println("Hello World from action performed");
                    }
                };

                Timer timer = new Timer(500, actionListener);
                timer.start();
            }
        };
        EventQueue.invokeLater(runner);

    }

}
