package com.hashpack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    int count = 0;

    private JFrame frame;
    private JLabel label;
    private JPanel panel;
    private JButton button;

    public GUI() {

        frame = new JFrame();
        panel = new JPanel();

        button = new JButton("Click me");
        button.addActionListener(this);

        label = new JLabel("Number of clicks: " + count);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("First GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("number of clicks: " + count);
    }
}
