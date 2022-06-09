import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class knowledgeCheck extends JPanel implements ActionListener {
    int question;
    JFrame f;
    JLabel bad1, bad2, bad3, bad4, bad5,bad6,good1, good2, good3;
    JButton backButton;
    public knowledgeCheck(JFrame q, int qA)
    {
        f = q;
        question = qA;
        bad1 = new background("badMessage1.png",0,0,950,650);
        bad2 = new background("badMessage2.png",0,0,950,650);
        bad3 = new background("badMessage3.png",0,0,950,650);
        bad4 = new background("badMessage4.png",0,0,950,650);
        bad5 = new background("badMessage5.png",0,0,950,650);
        bad6 = new background("badMessage6.png",0,0,950,650);
        good1 = new background("message1.png",0,0,950,650);
        good2 = new background("message2.png",0,0,950,650);
        good3 = new background("message3.png",0,0,950,650);
        this.add(bad1);
        this.add(bad2);
        this.add(bad3);
        this.add(bad4);
        this.add(bad5);
        this.add(bad6);
        this.add(good1);
        this.add(good2);
        this.add(good3);
        bad1.setVisible(false);
        bad2.setVisible(false);
        bad3.setVisible(false);
        bad4.setVisible(false);
        bad5.setVisible(false);
        bad6.setVisible(false);
        good1.setVisible(false);
        good2.setVisible(false);
        good3.setVisible(false);
        backButton = new plainButton(new ImageIcon("backButton.png"),25,25,100,29);
        backButton.addActionListener(this);
        this.add(backButton);

        if(question == 0)
        {
            bad1.setVisible(true);
        }
        else if(question == 1)
        {

        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
