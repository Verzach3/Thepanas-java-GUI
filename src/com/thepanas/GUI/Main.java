package com.thepanas.GUI;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(600,600));
        this.setLocationRelativeTo(null);


        this.setVisible(true);
    }


    public static void main(String[] args){
        new Main();

    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        TLabel label = new TLabel(20,20,34,"Hola mi so", (Graphics2D) g);

        super.paint(g);
    }
}
