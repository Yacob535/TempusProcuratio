import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class popUpPanic extends JPanel implements ActionListener {

    int[] checked;
    JFrame f;
    JLabel bg,text1,text2;
    JButton backButton,backButton1,backButton2;
    int strikes, screenNum,check;
    public popUpPanic(JFrame q,int st,int[] ar,int ch,int rn)
    {
        f = q;
        check = ch;
        checked = ar;
        strikes = st;
        screenNum = rn;
        this.setLayout(null);
        backButton = new plainButton(new ImageIcon("backButton.png"),25,25,100,29);
        backButton1 = new plainButton(new ImageIcon("backButton.png"),300,500,100,29);
        backButton2 = new plainButton(new ImageIcon("backButton.png"),550,500,100,29);
        text1 = new JLabel("this is testing the text");
        text2 = new JLabel("this is another test");
        text1.setBounds(100,100,400,100);
        text2.setBounds(100,100,400,100);
        bg = new background("skyBlue.png",0,0,1000,1000);
        backButton.addActionListener(this);
        backButton1.addActionListener(this);
        backButton2.addActionListener(this);
        if(check == 0)
        {
            this.add(text2);
        }
        else if(check == 1)
        {
            this.add(text1);
        }
        this.add(backButton);
        this.add(backButton1);
        this.add(backButton2);
        this.add(bg);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == backButton)
        {
            if(strikes >= 3)
            {
                System.out.println("L + Ratio");
            }
            for(int t = 0; t < 11; t++)
            {
                if(t < 10)
                {
                    if(checked[t] == 0)
                    {
                        this.setVisible(false);
                        ArrowKeys title = new ArrowKeys(f,screenNum,checked,strikes);
                        f.add(title);
                        title.setVisible(true);
                        break;
                    }
                }
                else
                {
                    System.out.println("wowowowowow amazing");
                }
            }
        }
        else if(e.getSource() == backButton1)
        {
            GamePanel gamePanel = new GamePanel();
            f.add(gamePanel);
            f.pack();
            f.setLocationRelativeTo(null);
            f.setVisible(true);
            gamePanel.startGameThread();
            /*
            System.out.println(check);
            if(check == 0)
            {
                this.setVisible(false);
                System.out.println("hi");
                ArrowKeys p = new ArrowKeys(f,screenNum,checked,strikes);
                f.add(p);
                p.setVisible(true);
            }
            else if(check == 1)
            {
                this.setVisible(false);
                knowledgeCheck p = new knowledgeCheck(f,0);
                f.add(p);
                p.setVisible(true);
            }

             */
        }

    }
}
