import javax.swing.*;
import java.awt.*;

public class MowPanel extends JPanel implements Runnable {

    final int screenWidth = 950;
    final int screenHeight = 650;

    int FPS = 60;

    LawnBackgroundManager background = new LawnBackgroundManager(this);

    KeyHandler keyH = new KeyHandler();
    Thread gameThread;
    MowLawn mowLawn = new MowLawn(this, keyH);

    public MowPanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }

    public void startGameThread() {

        gameThread = new Thread(this);
        gameThread.start();

    }

    @Override
    public void run() {

        double drawInterval = 1000000000 / FPS;
        double nextDrawTime = System.nanoTime() + drawInterval;

        while (gameThread != null) {
            this.requestFocusInWindow();
            mowLawn.update();
            repaint();

            try {
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime / 1000000;
                if (remainingTime < 0) {
                    remainingTime = 0;
                }
                Thread.sleep((long) remainingTime);
                nextDrawTime += drawInterval;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        background.draw(g2);
        mowLawn.draw(g2);

        g2.dispose();
    }
}