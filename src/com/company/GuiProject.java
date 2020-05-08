package com.company;
import java.awt.*;
import  java.awt.event.*;
import javax.swing.*;


public class GuiProject extends Container{
    private JLabel label1 =  new JLabel("Champions league matches");
    private JLabel label2 = new JLabel("Choose a match:");
    private JButton Button1 = new JButton("Borussia D  -  PSG");
    private JButton Button2 = new JButton("Real Madrid  -  Manchester City");
    private JButton Button3 = new JButton("Atalanta  -  Valencia");
    private JButton Button4 = new JButton("Atletico M  -  Liverpool");
    private JButton Button5 = new JButton("Chelsea  -  Bayern M" );
    private JButton Button6 = new JButton("Olympic Lyon  -  Juventus");
    private JButton Button7 = new JButton("Tottenham  -  RB Leipzig");
    private JButton Button8 = new JButton("Napoli  -  Barcelona");
    private JButton Cart = new JButton("Cart");



    public GuiProject(){

        setSize(500,600);



        label1.setBounds(150, 20, 200,20);
        add(label1);
        label2.setBounds(40, 60, 100,20 );
        add(label2);

        Button1.setBounds(40,100,420,20);
        add(Button1);
        Button2.setBounds(40,140,420,20);
        add(Button2);
        Button3.setBounds(40,180,420,20);
        add(Button3);
        Button4.setBounds(40,220,420,20);
        add(Button4);
        Button5.setBounds(40,260,420,20);
        add(Button5);
        Button6.setBounds(40,300,420,20);
        add(Button6);
        Button7.setBounds(40,340,420,20);
        add(Button7);
        Button8.setBounds(40,380,420,20);
        add(Button8);

        Cart.setBounds(380,420,80,30);
        add(Cart);
        Cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.mainMenu.setVisible(false);
                MainFrame.cart.setVisible(true);
            }
        });



        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.mainMenu.setVisible(false);
                MainFrame.match1.setVisible(true);



            }
        });


        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.mainMenu.setVisible(false);
                MainFrame.match2.setVisible(true);


            }
        });
        Button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.mainMenu.setVisible(false);
                MainFrame.match3.setVisible(true);


            }
        });
        Button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.mainMenu.setVisible(false);
                MainFrame.match4.setVisible(true);


            }
        });
        Button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.mainMenu.setVisible(false);
                MainFrame.match5.setVisible(true);


            }
        });
        Button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.mainMenu.setVisible(false);
                MainFrame.match6.setVisible(true);


            }
        });
        Button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.mainMenu.setVisible(false);
                MainFrame.match7.setVisible(true);


            }
        });
        Button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.mainMenu.setVisible(false);
                MainFrame.match8.setVisible(true);


            }
        });





         /*ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);
        group.add(radio4);
        group.add(radio5);
        group.add(radio6);
        group.add(radio7);
        group.add(radio8);*/













    }


}
