package com.company;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;

public class Match4 extends Container {
    private JLabel matchLabel = new JLabel("Atletico M  -  Liverpool");
    private JLabel actionLabel = new JLabel("select a bid");
    private JRadioButton W1 = new JRadioButton("W1");
    private JRadioButton X = new JRadioButton("X");
    private JRadioButton W2 = new JRadioButton("W2");
    private JButton back = new JButton("Back");
    private JButton add = new JButton("Add to Cart");
    private JButton Cart= new JButton("Cart");




    public Match4(){
        setSize(500, 500);
        setLayout(null);

        matchLabel.setBounds(150,20,200,20);
        add(matchLabel);

        actionLabel.setBounds(40,60,200,20);
        add(actionLabel);
        W1.setBounds(40,100,60,20);
        add(W1);
        X.setBounds(120,100,60,20);
        add(X);
        W2.setBounds(200,100,60,20);
        add(W2);
        ButtonGroup group = new ButtonGroup();
        group.add(W1);
        group.add(X);
        group.add(W2);

        add.setBounds(350,400,100,30);
        add(add);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



            }
        });
        Cart.setBounds(380,440,70,30);
        add(Cart);
        Cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.match4.setVisible(false);
                MainFrame.cart.setVisible(true);
            }
        });


        back.setBounds(40, 20, 70,20);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.match4.setVisible(false);
                MainFrame.mainMenu.setVisible(true);
            }
        });
    }











}
