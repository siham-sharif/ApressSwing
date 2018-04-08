package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeyTextTester {
    public static void main (String args[]){

        Runnable runner = new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Key Text Sample");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                KeyTextComponent keyTextComponent = new KeyTextComponent();
                final JTextField textField = new JTextField();

                ActionListener actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        String keyText = actionEvent.getActionCommand();
                        textField.setText(keyText);
                    }
                };

                keyTextComponent.addActionListener(actionListener);

                frame.add(keyTextComponent, BorderLayout.CENTER);
                frame.add(textField, BorderLayout.SOUTH);
                frame.setSize(300, 200);
                frame.setVisible(true);
            }
        };
        EventQueue.invokeLater(runner);


    }

}
