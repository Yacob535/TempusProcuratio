/**
 *David Shim
 * Version #3
 * June 6 2022
 * 6 hours
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 * This class uses determines the number of times an arrow key is used
 */
public class ArrowKeys extends JPanel implements ActionListener,KeyListener{
    int screenNum = 1;
    static int objectInteract = 0;
    static int strikes = 0;
    /**
     * This method uses JFrames to create a model of our actual game frame and displays the arrow keys being used
     */

    JFrame f;
    int strike;
    int[] touched = new int[10];
    JLabel bg1 = new background("roomPanel1.png",0,0,950,650);
    JLabel bg2 = new background("roomPanel2.png",0,0,950,650);
    JLabel bg3 = new background("roomPanel3.png",0,0,950,650);
    JLabel bg4 = new background("roomPanel4.png",0,0,950,650);
    JButton object1 = new plainButton(new ImageIcon("distraction1.png"),0,315,608,329);
    JButton object2 = new plainButton(new ImageIcon("distraction2.png"),618,320,322,340);
    JButton object3 = new plainButton(new ImageIcon("distraction3.png"),20,0,534,270);
    JButton object4 = new plainButton(new ImageIcon("distraction4.png"),530,290,380,323);
    JButton object5 = new plainButton(new ImageIcon("distraction5.png"),700,40,219,240);
    JButton object6 = new plainButton(new ImageIcon("distraction6.png"),60,290,380,321);
    JButton object7 = new plainButton(new ImageIcon("distraction7.png"),340,160,611,441);
    JButton object8 = new plainButton(new ImageIcon("distraction8.png"),511,168,370,93);
    JButton object9 = new plainButton(new ImageIcon("distraction9.png"),475,38,423,103);
    JButton object10 = new plainButton(new ImageIcon("distraction10.png"),59,26,403,524);
    JLabel bMessage1 = new background("badMessage1.png",0,0,950,650);
    JLabel bMessage2 = new background("badMessage2.png",0,0,950,650);
    JLabel bMessage3 = new background("badMessage3.png",0,0,950,650);
    JLabel bMessage4 = new background("badMessage4.png",0,0,950,650);
    JLabel bMessage5 = new background("badMessage5.png",0,0,950,650);
    JLabel bMessage6 = new background("badMessage6.png",0,0,950,650);
    JLabel message1 = new background("message1.png",0,0,950,650);
    JLabel message2 = new background("message2.png",0,0,950,650);
    JLabel message3 = new background("message3.png",0,0,950,650);
    JLabel message4 = new background("message4.png",0,0,950,650);


