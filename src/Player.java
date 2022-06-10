import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;

public class Player extends characterPosition{

    GamePanel gp;
    KeyHandler keyH;
    BufferedImage image = null;

    public Player(GamePanel gp, KeyHandler keyH){

        this.gp = gp;
        this.keyH = keyH;
        setDefaultValues();
        getPlayerImage();
    }


    public void setDefaultValues(){
        x = 100;
        y = 100;
        speed = 100;
        direction = "down";
    }
    public void getPlayerImage(){
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
    public void update(){}
    public void draw(Graphics2D g2){


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
        else if(direction == "left") {
            if (spriteNum == 1) {
                image = left1;
            }
            if (spriteNum == 2) {
                image = left2;
            }
            if (spriteNum == 3) {
                image = left3;
            }
            if (spriteNum == 4) {
                image = left4;
            }
        }
        g2.drawImage(image, x,y,100,100,null);
    }
}