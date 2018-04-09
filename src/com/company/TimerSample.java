package com.company;

<<<<<<< HEAD
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
=======
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Timer;
>>>>>>> 7dc02712a0acddd1e2d03fab0559ca1c78f5d378

public class TimerSample {
    public static void main(String args[]){

        Runnable runner = new Runnable() {
            @Override
            public void run() {
                ActionListener actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
<<<<<<< HEAD
                        System.out.println("Hello World Timer");
                    }
                };

                // this is not java util; this is form java timer
                Timer timer = new Timer(500, actionListener);
                timer.start();
=======
                        System.out.println("Timer from Action Listener!");

                    }
                };
                //Timer timer = new Timer(500, actionListener);
>>>>>>> 7dc02712a0acddd1e2d03fab0559ca1c78f5d378
            }
        };
        EventQueue.invokeLater(runner);
    }
}
