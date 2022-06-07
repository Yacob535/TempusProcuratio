import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class infoScreenToDef extends JPanel implements ActionListener {

    JButton backButton,playNow;
    JLabel bg;
    JFrame f;
    int[] zz = new int[7];
    public infoScreenToDef(JFrame q)
    {
        this.setLayout(null);
        f = q;
        bg = new background("skyBlue.png",0,0,1000,1000);

        backButton = new plainButton(new ImageIcon("backButton.png"),25,25,100,29);
        backButton.addActionListener(this);
        this.add(backButton);
        playNow = new plainButton(new ImageIcon("backButton.png"),305,25,100,29);
        playNow.addActionListener(this);
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
