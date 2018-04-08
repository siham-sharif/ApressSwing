package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonSample {

    public static void main(String args[]){

        Runnable runner = new Runnable() {
            @Override
            public void run() {

                // Declaring a JFrame
                JFrame frame = new JFrame("Button Sample");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Declaring components
                JButton button = new JButton("Select ME!");

                // Define ActionListener for components
                ActionListener actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("I was selected");
                    }
                };

                // Define MouseListener
                MouseListener mouseListener = new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent mouseEvent) {
                        super.mousePressed(mouseEvent);
                        int modifiers = mouseEvent.getModifiers();

                        if ((modifiers & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK) {
                            System.out.println("Left button Pressed!");
                        }
                        if ((modifiers & InputEvent.BUTTON2_MASK) == InputEvent.BUTTON2_MASK) {
                            System.out.println("Middle button Pressed!");
                        }
                        if ((modifiers & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK) {
                            System.out.println("Right button Pressed!");
                        }
                    }

                    public void mouseReleased(MouseEvent mouseEvent) {
                        if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
                            System.out.println("Left button released.");
                        }
                        if (SwingUtilities.isMiddleMouseButton(mouseEvent)) {
                            System.out.println("Middle button released.");
                        }
                        if (SwingUtilities.isRightMouseButton(mouseEvent)) {
                            System.out.println("Right button released");
                        }
                    }
                };

                // Attach listener
                button.addActionListener(actionListener);
                button.addMouseListener(mouseListener);


                // frame size and location
                frame.add(button, BorderLayout.SOUTH);
                frame.setSize(300, 100);
                frame.setVisible(true);
                }
            };

            //Envoking the entire thing
            EventQueue.invokeLater(runner);
    }

}
