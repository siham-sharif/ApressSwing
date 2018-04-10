package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class PrintHelloAction extends AbstractAction {

    private static final Icon printIcon = new ImageIcon("Print.gif");

    PrintHelloAction(){
        super("Print button", printIcon);
        putValue(Action.SHORT_DESCRIPTION, "THIS TEXT IS FROM PrintHelloAction()");
    }
    public void actionPerformed(ActionEvent actionEvent){
        System.out.println("This is from print hello action class");
    }
}
