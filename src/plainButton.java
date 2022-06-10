/**
 * Jacob Kuo
 * Version #001
 * May 20th 2022
 * 0.25 hours
 */

import javax.swing.*;

/**
 * This class implements a button that has no outline or colour
 * Code idea from: https://stackoverflow.com/questions/4585867/transparent-jbutton
 */
public class plainButton extends JButton {
    /**
     * This contructor creates a button at the given x y
     * location with the width and height of wid and hei respectively
     * @param x Holds the X value of the button
     * @param y Holds the Y value of the button
     * @param wid Holds the width of the button
     * @param hei Holds the height of the button
     */
    public plainButton(int x, int y, int wid, int hei)
    {
        setBorder(null);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setOpaque(false);
        this.setBounds(x,y,wid,hei);
    }

    /**
     * This contructor creates an image that's a button at the given x y
     * @param q The image used for the button
     * @param x Holds the Y value of the button
     * @param y Holds the Y value of the button
     * @param wid Holds the width of the button
     * @param hei Holds the height of the button
     */

    public plainButton(ImageIcon q, int x, int y, int wid, int hei)
    {
        super(q);
        setBorder(null);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setOpaque(false);
        this.setBounds(x,y,wid,hei);
    }
}
