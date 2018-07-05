package com.company;

import javax.swing.*;

public class MenuBarSample extends JFrame {
    private JMenuBar menuBar = new JMenuBar();

    public MenuBarSample (String title){
        setTitle(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setJMenuBar(menuBar);


    }
}
