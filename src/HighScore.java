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

    JLabel bg2,logo,table1, table2, header1, header2, header3, header4, name1, name2, name3, name4, name5, name6, name7, name8, name9, name10, score1,score2,score3,score4,score5,score6,score7,score8,score9,score10;
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
        Font textSize = new Font("Consolas",Font.PLAIN,25);
        this.setFont(textSize);
        try (BufferedReader br = new BufferedReader(new FileReader("highscore.txt"))) {
            String line;
            line = br.readLine();
            name1 = new JLabel(line.substring(0, line.lastIndexOf(" ")));
            name1.setFont(textSize);
            score1 = new JLabel(String.valueOf(Integer.parseInt(line.substring(line.lastIndexOf(" ")+1))));
            score1.setFont(textSize);
            line = br.readLine();
            name2 = new JLabel(line.substring(0, line.lastIndexOf(" ")));
            name2.setFont(textSize);
            score2 = new JLabel(String.valueOf(Integer.parseInt(line.substring(line.lastIndexOf(" ")+1))));
            score2.setFont(textSize);
            line = br.readLine();
            name3 = new JLabel(line.substring(0, line.lastIndexOf(" ")));
            name3.setFont(textSize);
            score3 = new JLabel(String.valueOf(Integer.parseInt(line.substring(line.lastIndexOf(" ")+1))));
            score3.setFont(textSize);
            line = br.readLine();
            name4 = new JLabel(line.substring(0, line.lastIndexOf(" ")));
            name4.setFont(textSize);
            score4 = new JLabel(String.valueOf(Integer.parseInt(line.substring(line.lastIndexOf(" ")+1))));
            score4.setFont(textSize);
            line = br.readLine();
            name5 = new JLabel(line.substring(0, line.lastIndexOf(" ")));
            name5.setFont(textSize);
            score5 = new JLabel(String.valueOf(Integer.parseInt(line.substring(line.lastIndexOf(" ")+1))));
            score5.setFont(textSize);
            line = br.readLine();
            name6 = new JLabel(line.substring(0, line.lastIndexOf(" ")));
            name6.setFont(textSize);
            score6 = new JLabel(String.valueOf(Integer.parseInt(line.substring(line.lastIndexOf(" ")+1))));
            score6.setFont(textSize);
            line = br.readLine();
            name7 = new JLabel(line.substring(0, line.lastIndexOf(" ")));
            name7.setFont(textSize);
            score7 = new JLabel(String.valueOf(Integer.parseInt(line.substring(line.lastIndexOf(" ")+1))));
            score7.setFont(textSize);
            line = br.readLine();
            name8 = new JLabel(line.substring(0, line.lastIndexOf(" ")));
            name8.setFont(textSize);
            score8 = new JLabel(String.valueOf(Integer.parseInt(line.substring(line.lastIndexOf(" ")+1))));
            score8.setFont(textSize);
            line = br.readLine();
            name9 = new JLabel(line.substring(0, line.lastIndexOf(" ")));
            name9.setFont(textSize);
            score9 = new JLabel(String.valueOf(Integer.parseInt(line.substring(line.lastIndexOf(" ")+1))));
            score9.setFont(textSize);
            line = br.readLine();
            name10 = new JLabel(line.substring(0, line.lastIndexOf(" ")));
            name10.setFont(textSize);
            score10 = new JLabel(String.valueOf(Integer.parseInt(line.substring(line.lastIndexOf(" ")+1))));
            score10.setFont(textSize);


            name1.setBounds(45,140,2000,100);
            score1.setBounds(255,140,2000,100);
            name2.setBounds(45,210,2000,100);
            score2.setBounds(255,210,2000,100);
            name3.setBounds(45,290,2000,100);
            score3.setBounds(255,290,2000,100);
            name4.setBounds(45,370,2000,100);
            score4.setBounds(255,370,2000,100);
            name5.setBounds(45,450,2000,100);
            score5.setBounds(255,450,2000,100);
            name6.setBounds(490,140,2000,100);
            score6.setBounds(700,140,2000,100);
            name7.setBounds(490,210,2000,100);
            score7.setBounds(700,210,2000,100);
            name8.setBounds(490,290,2000,100);
            score8.setBounds(700,290,2000,100);
            name9.setBounds(490,370,2000,100);
            score9.setBounds(700,370,2000,100);
            name10.setBounds(490,450,2000,100);
            score10.setBounds(700,450,2000,100);
            this.add(name1);
            this.add(score1);
            this.add(name2);
            this.add(score2);
            this.add(name3);
            this.add(score3);
            this.add(name4);
            this.add(score4);
            this.add(name5);
            this.add(score5);
            this.add(name6);
            this.add(score6);
            this.add(name7);
            this.add(score7);
            this.add(name8);
            this.add(score8);
            this.add(name9);
            this.add(score9);
            this.add(name10);
            this.add(score10);

        }catch(Exception e){
            System.out.println("HI");
        }
        header1 = new JLabel("Name");
        header1.setFont(textSize);
        header1.setBounds(120,82,500,100);
        header2 = new JLabel("Score");
        header2.setFont(textSize);
        header2.setBounds(300,82,500,100);
        header3 = new JLabel("Name");
        header3.setFont(textSize);
        header3.setBounds(565,82,500,100);
        header4 = new JLabel("Name");
        header4.setFont(textSize);
        header4.setBounds(745,82,500,100);
        this.add(header1);
        this.add(header2);
        this.add(header3);
        this.add(header4);
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
