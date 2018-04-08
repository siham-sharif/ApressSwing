package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Random;

public class BoundSample {

    public static void main(String args[]){

        Runnable runner = new Runnable() {
            @Override
            public void run() {

                JFrame frame = new JFrame("Button Sample");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                final JButton button1 = new JButton("Button 1");
                final JButton button2 = new JButton("Button 2");

                final Random random = new Random();

                // Action Listener
                ActionListener actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        JButton button = (JButton)actionEvent.getSource();
                        int red = random.nextInt(255);
                        int green = random.nextInt(255);
                        int blue = random.nextInt(255);

                        button.setBackground(new Color(red,green,blue));
                    }
                };

                PropertyChangeListener propertyChangeListener = new PropertyChangeListener() {
                    @Override
                    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
                        String property = propertyChangeEvent.getPropertyName();
                        if("background".equals(property)){
                            button2.setBackground((Color)propertyChangeEvent.getNewValue());
                        }
                    }
                };

                // Attach Listeners
                button1.addActionListener(actionListener);
                button1.addPropertyChangeListener(propertyChangeListener); // change in button 1 will reflect in button 2

                button2.addActionListener(actionListener);


                //// frame size and location
                frame.add(button1, BorderLayout.NORTH);
                frame.add(button2, BorderLayout.SOUTH);

                frame.setSize(300,100);
                frame.setVisible(true);
            }
        };

        EventQueue.invokeLater(runner);
    }

}