    public ArrowKeys(JFrame q,int z,int[] zz) {
        f = q;
        z = strike;
        touched = zz;
        this.setLayout(null);

        //this.add(object1);
        //this.add(object2);

        //this.add(object3);
        this.add(object4);
        this.add(object5);


        this.add(object6);


        this.add(object7);


        this.add(object8);


        this.add(object9);

        this.add(object10);



        this.add(bMessage1);
        this.add(bMessage2);
        this.add(bMessage3);
        this.add(bMessage4);
        this.add(bMessage5);
        this.add(bMessage6);
        this.add(message1);
        this.add(message2);
        this.add(message3);
        this.add(message4);
        this.add(bg1);
        this.add(bg2);
        this.add(bg3);
        this.add(bg4);

        object1.setVisible(true);
        object2.setVisible(true);
        object3.setVisible(true);
        object4.setVisible(false);
        object5.setVisible(false);
        object6.setVisible(false);
        object7.setVisible(false);
        object8.setVisible(false);
        object9.setVisible(false);
        object10.setVisible(false);

        bg1.setVisible(true);
        bg2.setVisible(false);
        bg3.setVisible(false);
        bg4.setVisible(false);

        bMessage1.setVisible(false);
        bMessage2.setVisible(false);
        bMessage3.setVisible(false);
        bMessage4.setVisible(false);
        bMessage5.setVisible(false);
        bMessage6.setVisible(false);
        message1.setVisible(false);
        message2.setVisible(false);
        message3.setVisible(false);
        message4.setVisible(false);

        object1.addActionListener(this);
        object2.addActionListener(this);
        object3.addActionListener(this);
        object4.addActionListener(this);
        object5.addActionListener(this);
        object6.addActionListener(this);
        object7.addActionListener(this);
        object8.addActionListener(this);
        object9.addActionListener(this);
        object10.addActionListener(this);

        touched[2] = 1;
        touched[3] = 1;
        touched[6] = 1;
        touched[7] = 1;
        touched[8] = 1;
        touched[9] = 1;
        f.addKeyListener(new KeyListener() {
            public void keyReleased(KeyEvent e) {

            }

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {

                int keyCode = e.getKeyCode();
                if (screenNum == 1) {
                    if (keyCode == 39) {
                        System.out.println("HI");
                        object1.setVisible(false);
                        object2.setVisible(false);
                        object3.setVisible(false);
                        bg1.setVisible(false);
                        object8.setVisible(true);
                        object9.setVisible(true);
                        object10.setVisible(true);
                        bg2.setVisible(true);
                        screenNum = 2;
                    }
                    if (keyCode == 37) {
                        System.out.println("HI");
                        object1.setVisible(false);
                        object2.setVisible(false);
                        object3.setVisible(false);
                        bg1.setVisible(false);
                        object7.setVisible(true);
                        bg4.setVisible(true);
                        screenNum = 4;
                    }
                } else if (screenNum == 2) {
                    if (keyCode == 39) {
                        System.out.println("HI");
                        object8.setVisible(false);
                        object9.setVisible(false);
                        object10.setVisible(false);
                        bg2.setVisible(false);
                        object4.setVisible(true);
                        object5.setVisible(true);
                        object6.setVisible(true);
                        bg3.setVisible(true);
                        screenNum = 3;
                    }
                    if (keyCode == 37) {
                        System.out.println("HI");
                        object8.setVisible(false);
                        object9.setVisible(false);
                        object10.setVisible(false);
                        bg2.setVisible(false);
                        object1.setVisible(true);
                        object2.setVisible(true);
                        object3.setVisible(true);
                        bg1.setVisible(true);
                        screenNum = 1;
                    }
                } else if (screenNum == 3) {
                    if (keyCode == 39) {
                        System.out.println("HI");
                        object4.setVisible(false);
                        object5.setVisible(false);
                        object6.setVisible(false);
                        bg3.setVisible(false);
                        object7.setVisible(true);
                        bg4.setVisible(true);
                        screenNum = 4;
                    }
                    if (keyCode == 37) {
                        System.out.println("HI");
                        object4.setVisible(false);
                        object5.setVisible(false);
                        object6.setVisible(false);
                        bg3.setVisible(false);
                        object8.setVisible(true);
                        object9.setVisible(true);
                        object10.setVisible(true);
                        bg2.setVisible(true);
                        screenNum = 2;
                    }
                } else if (screenNum == 4) {
                    if (keyCode == 39) {
                        System.out.println("HI");
                        object7.setVisible(false);
                        bg4.setVisible(false);
                        object1.setVisible(true);
                        object2.setVisible(true);
                        object3.setVisible(true);
                        bg1.setVisible(true);
                        screenNum = 1;
                    }
                    if (keyCode == 37) {
                        System.out.println("HI");
                        object7.setVisible(false);
                        bg4.setVisible(false);
                        object4.setVisible(true);
                        object5.setVisible(true);
                        object6.setVisible(true);
                        bg3.setVisible(true);
                        screenNum = 3;
                    }
                } else if (objectInteract == 4) {
                    return;
                } else if (strikes == 0) {
                    return;
                }
            }
        });
        //f.add(this);

    }

