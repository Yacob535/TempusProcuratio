import javax.swing.*;
/**
 * Jacob Kuo
 * Version #001
 * May 20th 2022
 * 0.10 hours
 */

/**
 * This class creates an image that's inside a JLabel
 */
public class background extends JLabel{
    /**
     * This constructor creates an image of dimensions wid,hei at (x,y)
     * @param file The file location the image
     * @param x Holds the X value of the button
     * @param y Holds the Y value of the button
     * @param wid Holds the width of the button
     * @param hei Holds the height of the button
     */
    public background(String file,int x, int y, int wid, int hei)
    {
        this.setIcon(new ImageIcon(file));
        this.setBounds(x,y,wid,hei);
    }
}
