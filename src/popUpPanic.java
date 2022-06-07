import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class popUpPanic extends JPanel implements ActionListener {

    int[] checked;
    JFrame f;
    JLabel but;
    JButton backButton;
    int strikes;
    public popUpPanic(JFrame q,int st,int[] ar,int ch)
    {
        f = q;
        checked = ar;
        strikes = st;
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
        if(ch == 2 || ch == 3 || ch == 6 || ch == 7 || ch == 8 || ch == 9)
        {
            strikes++;
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == backButton)
        {
            System.out.println(strikes);
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
                        ArrowKeys title = new ArrowKeys(f,strikes,checked);
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

    }
}
