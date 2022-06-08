import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class infoScreenToDef extends JPanel implements ActionListener {

    JButton backButton,playNow;
    JLabel bg, logo;
    JFrame f;
    int[] zz = new int[7];
    public infoScreenToDef(JFrame q)
    {
        this.setLayout(null);
        f = q;
        bg = new background("skyBlue.png",0,0,1000,1000);
        Font textSize = new Font("Helvetica",Font.PLAIN,25);
        JLabel intro = new JLabel("<html> Welcome to the game! In the next screen you will see a typical child’s room, no doubt reminding you of your own. This room, being the room of deficiencies, has many objects, when you click on them, you will be given a description of how this object affects your work. Be sure you pay attention, just in case you fall into a panic!  </html>");
        logo = new printLogo(825,500);
        intro.setBounds(10, 0, 900, 600);
        intro.setFont(textSize);
        backButton = new plainButton(new ImageIcon("backButton.png"),25,25,100,29);
        backButton.addActionListener(this);
        this.add(backButton);
        playNow = new plainButton(new ImageIcon("backButton.png"),305,25,100,29);
        playNow.addActionListener(this);
        this.add(logo);
        this.add(intro);
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
