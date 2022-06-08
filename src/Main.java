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
        f.setSize(950, 650);
        titleScreen opening = new titleScreen(f);
        //transitionToPanic opening = new transitionToPanic(f);
                /*

        int t = 0;
        int[] arr = new int[10];
        ArrowKeys opening = new ArrowKeys(f,t,arr);
        */f.add(opening);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
