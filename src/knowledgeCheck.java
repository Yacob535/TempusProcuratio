import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class knowledgeCheck extends JPanel implements ActionListener {
    int question,strikes, screenNum;
    int[] checked;
    Font font = new Font("Helvetica",Font.PLAIN,25);
    JFrame f;
    JLabel text1;
    JButton backButton,bad1, bad2, bad3, bad4, bad5,bad6,good1, good2, good3,good4;

    /**
     * Checking whether the user picks the correct option of Distraction, or helpful
     * @param q    JFrame of the program
     * @param qA   the object number of the object  (1 - 10)
     * @param s    the amount of strikes the user has
     * @param rn   room number that the user was in before the pop-up screens
     * @param ar   Array that holds what screen the user has been in.
     */
    public knowledgeCheck(JFrame q, int qA,int s,int rn,int[] ar)
    {
        f = q;
        this.setLayout(null);
        checked = ar;
        strikes = s;
        question = qA;
        screenNum = rn;
        bad1 = new plainButton(new ImageIcon("badMessage1.png"),0,0,950,650);
        bad2 = new plainButton(new ImageIcon("badMessage2.png"),0,0,950,650);
        bad3 = new plainButton(new ImageIcon("badMessage3.png"),0,0,950,650);
        bad4 = new plainButton(new ImageIcon("badMessage4.png"),0,0,950,650);
        bad5 = new plainButton(new ImageIcon("badMessage5.png"),0,0,950,650);
        bad6 = new plainButton(new ImageIcon("badMessage6.png"),0,0,950,650);
        good1 = new plainButton(new ImageIcon("message1.png"),0,0,950,650);
        good2 = new plainButton(new ImageIcon("message2.png"),0,0,950,650);
        good3 = new plainButton(new ImageIcon("message3.png"),0,0,950,650);
        good4 = new plainButton(new ImageIcon("message4.png"),0,0,950,650);
        text1 = new JLabel("<html>*Tap anywhere to continue*</html>");
        text1.setBounds(320,570,500,100);
        text1.setFont(font);
        this.add(text1);
        this.add(bad1);
        this.add(bad2);
        this.add(bad3);
        this.add(bad4);
        this.add(bad5);
        this.add(bad6);
        this.add(good1);
        this.add(good2);
        this.add(good3);
        this.add(good4);
        bad1.setVisible(false);
        bad2.setVisible(false);
        bad3.setVisible(false);
        bad4.setVisible(false);
        bad5.setVisible(false);
        bad6.setVisible(false);
        good1.setVisible(false);
        good2.setVisible(false);
        good3.setVisible(false);
        good4.setVisible(false);
        backButton = new plainButton(new ImageIcon("backButton.png"),25,25,100,29);
        backButton.addActionListener(this);
        bad1.addActionListener(this);
        bad2.addActionListener(this);
        bad3.addActionListener(this);
        bad4.addActionListener(this);
        bad5.addActionListener(this);
        bad6.addActionListener(this);
        good1.addActionListener(this);
        good2.addActionListener(this);
        good3.addActionListener(this);
        good4.addActionListener(this);
        this.add(backButton);
        if(question == 0)
        {
            bad1.setVisible(true);
        }
        else if(question == 1)
        {
            good4.setVisible(true);
            checked[1] = 1;
        }
        else if(question == 2)
        {
            bad2.setVisible(true);
        }
        else if(question == 3)
        {
            bad3.setVisible(true);
        }
        else if(question == 4)
        {
            good2.setVisible(true );
            checked[4] = 1;
        }
        else if(question == 5)
        {
            good1.setVisible(true);
            checked[5] = 1;
        }
        else if(question == 6)
        {
            bad4.setVisible(true);
        }
        else if(question == 7)
        {
            bad6.setVisible(true);
        }
        else if(question == 8)
        {
            bad5.setVisible(true);
        }
        else if(question == 9)
        {
            good3.setVisible(true);
            checked[9] = 1;
        }

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(checked[1] == 1 && checked[9] == 1 && checked[4] == 1 && checked[5] == 1)
        {
            this.setVisible(false);
            transitionToEscape p = new transitionToEscape(f);
            f.add(p);
            p.setVisible(true);
        }
        else if(e.getSource()==bad1)
        {
            this.setVisible(false);
            gotDistracted p = new gotDistracted(f,strikes,checked,screenNum);
            f.add(p);
            p.setVisible(true);
        }
        else if(e.getSource() == bad2)
        {
            this.setVisible(false);
            gotDistracted p = new gotDistracted(f,strikes,checked,screenNum);
            f.add(p);
            p.setVisible(true);
        }
        else if(e.getSource() == bad3)
        {
            this.setVisible(false);
            gotDistracted p = new gotDistracted(f,strikes,checked,screenNum);
            f.add(p);
            p.setVisible(true);
        }
        else if(e.getSource() == bad4)
        {
            this.setVisible(false);
            gotDistracted p = new gotDistracted(f,strikes,checked,screenNum);
            f.add(p);
            p.setVisible(true);
        }
        else if(e.getSource() == bad5)
        {
            this.setVisible(false);
            gotDistracted p = new gotDistracted(f,strikes,checked,screenNum);
            f.add(p);
            p.setVisible(true);
        }
        else if(e.getSource() == bad6)
        {
            this.setVisible(false);
            gotDistracted p = new gotDistracted(f,strikes,checked,screenNum);
            f.add(p);
            p.setVisible(true);
        }
        else if(e.getSource() == good1)
        {
            this.setVisible(false);
            ArrowKeys title = new ArrowKeys(f,screenNum,checked,strikes);
            f.add(title);
            title.setVisible(true);
        }
        else if(e.getSource() == good2)
        {
            this.setVisible(false);
            ArrowKeys title = new ArrowKeys(f,screenNum,checked,strikes);
            f.add(title);
            title.setVisible(true);
        }
        else if(e.getSource() == good3)
        {
            this.setVisible(false);
            ArrowKeys title = new ArrowKeys(f,screenNum,checked,strikes);
            f.add(title);
            title.setVisible(true);
        }
        else if(e.getSource() == good4)
        {
            this.setVisible(false);
            ArrowKeys title = new ArrowKeys(f,screenNum,checked,strikes);
            f.add(title);
            title.setVisible(true);
        }
        else if(e.getSource() == backButton)
        {
            this.setVisible(false);
            ArrowKeys title = new ArrowKeys(f,screenNum,checked,strikes);
            f.add(title);
            title.setVisible(true);
        }

    }
}