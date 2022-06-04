/**
 * Jacob Kuo
 * Version #002
 * May 27th 2022
 * 2.5 hours
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class creates a JPanel that has a back button that leads back to the
 * deficiencies room
 */
public class infoScreen extends JPanel implements ActionListener{
    JFrame f;
    JButton backButton;

    /**
     * This Constructor creates a back button that leads back to the
     * deficiencies room
     * @param q The JFrame used for the program
     * @param t Numbered blurb that should be outputted
     */
    int[] counter;
    boolean y;
    int screen;
    JLabel info;
    public infoScreen(JFrame q, int[] t, boolean contains,int z)
    {
        f = q;
        y = contains;
        counter = t;
        screen = z;
        backButton = new plainButton(new ImageIcon("backButton.png"),25,25,100,29);
        giveScreen(screen);
        backButton.addActionListener(this);
        this.add(backButton);
    }

    public void giveScreen(int a)
    {
        this.setLayout(null);
        String z = "";
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        screen = a;
        if(a == 1)
        {
            z = "Food can be a bad influence while studying and/or doing something that requires concentration.";
            x = 0;
            y = 0;
            width = 1000;
            height = 1000;
        }
        else if(a == 2)
        {
            z = "This is a test";
            x = 100;
            y = 100;
            width = 100;
            height = 100;

        }
        else if(a == 3)
        {

        }
        else if(a == 4)
        {

        }
        else if(a == 5)
        {

        }
        else if(a == 6)
        {

        }
        else
        {

        }
        info = new JLabel(z);
        info.setFont(new Font("Helvetica",Font.PLAIN,18));
        info.setBounds(x,y,width,height);
        this.add(info);

    }

    /**
     * This method checks for actions performed by the button.
     * If the player has gone through all of the objects in the room, they will be brought to transitionToPanic
     * rather than back to the deficiencies room
     * @param e ActionEvent variable
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == backButton)
        {
            if(!y)
            {
                this.setVisible(false);
                transitionToPanic t = new transitionToPanic(f);
                f.add(t);
                t.setVisible(true);
            }
            else
            {
                this.setVisible(false);
                deficienciesRoom d = new deficienciesRoom(f,counter);
                f.add(d);
                d.setVisible(true);
            }

        }
    }
}
