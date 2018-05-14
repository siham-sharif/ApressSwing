package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonSample01 {

    public static void main(String args[]){

     Runnable runner = new Runnable() {
         @Override
         public void run() {

             JFrame frame = new JFrame("Button Sample");
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

             JButton button = new JButton("Select me");

             //Define Action Listener
             ActionListener actionListener = new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent actionEvent) {
                     System.out.println("I was selected!");

                 }
             };
             // Attach Listener
             button.addActionListener(actionListener);


             frame.add(button, BorderLayout.SOUTH);
             frame.setSize(300,100);
             frame.setVisible(true);
         }
     };
     EventQueue.invokeLater(runner);
    }
}
