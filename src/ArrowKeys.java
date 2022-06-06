/**
 *David Shim
 * Version #2
 * June 3 2022
 * 7 hours
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 * This class uses determines the number of times an arrow key is used
 */
public class ArrowKeys implements ActionListener {
    int screenNum = 1;
    JButton object1,object2,object3,object4,object5,object6,object7;
    int objectInteract = 0;
    /**
     * This method uses JFrames to create a model of our actual game frame and displays the arrow keys being used
     */
    public ArrowKeys() {

        JFrame frame = new JFrame();
        frame.setSize(950, 650);
        frame.setFocusable(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel bg1 = new background("roomPanel1.png",0,0,950,650);
        JLabel bg2 = new background("roomPanel2.png",0,0,950,650);
        JLabel bg3 = new background("roomPanel3.png",0,0,950,650);
        JLabel bg4 = new background("roomPanel4.png",0,0,950,650);
        JButton object1 = new plainButton(new ImageIcon("distraction1.png"),0,315,608,3269);
        JButton object2 = new plainButton(new ImageIcon("distraction2.png"),618,320,322,340);
        JButton object3 = new plainButton(new ImageIcon("distraction3.png"),20,0,534,270);
        JButton object4 = new plainButton(new ImageIcon("distraction4.png"),530,290,380,323);
        JButton object5 = new plainButton(new ImageIcon("distraction5.png"),700,40,219,240);
        JButton object6 = new plainButton(new ImageIcon("distraction6.png"),60,290,380,321);
        JButton object7 = new plainButton(new ImageIcon("distraction7.png"),340,160,611,441);

        JPanel panel = new JPanel();

        panel.setLayout(null);
        panel.add(object1);
        panel.add(object2);
        panel.add(object3);
        panel.add(object4);
        panel.add(object5);
        panel.add(object6);
        panel.add(object7);
        panel.add(bg1);
        panel.add(bg2);
        panel.add(bg3);
        panel.add(bg4);

        object1.setVisible(true);
        object2.setVisible(true);
        object3.setVisible(true);
        object4.setVisible(false);
        object5.setVisible(false);
        object6.setVisible(false);
        object7.setVisible(false);
        bg1.setVisible(false);
        bg2.setVisible(false);
        bg3.setVisible(false);
        bg4.setVisible(false);

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyReleased(KeyEvent e) {

            }
            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyPressed(KeyEvent e) {

                int keyCode = e.getKeyCode();
                if (screenNum == 1) {
                    if (keyCode == 39){
                        object1.setVisible(false);
                        object2.setVisible(false);
                        object3.setVisible(false);
                        bg1.setVisible(false);
                        bg2.setVisible(true);
                        screenNum = 2;
                    }
                    if (keyCode == 37){
                        object1.setVisible(false);
                        object2.setVisible(false);
                        object3.setVisible(false);
                        bg1.setVisible(false);
                        object7.setVisible(true);
                        bg4.setVisible(true);
                        screenNum = 4;
                    }
                }
                else if (screenNum == 2) {
                    if (keyCode == 39){
                        bg2.setVisible(false);
                        object4.setVisible(true);
                        object5.setVisible(true);
                        object6.setVisible(true);
                        bg3.setVisible(true);
                        screenNum = 3;
                    }
                    if (keyCode == 37){
                        bg2.setVisible(false);
                        object1.setVisible(true);
                        object2.setVisible(true);
                        object3.setVisible(true);
                        bg1.setVisible(true);
                        screenNum = 1;
                    }
                }
                else if (screenNum == 3) {
                    if (keyCode == 39){
                        object4.setVisible(false);
                        object5.setVisible(false);
                        object6.setVisible(false);
                        bg3.setVisible(false);
                        object7.setVisible(true);
                        bg4.setVisible(true);
                        screenNum = 4;
                    }
                    if (keyCode == 37){
                        object4.setVisible(false);
                        object5.setVisible(false);
                        object6.setVisible(false);
                        bg3.setVisible(false);
                        bg2.setVisible(true);
                        screenNum = 2;
                    }
                }
                else if (screenNum == 4) {
                    if (keyCode == 39){
                        object7.setVisible(false);
                        bg4.setVisible(false);
                        object1.setVisible(true);
                        object2.setVisible(true);
                        object3.setVisible(true);
                        bg1.setVisible(true);
                        screenNum = 1;
                    }
                    if (keyCode == 37){
                        object7.setVisible(false);
                        bg4.setVisible(false);
                        object4.setVisible(true);
                        object5.setVisible(true);
                        object6.setVisible(true);
                        bg3.setVisible(true);
                        screenNum = 3;
                    }
                }
                else if(objectInteract == 7){
                    return;
                }
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
            object1.setVisible(false);
            objectInteract++;
        }
        else if(e.getSource() == object2){
            object2.setVisible(false);
            objectInteract++;
        }
        else if(e.getSource() == object3){
            object3.setVisible(false);
            objectInteract++;
        }
        else if(e.getSource() == object4){
            object4.setVisible(false);
            objectInteract++;
        }
        else if(e.getSource() == object5){
            object5.setVisible(false);
            objectInteract++;
        }
        else if(e.getSource() == object6){
            object6.setVisible(false);
            objectInteract++;
        }
        else if(e.getSource() == object7){
            object7.setVisible(false);
            objectInteract++;
        }
    }
}