/**
 *David Shim
 * Version #2
 * June 3 2022
 * 7 hours
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * This class uses determines the number of times an arrow key is used
 */
public class ArrowKeys implements ActionListener {

    /**
     * This method uses JFrames to create a model of our actual game frame, displays the arrow keys being used, and has interactive objects
     *
     */
    JButton object1;
    public ArrowKeys() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 1050);
        frame.setFocusable(true);
        
        object1 = new plainButton(new ImageIcon("distraction1"),0,0,950,650);
        JLabel bg1 = new background("roomPanel1.jpg",0,0,1000,1000);
        JLabel bg2 = new background("roomPanel2.png",0,0,1000,1000);
        JLabel bg3 = new background("roomPanel3.png",0,0,1000,1000);
        JLabel bg4 = new background("roomPanel4.png",0,0,1000,1000);
        JPanel panel = new JPanel();
        JLabel left = new JLabel();
        JLabel right = new JLabel();

        panel.add(left);
        panel.add(right);
        panel.add(bg1);
        panel.add(bg2);
        panel.add(bg3);
        panel.add(bg4);
        bg1.setVisible(false);
        bg2.setVisible(false);
        bg3.setVisible(false);
        bg4.setVisible(false);
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
            @Override
            public void keyPressed(KeyEvent e) {
                int screenNum = 3;
                int keyCode = e.getKeyCode();
                //int x = 0;
                    if (screenNum == 1) {
                        switch (keyCode) {
                            case KeyEvent.VK_RIGHT:
                                bg1.setVisible(false);
                                System.out.println(1);
                                bg2.setVisible(true);
                                screenNum = 2;
                                break;
                            case KeyEvent.VK_LEFT:
                                bg1.setVisible(false);
                                bg4.setVisible(true);
                                screenNum = 4;
                                System.out.println(2);
                                break;
                        }
                    }
                    if (screenNum == 2) {
                        switch (keyCode) {
                            case KeyEvent.VK_RIGHT:
                                bg2.setVisible(false);
                                bg3.setVisible(true);
                                System.out.println(3);
                                screenNum = 3;
                                break;

                            case KeyEvent.VK_LEFT:
                                bg2.setVisible(false);
                                bg1.setVisible(true);
                                screenNum = 1;
                                System.out.println(4);

                                break;
                        }
                    }
                    if (screenNum == 3) {
                        switch (keyCode) {
                            case KeyEvent.VK_RIGHT:
                                bg3.setVisible(false);
                                bg4.setVisible(true);
                                screenNum = 4;
                                System.out.println(5);
                                break;

                            case KeyEvent.VK_LEFT:
                                bg3.setVisible(false);
                                bg2.setVisible(true);
                                screenNum = 2;
                                System.out.println(6);
                                break;
                        }
                    }
                    if (screenNum == 4) {
                        switch (keyCode) {
                            case KeyEvent.VK_RIGHT:
                                bg4.setVisible(false);
                                bg1.setVisible(true);
                                //screenNum = 1;
                                System.out.println(7);
                                break;

                            case KeyEvent.VK_LEFT:
                                bg4.setVisible(false);
                                bg3.setVisible(true);
                                screenNum = 3;
                                System.out.println(8);
                                break;
                        }
                    }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                                 }
        });
                frame.add(panel);
    }

    public static void main(String[] args) {
        new ArrowKeys();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == object1){
            System.out.println("hi");
        }
    }
}
