package com.company;

import javax.swing.*;
import java.awt.*;
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
                toolBar.add(new);


            }
        };
        EventQueue.invokeLater(runner);
    }
}
