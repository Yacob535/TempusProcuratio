/**
 * Jacob Kuo,David Shim, and Neik Patel
 * version #002
 * May 20 2022
 * Jacob Kuo spent 3 hours
 * David Shim spent 4 hours
 * Neik Patel spent 4 hours
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Prints the scores of the highscore from first to tenth place and displays them on two tables
 * extends JPanel
 */
public class HighScore extends JPanel implements ActionListener {

    JLabel bg2,logo,table1, table2,score1,score2,score3,score4,score5,score6,score7,score8,score9,score10;
    JButton backButton;
    JFrame f;

    /**
     * This class puts all the items onto a screen
     * Uses graphics to print values from file highscore onto the screen
     * @param q is used to pass the JFrame to the JPanel classes
     */
    public HighScore(JFrame q)
    {
        f = q;
        this.setLayout(null);
        bg2 = new background("skyBlue.png",0,0,1000,1000);
        table1 = new background("table1.png",15,90,450,450);
        table2 = new background("table1.png",460,90,450,450);
        logo = new printLogo(840,525);
        Icon b = new ImageIcon("backButton.png");
        backButton = new JButton(b);
        backButton.addActionListener(this);
        backButton.setBounds(25,25,100,29);

        Font textSize = new Font("Arial",Font.PLAIN,30);
        this.setFont(textSize);
        try (BufferedReader br = new BufferedReader(new FileReader("highscore.txt"))) {
            String line;
            line = br.readLine();
            score1 = new JLabel(line);
            line = br.readLine();
            score2 = new JLabel(line);
            line = br.readLine();
            score3 = new JLabel(line);
            line = br.readLine();
            score4 = new JLabel(line);
            line = br.readLine();
            score5 = new JLabel(line);
            line = br.readLine();
            score6 = new JLabel(line);
            line = br.readLine();
            score7 = new JLabel(line);
            line = br.readLine();
            score8 = new JLabel(line);
            line = br.readLine();
            score9 = new JLabel(line);
            line = br.readLine();
            score10 = new JLabel(line);
            score1.setBounds(130,80,2000,100);
            score2.setBounds(130,90,2000,100);
            score3.setBounds(130,100,2000,100);
            score4.setBounds(130,110,2000,100);
            score5.setBounds(130,120,2000,100);
            score6.setBounds(600,130,2000,100);
            score7.setBounds(600,140,2000,100);
            score8.setBounds(600,150,2000,100);
            score9.setBounds(600,160,2000,100);
            score10.setBounds(600,170,2000,100);
            this.add(score1);
            this.add(score2);
            this.add(score3);
            this.add(score4);
            this.add(score5);
            this.add(score6);
            this.add(score7);
            this.add(score8);
            this.add(score9);
            this.add(score10);

        }catch(Exception e){
            System.out.println("HI");
        }
        this.add(backButton);
        this.add(table1);
        this.add(table2);
        this.add(logo);
        this.add(bg2);
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
    }
}
