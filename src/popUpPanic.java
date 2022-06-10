import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class popUpPanic extends JPanel implements ActionListener {

    int[] checked;
    JFrame f;
    JLabel bg,chair,text1,text2,phone,bed,text3,text4,text5,text6,toys,window,workMonitor,calendar,junkFood,books,clothes,text7,text8,text9,text10;
    JButton left1,right1,left2,left3,left4,left5,left6,left7,left8,left9,left10;
    Font font = new Font("Helvetica",Font.PLAIN,25);
    int strikes, screenNum,check;
    public popUpPanic(JFrame q,int st,int[] ar,int ch,int rn)
    {
        f = q;
        check = ch;
        checked = ar;
        strikes = st;
        screenNum = rn;
        this.setLayout(null);
        left1 = new plainButton(new ImageIcon("playVideoGames.png"),200,480,200,105);
        right1 = new plainButton(new ImageIcon("ignore.png"),550,500,150,46 );

        text2 = new JLabel("<html>You see that your friends have just gotten onto your favourite game: Teamfight Tactics. They ask you to join them. Oh! What great timing. It seems like your favourite YouTuber, LightBuilder888, just posted a new video. Maybe you could watch that after your TFT game!</html>");
        text2.setBounds(50,50,400,500);
        text2.setFont(font);
        phone = new background("distraction6.png",500,70,500,500);
        bg = new background("skyBlue.png",0,0,1000,1000);

        bed = new background("smolBed.png",100,100,400,400);
        text1 = new JLabel("<html>You see your guardian left you some dinner. Thinking about eating has really been slowing down your productivity. But is it worth the time to eat?</html>");
        text1.setBounds(450,0,400,600);
        text1.setFont(font);
        left2 = new plainButton(new ImageIcon("dinner.png"),200,410,300,300);
        left2.addActionListener(this);
        this.add(left2);
        this.add(text2);

        toys = new background("distraction3.png",240,0,500,300);
        text3 = new JLabel("<html>You remember you bought that new fort building kit the other day. Maybe you could build a fort quickly, and then play with your new action figures as well. </html>");
        text3.setBounds(70,180,800,400);
        text3.setFont(font);
        left3 = new plainButton(new ImageIcon("fort.png"),215,490,150,69);
        left3.addActionListener(this);
        this.add(left3);
        this.add(toys);
        this.add(text3);
        toys.setVisible(false);
        text3.setVisible(false);
        left3.setVisible(false);

        window = new background("distraction7.png",320,-100,700,700); // TF IS HAPPENING WITH THIS ONE, HALF CUT OFF
        text4 = new JLabel("<html>You see your friend knocking on the window for you to come out to play basketball. They promise it'll be a quick game, then you can get back to working</html>");
        text4.setBounds(70,-170,200,900);
        text4.setFont(font);
        left4 = new plainButton(new ImageIcon("goPlay.png"),280,365,160,320);
        left4.addActionListener(this);
        this.add(window);
        this.add(left4);
        this.add(text4);
        window.setVisible(false);
        left4.setVisible(false);
        text4.setVisible(false);

        workMonitor = new background("distraction4.png",100,100,400,400);
        text5 = new JLabel("<html>It seems like Minecraft is taking up 110% of your RAM. You were playing yesterday, but you have to do work today. You might want to close it so your computer is actually usable.</html>");
        text5.setBounds(500,-10,400,600);
        text5.setFont(font);
        left5 = new plainButton(new ImageIcon("closeMinecraft.png"),200,485,250,100);
        left5.addActionListener(this);
        this.add(workMonitor);
        this.add(left5);
        this.add(text5);
        workMonitor.setVisible(false);
        left5.setVisible(false);
        text5.setVisible(false);

        calendar = new background("distraction5.png",580,100,400,400);
        text6 = new JLabel("<html>You were notified of 82 more assignments today. (Why you have so many assignments due? We have no clue.) Maybe you should write these important dates down on the calendar.</html>");
        text6.setBounds(120,0,400,600);
        text6.setFont(font);
        left6 = new plainButton(new ImageIcon("dueDates.png"),200,480,200,100);
        left6.addActionListener(this);
        this.add(calendar);
        this.add(left6);
        this.add(text6);
        calendar.setVisible(false);
        left6.setVisible(false);
        text6.setVisible(false);

        junkFood = new background("distraction8.png",290,-40,400,400);
        text7 = new JLabel("<html>Hey! It seems like you left out some chips and a soda. Cool! Wouldn't it be nice to stuff your face with some nice, greasy, salty, and crunchy chips?</html");
        text7.setBounds(280,50,400,600);
        text7.setFont(font);
        left7 = new plainButton(new ImageIcon("junkFood.png"),250,480,190,100);
        left7.addActionListener(this);
        this.add(junkFood);
        this.add(left7);
        this.add(text7);
        junkFood.setVisible(false);
        left7.setVisible(false);
        text7.setVisible(false);

        books = new background("distraction9.png",280,-20,500,400);
        text8 = new JLabel("<html>You see a book that you bought last week on your shelf. You've been working hard for about 3 hours now. Maybe you should take a break and read for 10 minutes?</html>");
        text8.setBounds(297,50,400,600);
        text8.setFont(font);
        left8 = new plainButton(new ImageIcon("read.png"),290,475,160,100);
        left8.addActionListener(this);
        this.add(books);
        this.add(left8);
        this.add(text8);
        books.setVisible(false);
        left8.setVisible(false);
        text8.setVisible(false);

        clothes = new background("distraction10.png",500,20,400,450);
        text9 = new JLabel("<html>You were just donated some clothing from your older cousin this morning. Maybe you could try on some clothing. Fashion show?</html>");
        text9.setBounds(70,0,400,600);
        text9.setFont(font);
        left9 = new plainButton(new ImageIcon("fashionShow.png"),200,470,190,100);
        left9.addActionListener(this);
        this.add(clothes);
        this.add(left9);
        this.add(text9);
        clothes.setVisible(false);
        left9.setVisible(false);
        text9.setVisible(false);

        chair = new background("distraction2.png",550,0,600,600);
        text10 = new JLabel("<html>You are really tired from staying up until 4:30am every day for the last 7 days for your ICS ISP. You stare at your chair, and decide that you want to take a 10 minute nap. You made sure to set an alarm for that is loud enough to wake up the whole neighborhood</html>");
        text10.setBounds(80,-20,400,600);
        text10.setFont(font);
        left10 = new plainButton(new ImageIcon("nap.png"),300,390,300,300);
        left10.addActionListener(this);
        this.add(chair);
        this.add(left10);
        this.add(text10);
        chair.setVisible(false);
        left10.setVisible(false);
        text10.setVisible(false);


        left1.addActionListener(this);
        right1.addActionListener(this);
        this.add(text1);

        this.add(phone);
        this.add(left1);
        this.add(bed);
        bed.setVisible(false);
        text1.setVisible(false);
        text2.setVisible(false);
        phone.setVisible(false);
        left1.setVisible(false);
        left2.setVisible(false);

        if(check == 0)
        {
            text1.setVisible(true);
            bed.setVisible(true);
            left2.setVisible(true);
        }
        else if(check == 1)
        {
            text10.setVisible(true);
            chair.setVisible(true);
            left10.setVisible(true);
        }
        else if(check == 2)
        {
            text3.setVisible(true);
            toys.setVisible(true);
            left3.setVisible(true);
        }
        else if(check == 3)
        {
            text5.setVisible(true);
            workMonitor.setVisible(true);
            left5.setVisible(true);
        }
        else if(check == 4)
        {
            text6.setVisible(true);
            calendar.setVisible(true);
            left6.setVisible(true);
        }
        else if(check == 5)
        {
            text2.setVisible(true);
            phone.setVisible(true);
            left1.setVisible(true);
        }
        else if(check == 6)
        {
            window.setVisible(true);
            left4.setVisible(true);
            text4.setVisible(true);
        }
        else if(check == 7)
        {
            junkFood.setVisible(true);
            left7.setVisible(true);
            text7.setVisible(true);
        }
        else if(check == 8)
        {
            books.setVisible(true);
            left8.setVisible(true);
            text8.setVisible(true);
        }
        else if(check == 9)
        {
            clothes.setVisible(true);
            left9.setVisible(true);
            text9.setVisible(true);
        }
        else if(check == 10)
        {
            chair.setVisible(true);
            left10.setVisible(true);
            text10.setVisible(true);
        }
        this.add(right1);
        this.add(bg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == left1)
        {
            this.setVisible(false);
            knowledgeCheck p = new knowledgeCheck(f,0,strikes,screenNum,checked);
            f.add(p);
            p.setVisible(true);
        }
        else if(e.getSource() == left2)
        {
            this.setVisible(false);
            knowledgeCheck p = new knowledgeCheck(f,1,strikes,screenNum,checked);
            f.add(p);
            p.setVisible(true);
        }
        else if(e.getSource() == left3)
        {
            this.setVisible(false);
            knowledgeCheck p = new knowledgeCheck(f,2,strikes,screenNum,checked);
            f.add(p);
            p.setVisible(true);
        }
        else if(e.getSource() == left4)
        {
            this.setVisible(false);
            knowledgeCheck p = new knowledgeCheck(f,3,strikes,screenNum,checked);
            f.add(p);
            p.setVisible(true);
        }
        else if(e.getSource() == left5)
        {
            this.setVisible(false);
            knowledgeCheck p = new knowledgeCheck(f,4,strikes,screenNum,checked);
            f.add(p);
            p.setVisible(true);
        }
        else if(e.getSource() == left6)
        {
            this.setVisible(false);
            knowledgeCheck p = new knowledgeCheck(f,5,strikes,screenNum,checked);
            f.add(p);
            p.setVisible(true);
        }
        else if(e.getSource() == left7)
        {
            this.setVisible(false);
            knowledgeCheck p = new knowledgeCheck(f,6,strikes,screenNum,checked);
            f.add(p);
            p.setVisible(true);
        }
        else if(e.getSource() == left8)
        {
            this.setVisible(false);
            knowledgeCheck p = new knowledgeCheck(f,7,strikes,screenNum,checked);
            f.add(p);
            p.setVisible(true);
        }
        else if(e.getSource() == left9)
        {
            this.setVisible(false);
            knowledgeCheck p = new knowledgeCheck(f,8,strikes,screenNum,checked);
            f.add(p);
            p.setVisible(true);
        }
        else if(e.getSource() == left10)
        {
            this.setVisible(false);
            knowledgeCheck p = new knowledgeCheck(f,9,strikes,screenNum,checked);
            f.add(p);
            p.setVisible(true);
        }
        else if(e.getSource() == right1)
        {
            this.setVisible(false);
            ArrowKeys p = new ArrowKeys(f,screenNum,checked,strikes);
            f.add(p);
            p.setVisible(true);
        }

    }
}