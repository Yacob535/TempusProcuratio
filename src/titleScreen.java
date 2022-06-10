/**
 * Jacob Kuo
 * Version #002
 * May 18th 2022
 * 10 hours
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class creates a new JPanel that contains the contents of the title
 * screen
 */
public class titleScreen extends JPanel implements ActionListener {
    JButton exit, deficiencies, hiscore,continued;
    JLabel logo, bg1, bg2;
    JFrame f;
    int[] counter = new int[7];
    int continueStage = 0; // 0 = deficiency, 1 = panic room, 2 = escape room

    /**
     * This constructor creates 3 buttons, implements a background,
     * and the company logo
     * @param q Holds JFrame for the program
     */
    public titleScreen(JFrame q)
    {
        f = q;
        this.setLayout(null);
        exit = new colouredButton("Exit Game",638,500,200,75,255,255,255);
        deficiencies = new colouredButton("Start Game!",62,500,200,75,255,255,255);
        hiscore = new colouredButton("Highscores",362,500,200,75,255,255,255);
        bg1 = new background("titleScreen.png",275,-75,950,600);
        logo = new printLogo(840,525);
        bg2 = new background("skyBlue.png",0,0,1000,1000);
        exit.addActionListener(this);
        deficiencies.addActionListener(this);
        hiscore.addActionListener(this);

        this.add(exit);
        this.add(deficiencies);
        this.add(hiscore);
        this.add(bg1);
        this.add(logo);
        this.add(bg2);
        this.setVisible(true);
    }
    public titleScreen(JFrame q, int i)
    {
        f = q;
        continueStage = i;
        this.setLayout(null);
        exit = new colouredButton("Exit Game",638,500,200,75,255,255,255);
        deficiencies = new colouredButton("New Game!",62,500,200,75,255,255,255);
        hiscore = new colouredButton("Highscores",362,500,200,75,255,255,255);
        if (continueStage !=0)
        {
            continued = new colouredButton("Continue!", 62, 400, 200, 75, 255, 255, 255);
            continued.addActionListener(this);
            this.add (continued);
        }
        bg1 = new background("titleScreen.png",275,-75,950,600);
        logo = new printLogo(840,525);
        bg2 = new background("skyBlue.png",0,0,1000,1000);
        exit.addActionListener(this);
        deficiencies.addActionListener(this);
        hiscore.addActionListener(this);

        this.add(exit);
        this.add(deficiencies);
        this.add(hiscore);
        this.add(bg1);
        this.add(logo);
        this.add(bg2);
        this.setVisible(true);
    }

    /**
     * This method checks for actions performed by the 3 buttons.
     * Button 1: Goes to Deficiencies Room
     * Button 2: Goes to HighScores page
     * Button 3: Exits game
     * @param e ActionEvent variable
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == exit)
        {
            System.exit(0);
        }
        else if(e.getSource() == hiscore)
        {
            this.setVisible(false);
            highscores scores = new highscores();
            scores.addHighscore(0, "Dev1");
            scores.addHighscore(0, "Dev2");
            scores.addHighscore(0, "Dev3");
            scores.addHighscore(0, "Dev4");
            scores.addHighscore(0, "Dev5");
            scores.addHighscore(0, "Dev6");
            scores.addHighscore(0, "Dev7");
            scores.addHighscore(0, "Dev8");
            scores.addHighscore(0, "Dev9");
            scores.addHighscore(0, "Dev10");
            scores.updateHighscores();
            HighScore high = new HighScore(f,continueStage);
            f.add(high);
            high.setVisible(true);
        }
        else if(e.getSource() == deficiencies)
        {
            this.setVisible(false);
            infoScreenToDef def = new infoScreenToDef(f);
            f.add(def);
            def.setVisible(true);
        }
        else if (e.getSource()==continued)
        {
            if (continueStage == 1)
            {
                this.setVisible (false);
                transitionToPanic pan = new transitionToPanic (f);
                f.add(pan);
                pan.setVisible (true);
            }
            //else if (continueStage == 2)
            //{
                // the whole escape room thing
            //}
        }
    }
}
