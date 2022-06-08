import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    final int screenWidth = 950;
    final int screenHeight = 650;

    int FPS = 60;

    KeyHandler keyH = new KeyHandler();
    Thread gameThread;
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;

    public GamePanel(){

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
        if(keyH.upPressed == true){
            playerY -= playerSpeed;
        }
        else if(keyH.downPressed == true){
            playerY += playerSpeed;
        }
        else if(keyH.rightPressed == true){
            playerX += playerSpeed;
        }
        else if(keyH.leftPressed == true){
            playerX -= playerSpeed;
        }
        if(playerX < 0 ){
            playerX = 0;
        }
        if(playerX > 950){
            playerX = 950;
        }
        if(playerY < 0){
            playerY = 0;
        }
        if(playerY > 650){
            playerY = 650;
        }
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;

        g2.setColor(Color.white);

        g2.fillRect(playerX,playerY,48,48);

        g2.dispose();
    }
}
