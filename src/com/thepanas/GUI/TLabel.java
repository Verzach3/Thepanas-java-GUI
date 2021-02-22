package com.thepanas.GUI;

import java.awt.*;

public class TLabel {
    TLabel(int x, int y, int fontSize, String text, Graphics2D g){
        g.setColor(Color.BLACK);
        Font font = new Font("Arial", Font.PLAIN, fontSize);
        g.setFont(font);
        g.drawString(text,x,y);


    }



}
