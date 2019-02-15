package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class simpleGUI extends JFrame {
    String but1, but2;
    private JButton button = new JButton("pokej");
    private JButton button1 = new JButton(but1);
    private JButton button2 = new JButton(but2);
    private JTextField text1 = new JTextField("", 2);
    private JTextField text2 = new JTextField("", 2);
    private Label label = new Label("Punkt #2 ");

    public simpleGUI () {
        super("1 lab?");
        this.setBounds(150, 100, 300, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout( 3, 3, 3, 3));
        container.add(text1);

        button.addActionListener(new ButtonEventOne ());
        container.add(button);

        container.add(label);
        container.add(text2);

        button.addActionListener(new ButtonEventTwo ());
        container.add(button1);
        //button.addActionListener(new ButtonEventThree ());
        container.add(button2);
    }

    class ButtonEventOne implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String massage = "";
            massage += "Text is:    " + text1.getText();
            JOptionPane.showMessageDialog(null, massage, "out", JOptionPane.PLAIN_MESSAGE);
        }
    }

    class ButtonEventTwo implements ActionListener {
        public void actionPerformed (ActionEvent d) {

            but1 += text2.getText();

        }
    }
}
