package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonSample {

    public static void main(String args[]){

        Runnable runner = new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Button Sample");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JButton button = new JButton("Select ME!");

                // Define ActionListener
                ActionListener actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("I was selected");
                    }
                };

                // Attach listener
                button.addActionListener(actionListener);

                // frame size and location
                frame.add(button, BorderLayout.SOUTH);
                frame.setSize(300, 100);
                frame.setVisible(true);
            }
        };
        EventQueue.invokeLater(runner);

    }

}
