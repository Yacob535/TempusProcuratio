import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class infoScreenToDef extends JPanel implements ActionListener {

    JButton backButton,playNow;
    JLabel bg, logo, phone, title;
    JFrame f;
    int[] zz = new int[7];
    public infoScreenToDef(JFrame q)
    {
        this.setLayout(null);
        f = q;
        bg = new background("skyBlue.png",0,0,1000,1000);
        title = new background ("instructions.png", 20,-350,1000,1000);
        Font textSize = new Font("Helvetica",Font.PLAIN,25);
        Font textExclamation = new Font ("Helvetica", Font.BOLD, 27);
        Font textSmall = new Font ("Helvetica", Font.PLAIN, 20);


        JLabel intro = new JLabel("<html> Welcome to the game! In the next screen you will see a typical bedroom, probably close to your own. This room, nicknamed the 'room of deficiencies (or distractions)', has many objects to explore and procrastinate with! Click on them to be given a description of how this object affects your work.</html>");
        intro.setBounds(25, -50, 900, 600);
        intro.setFont(textSize);
        JLabel intro2 = new JLabel (" Be sure you pay attention, just in case you fall into a time panic!");
        intro2.setBounds (65, 70, 900, 600);
        intro2.setFont (textExclamation);
        JLabel introBlurb = new JLabel ("<html>You will be pressing on things like this phone!<html>");     // may want to fix location w/ continue button so slightly better looking
        introBlurb.setBounds(150,450,200,100);
        introBlurb.setFont(textSmall);

        logo = new printLogo(840,525);
        phone = new background("phone.png", 80, 450, 100,100);

        backButton = new plainButton(new ImageIcon("backButton.png"),25,25,100,29);
            backButton.addActionListener(this);
        playNow = new plainButton(new ImageIcon("continueButton2.png"),345,455,300,100);
            playNow.addActionListener(this);

        this.add(logo);
        this.add (phone);
        this.add (title);
        this.add(intro);
        this.add(intro2);
        this.add (introBlurb);
        this.add(backButton);
        this.add(playNow);
        this.add(bg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == backButton)
        {
            this.setVisible(false);
            titleScreen title = new titleScreen(f);
            f.add(title);
            title.setVisible(true);
        }
        else if(e.getSource() == playNow)
        {
            this.setVisible(false);
            deficienciesRoom z = new deficienciesRoom(f,zz);
            f.add(z);
            z.setVisible(true);
        }

    }
}
