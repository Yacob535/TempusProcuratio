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
    JButton backButton;

    /**
     * This Constructor creates a back button that leads back to the
     * deficiencies room
     * @param q The JFrame used for the program
     * @param t Numbered blurb that should be outputted
     */
    int[] counter;
    boolean y;
    int screen, zz;
    JLabel info, bg,textBox,toys,phone,monitor,food,timer,window, calendar;
    public infoScreen(JFrame q, int[] t, boolean contains,int z)
    {
        this.setLayout(null);
        f = q;
        y = contains;
        counter = t;
        screen = z;
        backButton = new plainButton(new ImageIcon("backButton.png"),125,50,100,29);
        bg = new background("deficienciesRoom.png",0,0,950,650);
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


        if(a == 1)
        {
            toys = new background("toys.png",425,145,100,100);
            this.add(toys);
            zz = 20;
            z = "<html>Small toys and small games around your workspace can easily distract you. Try removing these objects from the area, or removing them from sight. This helps by giving your brain less excuses to not do what you are trying to focus on doing!</html>";
            x = 115;
            y = 200;
            width = 750;
            height = 400;

        }
        else if(a == 2)
        {
            phone = new background("phone.png",425,145,100,100);
            this.add(phone);
            zz = 20;
            z = "<html> Having your phone is like a miniature version of all of your friends in one place. The notification noises and pop-ups can be very distracting if you are trying to focus. Try going to a quiet and isolated environment to focus, and move your phone out of the room, or turn it to silent mode in a place that you cannot see immediately.  </html>";
            x = 120;
            y = 200;
            width = 750;
            height = 400;

        }
        else if(a == 3)
        {
            food = new background("food.png",425,165,100,100);
            this.add(food);
            zz = 20;
            z = "<html>Food can be a bad influence while studying and/or doing something that requires concentration. Although soothing for some people, food can be a distraction. The act of multitasking is very difficult for focusing, even with a small task such as chewing. The mind can only be in one place, and if you’re eating, it’s probably thinking about what you’re eating. Instead, try and designate a time during your break to eat.</html>";
            x = 120;
            y = 200;
            width = 750;
            height = 400;
        }
        else if(a == 4)
        {
            timer = new background("timer.png",425,165,100,100);
            this.add(timer);
            zz = 20;
            z = "<html>Using an alarm/timer is a great way to stay on task. It is scientifically proven that you will be most effective when you take breaks. A 5 - 10 minute break every hour will keep your brain running at peak performance. Breaks should be low-intensity and should not require too much brain power; it is a break after all. Some examples of good breaks are a 5 minute walk, talking to a friend,just resting your eyes even. When taking breaks, it is also very important that you return on time. The longer you take your break, the less effective you are using your time so make sure to set an alarm or timer to remind yourself to go back to work!</html>";
            x = 120;
            y = 200;
            width = 750;
            height = 400;

        }
        else if(a == 5)
        {
            zz = 20;
            monitor = new background("smolitor.png",365,100,200,200);
            this.add(monitor);
            z = "<html>The act of having a game, or chat open at the same time you are working can hurt your focus especially if it is on the same screen that your work is on. Social media companies, chat servers, and video games all have the same goal; attract your attention, and keep it. By leaving these applications open or around you, they can easily attract your attention, and break your focus for long periods of time. Try to close/remove these types of distractions from your workspace. </html>";
            x = 100;
            y = 100;
            width = 750;
            height = 600;
        }
        else if(a == 6)
        {
            zz = 20;
            calendar = new background("calendar.png",365,100,200,200);
            this.add(calendar);
            z = "<html>Using a calendar can help you keep yourself organized. Due dates, test dates, and important reminders can all go on a calendar.  This can help with planning your work so you never miss a due date, and are time efficient. Write down due dates for upcoming tests, assignments, and quizzes. By writing down important dates, you can always refer back to your calendar ad remind yourself of these dates and not have to worry about remembering them in your head.</html>";
            x = 100;
            y = 100;
            width = 750;
            height = 600;
        }
        else
        {
            zz = 20;
            window = new background("smoldow.png",365,100,200,200);
            this.add(window);
            z = "<html>When there are other people in the room (in this case, outside), it is difficult to focus. Friends, family, and roommates may not have your best interest in mind, and can easily distract you while you are trying to focus. Try to find a quiet place to work with minimal distractions.</html>";
            x = 100;
            y = 100;
            width = 750;
            height = 600;
        }
        info = new JLabel(z);
        info.setFont(new Font("Helvetica",Font.BOLD,zz));
        info.setBounds(x,y,width,height);
        this.add(info);

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
    }
}
