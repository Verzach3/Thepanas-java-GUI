package com.thepanas.GUI;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(600,600));
        this.setLocationRelativeTo(null);


    }


    public static void main(String[] args){
        Main frame = new Main();
        TLabel label = new TLabel();
        label.setText("Hola mi so");
        label.setLocation(30,30);
        label.setFontSize(50);

        frame.add(label);


        frame.setVisible(true);
    }

}
