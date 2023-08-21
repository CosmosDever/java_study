package java_study.java_FE;

import javax.swing.*;

public class FirstExample
{
    public static void main(String[] args) {
        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(600,600);
        myWindow.setTitle("My First Java Program");
        JLabel label1=new JLabel("KO"); //Label is a component that displays text or images on the screen
        label1.setHorizontalAlignment(JLabel.CENTER);
        myWindow.add(label1);
        myWindow.setVisible(true);
    }
}


