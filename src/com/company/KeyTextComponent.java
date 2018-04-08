package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyTextComponent extends JComponent {

    private ActionListener actionListenerList = null; // initially null

    public KeyTextComponent() {
        setBackground(Color.CYAN); // color set for background

        KeyListener internalKeyListener = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent keyEvent) {
                super.keyPressed(keyEvent);
                if (actionListenerList != null) {
                    int keyCode = keyEvent.getKeyCode();
                    String keyText = keyEvent.getKeyText(keyCode);

                    ActionEvent actionEvent = new ActionEvent(
                            this,
                            ActionEvent.ACTION_PERFORMED,
                            keyText
                    );
                    actionListenerList.actionPerformed(actionEvent);
                }
            }
        };

        MouseListener internalMouseListener = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                super.mousePressed(mouseEvent);
                requestFocusInWindow();
            }
        };

        addKeyListener(internalKeyListener);
        addMouseListener(internalMouseListener);
    }

        public void addActionListener(ActionListener actionListener){
            actionListenerList = AWTEventMulticaster.add(actionListenerList, actionListener);
        }

        public void removeActionListener(ActionListener actionListener){
            actionListenerList = AWTEventMulticaster.remove(actionListenerList,actionListener);
        }

        public boolean isFocusable(){
            return true;
        }

}
