import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PressedButton extends JPanel implements ActionListener {
    JFrame f;
    JButton redButtonP;
    JLabel bg, countS;

    int counter;
    public PressedButton(JFrame q, int count) {
        this.setLayout(null);
        f = q;
        counter = count;
        bg = new background("buttonBackground.png", -15, 0, 950, 650);
        countS = new JLabel("Count: " + counter);
        countS.setFont(new Font("Consolas", Font.PLAIN, 29));
        countS.setForeground(Color.BLACK);
        countS.setBounds(395,-30,200,150);
        redButtonP = new plainButton(new ImageIcon("buttonPressed.png"), -15, 0,950, 650);
        redButtonP.addActionListener(this);
        this.add(countS);
        this.add(redButtonP);
        this.add(bg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButtonP) {
            this.setVisible(false);
            buttonMiniGame p = new buttonMiniGame(f, counter);
            f.add(p);
            p.setVisible(true);
        }
    }
}