package com.thepanas.GUI;

import javax.swing.JPanel;
import java.awt.*;

public class TLabel extends JPanel {
    String text = "";
    int fontSize = 0;
    int x = 0;
    int y = 0;
    Dimension size = new Dimension(0,0);

    @Override
    public Dimension getSize() {
        return size;
    }

    public void setSize(Dimension size){
        this.size = size;
    }

    public void setText(String newText) {
        this.text = newText;
    }

    public String getText() {
        return text;
    }

    public int getFontSize() {
        return fontSize;
    }

    @Override
    public void setFont(Font font) {
        super.setFont(font);
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }


    TLabel(){
        this.setPreferredSize(size);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        //g.setColor(Color.BLACK);
        Font font = new Font("Arial", Font.PLAIN, fontSize);
        g2D.setFont(font);
        g2D.drawString(text,x,y);
        //super.paint(g);
    }
}
