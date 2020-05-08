package com.company;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Main {
    public static MainFrame frame;

    public static void connect(){
        try {
            Socket socket = new Socket("192.168.43.75", 0000);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());


        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        frame =  new MainFrame();

        frame.setVisible(true);
    }
}
