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
    JLabel but, logo, bg,strike, logop;
    JButton backButton;
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
        but = new JLabel("<html> We hope you learned a lot about how certain objects distract you and lead you down a road of procrastination because we have some news: you have been tasked with completing a project in an impossibly short amount of time. Being responsible, you decide to take a few minutes to clear out all distractions from the room to prevent any chance of procrastination and distraction. If you click something which is not a distraction, this will be a huge waste of time and a strike against you, (X) strikes and you’ll have to restart. Don’t panic, and good luck! <html>");
        but.setFont(new Font("Consolas",Font.PLAIN,29));
        but.setBounds(30,55,900,600);
        logo = new printLogo(825,500);
        backButton = new plainButton(new ImageIcon("backButton.png"),-25,25,100,29);
        backButton.addActionListener(this);
        strike = new JLabel();
        strike.setIcon(new ImageIcon("Strike-0.png"));
        strike.setBounds(0,0,950,600);
        logop = new JLabel();
        logop.setIcon(new ImageIcon("logo-panic.png"));
        logop.setBounds(0,0,950,600);
        bg = new background("skyBlue.png",0,0,1000,1000);
        this.add(strike);
        this.add(logop);
        this.add(logo);
        this.add(backButton);
        this.add(but);
        this.add(backButton);
        this.add(bg);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == backButton)
        {
            this.setVisible(false);
            ArrowKeys z = new ArrowKeys(f,1,arr,0);
            f.add(z);
            z.setVisible(true);
        }

    }
}
