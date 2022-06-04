/*
Code from: https://stackoverflow.com/questions/4585867/transparent-jbutton
This code implements a button that has no outline or colour
 */

/**
 * Jacob Kuo
 * Version #001
 * May 20th 2022
 * 0.10 hours
 */

import javax.swing.*;
import java.awt.*;

public class colouredButton extends JButton {
    public colouredButton(String text, int x, int y, int wid, int hei,int r, int g, int b)
    {
        super(text);
        setBorder(null);
        setBackground(new Color(r,g,b));
        setOpaque(true);
        this.setBounds(x,y,wid,hei);
    }
}
