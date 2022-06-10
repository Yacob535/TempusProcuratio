/**
 * Jacob Kuo
 * Version #001
 * May 27th 2022
 * 1 hour
 */
import javax.swing.*;

/**
 * This class creates a JLabel that is a red circle
 */
public class createCircle extends JLabel{
    /**
     * Contstructor creates a red circle at the desired location, and type of circle
     * @param x x coordinate of the circle
     * @param y y coordinate of the circle
     * @param z the type of circle.
     *          1 = small circle
     *          2 = large circle
     *          3 = medium circle
     */
    public createCircle(int x, int y,int z)
    {
        if(z == 1)
        {
            this.setIcon(new ImageIcon("redCircleSmall.png"));
            this.setBounds(x,y,137,139);
        }
        else if(z == 2)
        {
            this.setIcon(new ImageIcon("redCircleLarge.png"));
            this.setBounds(x,y,350,356);
        }
        else if(z == 3)
        {
            this.setIcon(new ImageIcon("redCircleMedium.png"));
            this.setBounds(x,y,200,203);
        }

    }
}
