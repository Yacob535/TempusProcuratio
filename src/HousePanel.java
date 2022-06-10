import javax.swing.*;
import java.awt.*;

public class HousePanel extends JPanel implements Runnable{
    final int screenWidth = 950;
    final int screenHeight = 650;

    int FPS = 60;

    BackgroundManager backgroundM = new BackgroundManager(this,1);

    KeyHandler keyH = new KeyHandler();
    Thread gameThread;
    EscapeRoom w = new EscapeRoom(this,keyH);
    int instance;
    public HousePanel(int i){
        instance = i;
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }

    public void startGameThread(){

        gameThread = new Thread(this);
        gameThread.start();

    }
    @Override
    public void run() {
        double drawInterval = 1000000000/FPS;
        double nextDrawTime = System.nanoTime() + drawInterval;
        while(gameThread != null){
            this.requestFocusInWindow();
            update();
            repaint();

            try {
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime/1000000;
                if(remainingTime < 0){
                    remainingTime = 0;
                }
                Thread.sleep((long) remainingTime);
                nextDrawTime += drawInterval;
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public void update(){
        w.update();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;
        backgroundM.draw(g2);
        w.draw(g2);

        g2.dispose();
    }
}
