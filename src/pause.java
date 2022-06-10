import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pause extends JPanel implements ActionListener {
    JButton backButton,exitButton;
    JFrame f;
    int screenNum,strikes, num;
    int[] checked;
    JLabel textBox,info;
    public pause(JFrame q, int i,int z,int[] ae, int qq)
    {
        f = q;
        num = i;
        screenNum = z;
        checked = ae;
        strikes = qq;
        this.setLayout(null);
        backButton = new plainButton(new ImageIcon("backButton.png"),125,50,100,29);
        textBox = new background("textBox.PNG",-20,-10,950,650);
        exitButton = new plainButton(new ImageIcon("continueButton2.png"),330,450,300,100);
        background ex = new background("exit.png",320,100,700,100);
        info = new JLabel("<html>Are you sure you would like to go back to the main menu? You will have to restart this level all over again if you do.");
        info.setFont(new Font("Helvetica", Font.PLAIN, 25));
        info.setBounds(115,100,750,400);
        JLabel info2 = new JLabel(" If you are sure you would like to exit, press continue to leave.");
        info2.setFont(new Font("Helvetica", Font.PLAIN, 25));
        info2.setBounds (135, 200, 750, 400);
        exitButton.addActionListener(this);
        backButton.addActionListener(this);
        this.add(backButton);
        this.add(info);
        this.add(info2);
        this.add(exitButton);
        this.add (ex);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == backButton)
        {
            if(num == 0)
            {

            }
            else if(num == 1)
            {
                this.setVisible(false);
                ArrowKeys p = new ArrowKeys(f,screenNum,checked,strikes + 1);
                f.add(p);
                p.setVisible(true);
            }
        }
        else if(e.getSource() == exitButton)
        {
            if(num == 0)
            {
                this.setVisible(false);
                titleScreen p = new titleScreen(f,0);
                f.add(p);
                p.setVisible(true);
            }
            else if(num == 1)
            {
                this.setVisible(false);
                titleScreen p = new titleScreen(f,1);
                f.add(p);
                p.setVisible(true);
            }
        }
    }
}
