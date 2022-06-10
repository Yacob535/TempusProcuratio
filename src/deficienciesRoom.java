/**
 * Jacob Kuo
 * Version #003
 * May 27th 2022
 * 9 hours
 */


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.IntStream;

/**
 * This class creates a JPanel that contains the Deficiencies Room
 */
public class deficienciesRoom extends JPanel implements ActionListener {
    JFrame f;
    JLabel bg1, circle1, circle2, circle3, circle4, circle5, circle6, circle7,shelf,books;
    JButton toys,phone,food,timer,monitor,calendar,window,back;
    int[] counter = new int[7];
    boolean contains;
    /**
     * This constructor creates 8 images that are interactive buttons,
     * a background image, and a shelf
     * @param q The JFrame of the program
     * @param qq integer array that holds the states of each of the objects, pressed or not
     */
    public deficienciesRoom(JFrame q,int[] qq)
    {
        f = q;
        counter = qq;
        this.setLayout(null);
        drawCircles(counter,f);
        bg1 = new background("deficienciesRoom.jpg",0,0,950,650);
        shelf = new background("shelf.png",0,525,200,200);
        books = new background("books.png",23,575,139,100);
        toys = new plainButton(new ImageIcon("toys.png"),45,505,105,105);
        phone = new plainButton(new ImageIcon("phone.png"),150,440,50,70);
        food = new plainButton(new ImageIcon("food.png"),600,343,200,200);
        timer = new plainButton(new ImageIcon("timer.png"),800,445,50,67);
        monitor = new plainButton(new ImageIcon("monitor.png"),250,272,300,242);
        calendar = new plainButton(new ImageIcon("calendar.png"),50,50,200,191);
        window = new plainButton(new ImageIcon("window.png"),550,0,359,311);
        back = new plainButton(new ImageIcon("backButton.png"),15,15,100,29);

        toys.addActionListener(this);
        phone.addActionListener(this);
        food.addActionListener(this);
        timer.addActionListener(this);
        monitor.addActionListener(this);
        calendar.addActionListener(this);
        window.addActionListener(this);
        back.addActionListener(this);

        this.add(shelf);
        this.add(phone);
        this.add(books);
        this.add(toys);
        this.add(food);
        this.add(timer);
        this.add(monitor);
        this.add(calendar);
        this.add(window);
        this.add (back);
        this.add(bg1);

    }

    /**
     * This method checks for actions performed by the 8 buttons.
     * All the buttons lead to the infoScreen, but send a different value
     * indicating which information blurb pops up
     * @param e ActionEvent variable
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == toys)
        {
            if(counter[0] != 1)
            {
                this.setVisible(false);
                counter[0] = 1;
                contains = IntStream.of(counter).anyMatch(x -> x == 0);
                    infoScreen i = new infoScreen(f,counter,contains,1);
                    f.add(i);
                    i.setVisible(true);
            }
        }
        else if(e.getSource() == phone)
        {
            if(counter[1] != 1) {
                this.setVisible(false);
                counter[1] = 1;
                contains = IntStream.of(counter).anyMatch(x -> x == 0);
                infoScreen i = new infoScreen(f, counter,contains,2);
                f.add(i);
                i.setVisible(true);
            }
        }
        else if(e.getSource() == food)
        {
            if(counter[2] != 1) {
                this.setVisible(false);
                counter[2] = 1;
                contains = IntStream.of(counter).anyMatch(x -> x == 0);
                infoScreen i = new infoScreen(f, counter,contains,3);
                f.add(i);
                i.setVisible(true);
            }
        }
        else if(e.getSource() == timer)
        {
            if(counter[3] != 1) {
                this.setVisible(false);
                counter[3] = 1;
                contains = IntStream.of(counter).anyMatch(x -> x == 0);
                infoScreen i = new infoScreen(f, counter,contains,4);
                f.add(i);
                i.setVisible(true);
            }
        }
        else if(e.getSource() == monitor)
        {
            if(counter[4] != 1) {
                this.setVisible(false);
                counter[4] = 1;
                contains = IntStream.of(counter).anyMatch(x -> x == 0);
                infoScreen i = new infoScreen(f, counter,contains,5);
                f.add(i);
                i.setVisible(true);
            }
        }
        else if(e.getSource() == calendar)
        {
            if(counter[5] != 1) {
                this.setVisible(false);
                counter[5] = 1;
                contains = IntStream.of(counter).anyMatch(x -> x == 0);
                infoScreen i = new infoScreen(f, counter,contains,6);
                f.add(i);
                i.setVisible(true);
            }
        }
        else if(e.getSource() == window) {
            if (counter[6] != 1) {
                this.setVisible(false);
                counter[6] = 1;
                contains = IntStream.of(counter).anyMatch(x -> x == 0);
                infoScreen i = new infoScreen(f, counter,contains,7);
                f.add(i);
                i.setVisible(true);
            }
        }
        else if (e.getSource()==back)
        {
            this.setVisible(false);
            contains = IntStream.of(counter).anyMatch(x->x==0);
            infoScreen i = new infoScreen (f, counter, contains, 0);
            f.add(i);
            i.setVisible(true);
        }
    }

    /**
     * Method that prints out red circles for each of the objects that have been already clicked on
     * @param counter integer array that holds the states of each of the objects, pressed or not
     * @param f JFrame of the program
     */
    public void drawCircles(int[] counter,JFrame f)
    {
        if(counter[0] == 1)
        {
            circle1 = new createCircle(25,500,1);
            this.add(circle1);

        }
        if(counter[1] == 1)
        {
            circle2 = new createCircle(103,410,1);
            this.add(circle2);
        }
        if(counter[2] == 1)
        {
            circle3 = new createCircle(600,350,3);
            this.add(circle3);
        }
        if(counter[3] == 1)
        {
            circle4 = new createCircle(755,423,1);
            this.add(circle4);
        }
        if(counter[4] == 1)
        {
            circle5 = new createCircle(225,222,2);
            this.add(circle5);
        }
        if(counter[5] == 1)
        {
            circle6 = new createCircle(50,50,3);
            this.add(circle6);
        }
        if(counter[6] == 1)
        {
            circle7 = new createCircle(550,0,2);
            this.add(circle7);
        }
    }

}
