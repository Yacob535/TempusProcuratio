
import javax.swing.*;
import javax.swing.text.AbstractWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gotDistracted extends JPanel implements ActionListener {
    int strikes,screenNum;
    int[] checked;
    JLabel s1,s2,s3,bg;
    JButton continueButton;
    JFrame f;
    public gotDistracted(JFrame q, int s,int[] ar,int rn)
    {
        this.setLayout(null);
        checked = ar;
        f = q;
        strikes = s;
        screenNum = rn;
        bg = new background("skyBlue.png",0,0,1000,1000);
        s1 = new background("strike1.png",325,200,278,135);
        s2 = new background("strike2.png",325,200,278,135);
        s3 = new background("strike3.png",325,200,278,135);
        continueButton = new plainButton(new ImageIcon("continueButton2.png"),325,400,250,75);

        this.add(s1);
        this.add(s2);
        this.add(s3);
        s1.setVisible(false);
        s2.setVisible(false);
        s3.setVisible(false);
        continueButton.addActionListener(this);
        this.add(continueButton);
        this.add(bg);

        if(s == 0)
        {
            s1.setVisible(true);
        }
        else if(s == 1)
        {
            s2.setVisible(true);
        }
        else
        {
            s3.setVisible(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == continueButton)
        {
            if(strikes >= 2)
            {
                this.setVisible(false);
                loseScreenPanic p = new loseScreenPanic(f);
                f.add(p);
                p.setVisible(true);
            }
            else
            {
                this.setVisible(false);
                ArrowKeys p = new ArrowKeys(f,screenNum,checked,(strikes + 1));
                f.add(p);
                p.setVisible(true);
            }
        }
    }
}

