package com.company;

import javax.swing.*;

public class MainFrame extends JFrame {
    public static GuiProject mainMenu;
    public static Match1 match1;
    public static Match2 match2;
    public static Match3 match3;
    public static Match4 match4;
    public static Match5 match5;
    public static Match6 match6;
    public static Match7 match7;
    public static Match8 match8;
    public static Cart cart;


    public MainFrame(){
        setSize(500, 600);
        setTitle("Bet Games");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        try {
            mainMenu = new GuiProject();
            mainMenu.setLocation(0, 0);
            mainMenu.setVisible(true);
            add(mainMenu);


            match1 = new Match1();
            match1.setLocation(0, 0);
            match1.setVisible(false);
            add(match1);

            match2 = new Match2();
            match2.setLocation(0, 0);
            match2.setVisible(false);
            add(match2);

            match3 = new Match3();
            match3.setLocation(0, 0);
            match3.setVisible(false);
            add(match3);

            match4 = new Match4();
            match4.setLocation(0, 0);
            match4.setVisible(false);
            add(match4);

            match5 = new Match5();
            match5.setLocation(0, 0);
            match5.setVisible(false);
            add(match5);

            match6 = new Match6();
            match6.setLocation(0, 0);
            match6.setVisible(false);
            add(match6);

            match7 = new Match7();
            match7.setLocation(0, 0);
            match7.setVisible(false);
            add(match7);

            match8 = new Match8();
            match8.setLocation(0, 0);
            match8.setVisible(false);
            add(match8);

            cart = new Cart();
            cart.setLocation(0,0);
            cart.setVisible(false);
            add(cart);
        }
        catch(Exception e){
            e.printStackTrace();
        }






    }

}
