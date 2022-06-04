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

    /**
     * This constructor creates a continue button, and a line of text for the user to read
     * and notify them that they have finished the deficiencies room
     * @param q holds the JFrame of the program
     */
    public transitionToPanic(JFrame q)
    {
        f = q;
        this.setLayout(null);
        but = new JLabel("Great Job! Now let's test your knowledge of distractions...");
        but.setFont(new Font("Helvetica",Font.PLAIN,18));
        but.setBounds(100,100,1000,100);
        backButton = new plainButton(new ImageIcon("backButton.png"),25,25,100,29);
        backButton.addActionListener(this);
        this.add(backButton);

        this.add(but);
        this.add(backButton);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
