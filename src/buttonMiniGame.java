import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttonMiniGame extends JPanel implements ActionListener {
    JFrame f;
    JButton redButton;
    int counter;
    JLabel bg, countS;
    public buttonMiniGame(JFrame q, int count) {
        this.setLayout(null);
        f = q;
        counter = count;
        bg = new background("buttonBackground.png", -15, 0, 950, 650);
        countS = new JLabel("Count: " + counter);
        countS.setFont(new Font("Consolas", Font.PLAIN, 29));
        countS.setForeground(Color.BLACK);
        countS.setBounds(395,-30,200,150);
        redButton = new plainButton(new ImageIcon("buttonUnpressed.png"), -15, 0, 950, 650);
        redButton.addActionListener(this);
        this.add(countS);
        this.add(redButton);
        this.add(bg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            this.setVisible(false);
            PressedButton p = new PressedButton(f,counter+1);
            f.add(p);
            p.setVisible(true);
        }
        if(counter == 1500){
            this.setVisible(false);
            transitionToPanic t = new transitionToPanic(f);
            f.add(t);
            t.setVisible(true);
        }
    }
}