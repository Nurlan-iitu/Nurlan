package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Cart extends Container{
    private JTextArea text = new JTextArea();
    private JButton list = new JButton("List");
    private JButton back = new JButton("Back to Menu");



    public Cart() {
        setSize(500,500);
        setLayout(null);
        text.setBounds(100, 150,300,200);
        add(text);

        list.setBounds(100,370,60,30);
        add(list);







        back.setBounds(40, 20, 150,30);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.cart.setVisible(false);
                MainFrame.mainMenu.setVisible(true);
            }
        });


    }
}
