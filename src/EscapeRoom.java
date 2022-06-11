import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class EscapeRoom extends characterPosition {
    HousePanel hp;
    KeyHandler keyH;
    FlappyBird flappyBird;


    JButton task1 = new plainButton(new ImageIcon("tv.png"),70,100,100,50);

    public EscapeRoom(HousePanel mp, KeyHandler keyH){
        //this.hp.add(task1);
        this.hp = mp;
        this.keyH = keyH;

        setDefaultValues();
        getPlayerImage();
    }
    public void setDefaultValues(){
        x = 0;
        y = 150;
        speed = 10;
        direction = "right";
    }
    public void getPlayerImage(){
        task1.setVisible(false);
        try{
            up1 = ImageIO.read(new File("up1.png"));
            up2 = ImageIO.read(new File("up2.png"));
            up3 = ImageIO.read(new File("up3.png"));
            up4 = ImageIO.read(new File("up1.png"));
            down1 = ImageIO.read(new File("down1.png"));
            down2 = ImageIO.read(new File("down2.png"));
            down3 = ImageIO.read(new File("down3.png"));
            down4 = ImageIO.read(new File("down1.png"));
            left1 = ImageIO.read(new File("left1.png"));
            left2 = ImageIO.read(new File("left2.png"));
            left3 = ImageIO.read(new File("left3.png"));
            left4 = ImageIO.read(new File("left1.png"));
            right1 = ImageIO.read(new File("right1.png"));
            right2 = ImageIO.read(new File("right2.png"));
            right3 = ImageIO.read(new File("right3.png"));
            right4 = ImageIO.read(new File("right1.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void update(){
        if(keyH.upPressed == true || keyH.downPressed == true || keyH.leftPressed == true|| keyH.rightPressed == true){
            if (keyH.upPressed == true) {
                direction = "up";
                y -= speed;
            } else if (keyH.downPressed == true) {
                direction = "down";
                y += speed;
            } else if (keyH.rightPressed == true) {
                direction = "right";
                x += speed;
            } else if (keyH.leftPressed == true) {
                direction = "left";
                x -= speed;
            }
            if(this.hp.backgroundM.check == 1)
            {
                if(y < -30)
                {
                    y = 670;
                    x += 20;
                    this.hp.backgroundM.check = 2;
                    this.hp.backgroundM.getBackgroundImage();
                }
                if(y == 30 && x < 320 || y == 30 && x > 350)
                {
                    y += speed;
                }
                if(x > 350 && y < 30)
                {
                    x -= speed;
                }
                if(x < 320 && y < 30)
                {
                    y = 670;
                    this.hp.backgroundM.check = 3;
                    this.hp.backgroundM.getBackgroundImage();
                }
                if(x < -80)
                {
                    y = 540;
                    x = 150;
                    this.hp.backgroundM.check = 3;
                    this.hp.backgroundM.getBackgroundImage();
                }
                if(x == -20 && y > 430 || x == -20 && y < 370)
                {
                    x += speed;
                }
                if(x > 925)
                {
                    x -= speed;
                }

                if(x > 750 && y > 500 || x > 750 && y < 540)
                {
                    x -= speed;
                }
            }
            else if(this.hp.backgroundM.check == 2)
            {
                if(y > 680)
                {
                    y = -20;
                    x -= 20;
                    this.hp.backgroundM.check = 1;
                    this.hp.backgroundM.getBackgroundImage();
                }
                if(y > 615 && x < 340 || x > 390 && y > 615)
                {
                    y -= speed;
                }
                if(x < 0)
                {
                    x += speed;
                }
                if(x > 925)
                {
                    x -= speed;
                }
                if(y < -20)
                {
                    y += speed;
                }
            }
            else if(this.hp.backgroundM.check == 3)
            {
                if(x > 170 && y > 500 || x > 170 && y < 580)
                {
                    y = 400;
                    x = -50;
                    this.hp.backgroundM.check = 1;
                    this.hp.backgroundM.getBackgroundImage();
                }
                if((x < 160 && x > 100) && (y < 220  && y > 180)){
                    //task1.setVisible(true);
                    //flappyBird = new FlappyBird();
                }
                task1.setVisible(false);
            }
            else if(this.hp.backgroundM.check == 4)
            {

            }

                spriteCounter++;
            if (spriteCounter > 5) {
                if (spriteNum == 1) {
                    spriteNum = 2;
                } else if (spriteNum == 2) {
                    spriteNum = 3;
                } else if (spriteNum == 3) {
                    spriteNum = 4;
                } else if (spriteNum == 4) {
                    spriteNum = 1;
                }
                spriteCounter = 0;
            }
        }
    }
    public void draw(Graphics2D g2){
        BufferedImage image = null;

        if(direction == "up"){
            if(spriteNum == 1) {
                image = up1;
            }
            if(spriteNum == 2){
                image = up2;
            }
            if(spriteNum == 3){
                image = up3;
            }
            if(spriteNum == 4) {
                image = up4;
            }
        }
        else if(direction == "down"){
            if(spriteNum == 1){
                image = down1;
            }
            if(spriteNum == 2){
                image = down2;
            }
            if(spriteNum == 3){
                image = down3;
            }
            if(spriteNum == 4) {
                image = down4;
            }
        }
        else if(direction == "right"){
            if(spriteNum == 1){
                image = right1;
            }
            if(spriteNum == 2){
                image = right2;
            }
            if(spriteNum == 3){
                image = right3;
            }
            if(spriteNum == 4) {
                image = right4;
            }
        }
        else if(direction == "left"){
            if(spriteNum == 1){
                image = left1;
            }
            if(spriteNum == 2){
                image = left2;
            }
            if(spriteNum == 3){
                image = left3;
            }
            if(spriteNum == 4) {
                image = left4;
            }
        }
        g2.drawImage(image, x,y,60,70,null);
    }
}