    @Override
    public void actionPerformed(ActionEvent t) {
        System.out.println(t.getSource());
        if(t.getSource() == object1){

            touched[0] = 1;
            this.setVisible(false);
            popUpPanic p = new popUpPanic(f,strikes,touched,0);
            f.add(p);
            p.setVisible(true);
            object1.setVisible(false);
            object2.setVisible(false);
            object3.setVisible(false);
            message4.setVisible(true);
            objectInteract++;
            message4.setVisible(false);
            object1.setVisible(true);
            object2.setVisible(true);
            object3.setVisible(true);
        }
        else if(t.getSource() == object2){

            touched[1] = 1;
            this.setVisible(false);
            popUpPanic p = new popUpPanic(f,strikes,touched,1);
            f.add(p);
            p.setVisible(true);
            object1.setVisible(false);
            object2.setVisible(false);
            object3.setVisible(false);
            message3.setVisible(true);
            objectInteract++;
            message3.setVisible(false);
            object1.setVisible(true);
            object2.setVisible(true);
            object3.setVisible(true);
        }
        else if(t.getSource() == object3){
            touched[2] = 1;
            this.setVisible(false);
            popUpPanic p = new popUpPanic(f,strikes,touched,2);
            f.add(p);
            p.setVisible(true);
            object1.setVisible(false);
            object2.setVisible(false);
            object3.setVisible(false);
            bMessage2.setVisible(true);
            strikes--;
            bMessage2.setVisible(false);
            object1.setVisible(true);
            object2.setVisible(true);
            object3.setVisible(true);
        }
        else if(t.getSource() == object4){
            touched[3] = 1;
            this.setVisible(false);
            popUpPanic p = new popUpPanic(f,strikes,touched,3);
            f.add(p);
            p.setVisible(true);
            object4.setVisible(false);
            object5.setVisible(false);
            object6.setVisible(false);
            bMessage1.setVisible(true);
            strikes--;
            bMessage1.setVisible(false);
            object4.setVisible(true);
            object5.setVisible(true);
            object6.setVisible(true);
        }
        else if(t.getSource() == object5){
            touched[4] = 1;
            this.setVisible(false);
            popUpPanic p = new popUpPanic(f,strikes,touched,4);
            f.add(p);
            p.setVisible(true);
            object4.setVisible(false);
            object5.setVisible(false);
            object6.setVisible(false);
            message1.setVisible(true);
            objectInteract++;
            message1.setVisible(false);
            object4.setVisible(true);
            object5.setVisible(true);
            object6.setVisible(true);
        }
        else if(t.getSource() == object6){
            touched[5] = 1;
            this.setVisible(false);
            popUpPanic p = new popUpPanic(f,strikes,touched,5);
            f.add(p);
            p.setVisible(true);
            /*
            object4.setVisible(false);
            object5.setVisible(false);
            object6.setVisible(false);
            message2.setVisible(true);
            objectInteract++;
            message2.setVisible(false);
            object4.setVisible(true);
            object5.setVisible(true);
            object6.setVisible(true);

             */
        }
        else if(t.getSource() == object7){
            touched[6] = 1;
            this.setVisible(false);
            popUpPanic p = new popUpPanic(f,strikes,touched,6);
            f.add(p);
            p.setVisible(true);
            /*
            object7.setVisible(false);
            bMessage3.setVisible(true);
            strikes--;
            bMessage3.setVisible(false);
            object7.setVisible(true);

             */
        }
        else if(t.getSource() == object8){
            touched[7] = 1;
            this.setVisible(false);
            popUpPanic p = new popUpPanic(f,strikes,touched,7);
            f.add(p);
            p.setVisible(true);
            /*
            object8.setVisible(false);
            object9.setVisible(false);
            object10.setVisible(false);
            bMessage4.setVisible(true);
            strikes--;
            bMessage4.setVisible(false);
            object8.setVisible(true);
            object9.setVisible(true);
            object10.setVisible(true);

             */
        }
        else if(t.getSource() == object9){
            touched[8] = 1;
            this.setVisible(false);
            popUpPanic p = new popUpPanic(f,strikes,touched,8);
            f.add(p);
            p.setVisible(true);
            /*
            object8.setVisible(false);
            object9.setVisible(false);
            object10.setVisible(false);
            bMessage6.setVisible(true);
            strikes--;
            bMessage6.setVisible(false);
            object8.setVisible(true);
            object9.setVisible(true);
            object10.setVisible(true);

             */
        }
        else if(t.getSource() == object10){
            touched[9] = 1;
            this.setVisible(false);
            popUpPanic p = new popUpPanic(f,strikes,touched,9);
            f.add(p);
            p.setVisible(true);
            /*
            object8.setVisible(false);
            object9.setVisible(false);
            object10.setVisible(false);
            bMessage5.setVisible(true);
            strikes--;
            bMessage5.setVisible(false);
            object8.setVisible(true);
            object9.setVisible(true);
            object10.setVisible(true);

             */
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
System.out.println("HELLO");
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}