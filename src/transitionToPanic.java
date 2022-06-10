/**
 * Jacob Kuo
 * Version #001
 * May 27th 2022
 * 1 hour
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class creates a JPanel for the in between screen between deficiencies room
 * and panic room
 */
public class transitionToPanic extends JPanel implements ActionListener {
    JFrame f;
    JLabel intro1, intro2, intro3, logo, bg,strike, title;
    JButton continueButton, backButton;
    int[] arr = new int[10];

    /**
     * This constructor creates a continue button, and a line of text for the user to read
     * and notify them that they have finished the deficiencies room
     * @param q holds the JFrame of the program
     */
    public transitionToPanic(JFrame q)
    {
        f = q;
        this.setLayout(null);
        Font text = new Font ("Helvetica", Font.PLAIN, 20);
        Font bold = new Font ("Helvetica", Font.BOLD, 20);
        title = new background ("panicRoom.png",250,20,500,100);

        intro1 = new JLabel("<html>Hopefully you were paying attention to those distractions because we have some news: while you were learning about them, you FORGOT THAT YOU HAD A FULL ICS CULMINATING DUE AT MIDNIGHT TONIGHT (you really should have started by now, you know)… Your job now is to saddle in, and find all the things in your room that will help you stay focused, while avoiding those distractions<html>");
        intro1.setFont(text);
        intro1.setBounds(25,-110,900,600);
        intro2 = new JLabel("<html>Using the arrow keys, look around the room and click objects to interact with them. The object will then ask you whether or not you want to interact with it, or just ignore it. Choose carefully or else you may become distracted, and earn a strike!<html>");
        intro2.setFont(text);
        intro2.setBounds (25, 10, 900,600);
        intro3 = new JLabel("<html>3 strikes, and you officially can’t finish that terrifying culminating! You’ll have to ask your teacher for an extension the day of the due date, and restart. Don’t panic, and good luck!<html>");
        intro3.setFont (bold);
        intro3.setBounds (35,190,900,600);

        strike = new JLabel();
        strike.setIcon(new ImageIcon("Strike-0.png"));
        strike.setBounds(370,110,950,600);

        backButton = new plainButton(new ImageIcon("backButton.png"),25,25,100,29);
        backButton.addActionListener(this);
        continueButton = new plainButton(new ImageIcon("continueButton2.png"),305,525,350,75);
        continueButton.addActionListener(this);


        bg = new background("skyBlue.png",0,0,1000,1000);
        logo = new printLogo(840,525);

        this.add(strike);
        this.add(logo);
        this.add(continueButton);
        this.add(backButton);
        this.add(intro1);
        this.add (intro2);
        this.add(intro3);
        this.add(backButton);
        this.add (title);
        this.add(bg);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == continueButton)
        {
            this.setVisible(false);
            ArrowKeys z = new ArrowKeys(f,1,arr,0);
            f.add(z);
            z.setVisible(true);
        } else if (e.getSource()==backButton)
        {
            this.setVisible(false);
            titleScreen z = new titleScreen(f,1);
            f.add(z);
            z.setVisible(true);
        }
    }
}
