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

                JMenuBar menuBar = new JMenuBar();
                JMenu menu = new JMenu("File");
                menuBar.add(menu);
                menu.add(new JMenuItem(printAction));

                JToolBar toolBar = new JToolBar();
                toolBar.add(new JButton(printAction));

                JButton enableButton = new JButton("Enable");
                ActionListener enableActionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        printAction.setEnabled(true);
                    }
                };
                enableButton.addActionListener(enableActionListener);

                JButton disableButton = new JButton("Disable");
                ActionListener disableActionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                              printAction.setEnabled(false);
                    }
                };
                disableButton.addActionListener(disableActionListener);

                JButton rebelButton = new JButton("Rebel");
                ActionListener rebelActionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        printAction.putValue(Action.NAME, "Hello World from rebel");
                    }
                };
                rebelButton.addActionListener(rebelActionListener);

                JPanel buttonPanel = new JPanel();
                buttonPanel.add(enableButton);
                buttonPanel.add(disableButton);
                buttonPanel.add(rebelButton);

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
