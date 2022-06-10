import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loseScreenPanic extends JPanel implements ActionListener {
    JButton retryButton,mainMenuButton;
    int strikes = 0,screenNum = 1;
    int[] checked = new int[10];
    JFrame f;

    public loseScreenPanic(JFrame q)
    {
        f = q;
        retryButton = new plainButton(new ImageIcon("retry.png"),325,400,250,75);
        retryButton.addActionListener(this);
        mainMenuButton = new plainButton(new ImageIcon("mainMenu.png"),100,100,21,31);
        mainMenuButton.addActionListener(this);
        this.add(retryButton);
        this.add(mainMenuButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == retryButton)
        {
            this.setVisible(false);
            ArrowKeys p = new ArrowKeys(f,screenNum,checked,strikes);
            f.add(p);
            p.setVisible(true);
        }
        else if(e.getSource() == mainMenuButton)
        {
            this.setVisible(false);
            titleScreen title = new titleScreen(f,1);
            f.add(title);
            title.setVisible(true);
        }
    }
}
