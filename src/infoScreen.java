/**
 * Jacob Kuo
 * Version #003
 * June 3rd 2022
 * 6.5 hours
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class creates a JPanel that has a back button that leads back to the
 * deficiencies room
 */
public class infoScreen extends JPanel implements ActionListener{
    JFrame f;
    JButton backButton, exitButton;

    /**
     * This Constructor creates a back button that leads back to the
     * deficiencies room
     * @param q The JFrame used for the program
     * @param t Numbered blurb that should be outputted
     */
    int[] counter;
    boolean y;
    int screen, zz;
    JLabel info, bg,textBox,toys,phone,monitor,food,timer,window, calendar,logo;
    public infoScreen(JFrame q, int[] t, boolean contains,int z)
    {
        this.setLayout(null);
        f = q;
        y = contains;
        counter = t;
        screen = z;
        backButton = new plainButton(new ImageIcon("backButton.png"),125,50,100,29);
        bg = new background("deficienciesRoom.png",0,0,950,650);
        logo = new printLogo(746,476);
        textBox = new background("textBox.PNG",-20,-10,950,650);
        giveScreen(screen);
        backButton.addActionListener(this);
        this.add(backButton);
        this.add(textBox);
        this.add(bg);


    }

    public void giveScreen(int a)
    {
        this.setLayout(null);
        String z = "";
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        screen = a;

        if (a==0)
        {
            exitButton = new plainButton(new ImageIcon("continueButton2.png"),330,450,300,100);
            background ex = new background("exit.png",320,100,700,100);
            info = new JLabel("<html>Are you sure you would like to go back to the main menu? You will have to restart this level all over again if you do.");
            info.setFont(new Font("Helvetica", Font.PLAIN, 25));
            info.setBounds(115,100,750,400);
            JLabel info2 = new JLabel(" If you are sure you would like to exit, press continue to leave.");
            info2.setFont(new Font("Helvetica", Font.PLAIN, 25));
            info2.setBounds (135, 200, 750, 400);
            exitButton.addActionListener(this);
            this.add(info);
            this.add(info2);
            this.add(exitButton);
            this.add (ex);
        }
        else
        {
            if (a == 1) {
                toys = new background("toys.png", 425, 185, 100, 100);
                this.add(toys);
                this.add(logo);
                zz = 20;
                z = "<html>Small toys and small games around your workspace can easily distract you. Try removing these objects from the area, or removing them from sight. This helps by giving your brain less excuses for not focusing on what's directly in front of you!</html>";
                x = 115;
                y = 160;
                width = 750;
                height = 400;

            } else if (a == 2) {
                phone = new background("phone.png", 450, 195, 100, 100);
                this.add(phone);
                this.add(logo);
                zz = 20;
                z = "<html> Having your phone is like a miniature version of all of your friends in one place. The notification noises and pop-ups can be very distracting if you are trying to focus. Try going to a quiet and isolated environment, and keep your phone out of sight, distance, and auditory range.  </html>";
                x = 108;
                y = 180;
                width = 750;
                height = 400;

            } else if (a == 3) {
                food = new background("food.png", 425, 165, 100, 100);
                this.add(food);
                this.add(logo);
                zz = 20;
                z = "<html>Food can be a bad influence while studying and/or doing something that requires concentration. Multitasking is very difficult for focusing, even with a small task such as chewing. You can only think of one thing at a time, and if you’re eating, it’s probably thinking about what you’re eating. Instead, designate eating breaks.</html>";
                x = 105;
                y = 200;
                width = 750;
                height = 400;
            } else if (a == 4) {
                timer = new background("timer.png", 435, 165, 100, 100);
                this.add(timer);
                this.add(logo);
                zz = 20;
                z = "<html>Using an alarm/timer is a great way to stay on task. It is scientifically proven that you will be most effective when you take breaks. A 5 - 10 minute break every hour will keep your brain running at peak performance. Breaks should be light and generally thoughtless. Some good examples are a 5 minute walk, talking to a friend,or just resting your eyes. When taking breaks, it is also very important that you return on time, or else you may end up using your time ineffectively!</html>";
                x = 100;
                y = 180;
                width = 750;
                height = 400;

            } else if (a == 5) {
                zz = 20;
                monitor = new background("smolitor.png", 365, 100, 200, 200);
                this.add(monitor);
                this.add(logo);
                z = "<html>Having a game or chat open at the same time you are working can hurt your focus especially if it is on the same screen that your work is on. By leaving these applications open or around you, they can easily attract your attention, and break your focus for long periods of time. Try to close/remove these types of distractions from your workspace. </html>";
                x = 100;
                y = 100;
                width = 750;
                height = 600;
            } else if (a == 6) {
                zz = 20;
                calendar = new background("calendar.png", 365, 75, 200, 200);
                this.add(calendar);
                this.add(logo);
                z = "<html>Using a calendar can help you keep your schedule and important dates/reminders organized. By writing down important dates, you can always refer back to your calendar to remind yourself not have to worry about remembering them in your head. Less memory used for peripheral dates means more focus on important tasks.</html>";
                x = 107;
                y = 100;
                width = 750;
                height = 600;
            } else {
                zz = 20;
                window = new background("smoldow.png", 365, 110, 200, 200);
                this.add(window);
                this.add(logo);
                z = "<html>When there are other people in the room (in this case, outside), it is difficult to focus. Friends, family, and roommates may not have your best interest in mind, and can easily distract you. Try to find a quiet place to work with minimal distractions.</html>";
                x = 100;
                y = 100;
                width = 750;
                height = 600;
            }
            info = new JLabel(z);
            info.setFont(new Font("Helvetica", Font.BOLD, zz));
            info.setBounds(x, y, width, height);
            this.add(info);
        }
    }

    /**
     * This method checks for actions performed by the button.
     * If the player has gone through all of the objects in the room, they will be brought to transitionToPanic
     * rather than back to the deficiencies room
     * @param e ActionEvent variable
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == backButton)
        {
            if(!y)
            {
                this.setVisible(false);
                transitionToPanic t = new transitionToPanic(f);
                f.add(t);
                t.setVisible(true);
            }
            else
            {
                this.setVisible(false);
                deficienciesRoom d = new deficienciesRoom(f,counter);
                f.add(d);
                d.setVisible(true);
            }

        }
        else if (e.getSource()==exitButton)
        {
            this.setVisible(false);
            titleScreen t = new titleScreen(f,0);
            f.add(t);
            t.setVisible(true);
        }
    }
}
