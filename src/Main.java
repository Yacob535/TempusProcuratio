/**
 * Jacob Kuo
 * Version #001
 * May 18th
 * 0.25 hours
 */

import javax.swing.*;

/**
 * This class is the main driver of the game
 */
public class Main {
    /**
     * Main method that creates a JFrame for the game to run in,
     * and also creates a new instance of the title screen which is run
     * @param args String arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame("Due later? Do Later!");
        f.setResizable(false);
        f.setSize(950, 675);
        /*
        MazePanel mazePanel = new MazePanel(1);
        f.add(mazePanel);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        mazePanel.startGameThread();

         */
        /*
        buttonMiniGame m = new buttonMiniGame(f,0);
        f.add(m);

         */
        FlappyBird bird = new FlappyBird();
        f.add(bird);
        //transitionToPanic opening = new transitionToPanic(f);
        /*
        HousePanel mapPanel = new HousePanel(1);
        f.add(mapPanel);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        mapPanel.startGameThread();
        int t = 0;
        int[] arr = new int[10];
         */


        //ArrowKeys opening = new ArrowKeys(f,t,arr);

        //f.add(opening);
        /*
        titleScreen j = new titleScreen(f);
        f.add(j);
        */
        /*
        MowPanel mowPanel = new MowPanel();
        f.add(mowPanel);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        mowPanel.startGameThread();
        */

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
