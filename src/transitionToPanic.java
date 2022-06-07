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
    JLabel but;
    JButton backButton;
    int d = 0;
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
        but.setFont(new Font("Helvetica",Font.PLAIN,25));
        but.setBounds(10,30,950,600);
        backButton = new plainButton(new ImageIcon("backButton.png"),25,25,100,29);
        backButton.addActionListener(this);
        this.add(backButton);

        this.add(but);
        this.add(backButton);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == backButton)
        {
            this.setVisible(false);
            ArrowKeys z = new ArrowKeys(f,d,arr);
            f.add(z);
            z.setVisible(true);
        }

    }
}
