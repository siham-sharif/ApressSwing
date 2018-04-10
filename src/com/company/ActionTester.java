package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ActionTester {
    public static void main(String args[]){

        Runnable runner = new Runnable() {
            @Override
            public void run() {

                JFrame frame = new JFrame("Action Sample");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                final Action printAction = new PrintHelloAction();

                // adding menu bar and menu
                JMenuBar menuBar = new JMenuBar();
                JMenu menu = new JMenu("File menubar");
                menuBar.add(menu);

                // adding option to menu
                menu.add(new JMenuItem(printAction));

                // add the print button to toolbar
                JToolBar toolBar = new JToolBar();
                toolBar.add(new JButton(printAction));

                JButton enableButton = new JButton("Enable");
                ActionListener enableActionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        printAction.setEnabled(true); // enables the button
                    }
                };
                enableButton.addActionListener(enableActionListener);

                JButton disableButton = new JButton("Disable");
                ActionListener disableActionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                              printAction.setEnabled(false); // disables the button
                    }
                };
                disableButton.addActionListener(disableActionListener);

                JButton rebelButton = new JButton("Rebel");
                ActionListener rebelActionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        printAction.putValue(Action.NAME, "This is from Rebel");
                    }
                };
                rebelButton.addActionListener(rebelActionListener);

                JPanel buttonPanel = new JPanel();
                buttonPanel.add(enableButton);
                buttonPanel.add(disableButton);
                buttonPanel.add(rebelButton);

                // adding menu set to menu bar
                frame.setJMenuBar(menuBar);

                frame.add(toolBar, BorderLayout.SOUTH);
                frame.add(buttonPanel, BorderLayout.NORTH);
                frame.setSize(300, 200);
                frame.setVisible(true);
            }
        };
        EventQueue.invokeLater(runner);
    }
}
