
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class WalkDog extends characterPosition {
    MazePanel mp;
    KeyHandler keyH;

    public WalkDog(MazePanel mp, KeyHandler keyH){

        this.mp = mp;
        this.keyH = keyH;

        setDefaultValues();
        getPlayerImage();
    }
    public void setDefaultValues(){
        x = 0;
        y = 150;
        speed = 2;
        direction = "right";
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
            if (x < 0) {
                x = 0;
            }
            if (x > 950) {
                x = 950;
            }
            if (y < 0) {
                y = 0;
            }
            if (y > 650) {
                y = 650;
            }

            /**
             * vertical walls
             */
            if((250 > x && x > 200) && (y < 180 && y > 70)){
                x = 200;
            }
            else if((x > 280 && x < 290) && (y < 240 && y > 60)) {
                x=280;
            }
            else if((x > 260 && x < 270) && (y < 240 && y > 60)) {
                x=270;
            }
            else if((x > 50 && x < 60) && (y > 240 && y < 650)){
                x = 60;
            }
            else if((x > 50 && x < 60) && (y > 0 && y < 120)){
                x = 60;
            }
            else if((x > 340 && x < 350) && (y < 240 && y > 60)) {
                x = 350;
            }
            else if((x > 400 && x < 410) && (y < 180 && y >= 0)){
                x = 400;
            }
            else if((x > 460 && x < 470) && (y < 240 && y >= 0)){
                x = 470;
            }
            else if((x > 400 && x < 410) && (y < 650 && y > 270)){
                x = 400;
            }
            else if((x > 460 && x < 470) && (y < 650 && y > 270)){
                x = 470;
            }
            else if((x > 480 && x < 490) && (y > 40 && y < 510)){
                x = 480;
            }
            else if((x > 540 && x < 550) && (y > 40 && y < 510)){
                x = 550;
            }
            else if((x > 660 && x < 710) && (y > 370 && y < 650)){
                x=660;
            }
            else if((x > 720 && x < 730) && (y > 370 && y < 650)){
                x=730;
            }
            else if((x > 740 && x < 790) && (y > 320 && y < 650)){
                x = 740;
            }
            else if((x > 790 && x < 800) && (y > 320 && y < 650)){
                x = 800;
            }
            else if((x > 820 && x < 870) && (y > 0 && y < 520)){
                x = 820;
            }
            else if((x > 870 && x < 880) && (y > 0 && y < 520)){
                x = 880;
            }
            else if((80  > x && x > 70) && (y < 480 && y > 250)){
                x = 70;
            }
            else if((140  > x && x > 130) && (y < 650 && y > 430)){
                x = 130;
            }
            else if((140  > x && x > 130) && (y < 480 && y > 250)){
                x = 140;
            }
            else if((200  > x && x > 190) && (y < 650 && y > 410)){
                x = 200;
            }
            else if((160  > x && x > 150) && (y < 360 && y > 250)){
                x = 150;
            }
            else if((220  > x && x > 210) && (y < 360 && y > 250)){
                x = 220;
            }
            else if((330  > x && x > 320) && (y < 480 && y > 350)){
                x = 320;
            }else if((390  > x && x > 380) && (y < 480 && y > 350)){
                x = 390;
            }


            /**
             * Horizontal wall for maze
             */
            else if(y > 0 && y < 40){
                y = 40;
            }
            else if((y > 40 && y < 50)  && (x > 560 && x < 860)){
                y = 40;
            }
            else if(y < 650 && y > 530){
                y = 530;
            }
            else if((y > 170 && y < 180) && (250 > x && x > 10)){
                y = 170;
            }
            else if((y > 240 && y < 250) && (250 > x && x > 10)){
                y = 250;
            }
            else if((y > 130 && y < 140) && (260 > x && x > 70)){
                y = 140;
            }
            else if((y > 60 && y < 70) && (260 > x && x > 70)){
                y = 60;
            }
            else if((y > 170 && y < 180) && (x > 330 && x < 410)){
                y = 170;
            }
            else if((y > 240 && y < 250) && (x > 290 && x < 470)){
                y = 250;
            }
            else if((y > 250 && y < 260) && (x > 230 && x < 440)){
                y = 250;
            }
            else if((y > 330 && y < 340) && (x > 180 && x < 390)){
                y = 330;
            }
            else if((y > 480 && y < 490) && (x > 80 && x < 180)){
                y = 490;
            }
            else if((y > 410 && y < 420) && (x > 80 && x < 180)){
                y = 410;
            }
            else if((y > 520 && y < 530) && (x > 320 && x < 410)){
                y = 530;
            }
            else if((y > 450 && y < 460) && (x > 320 && x < 410)){
                y = 450;
            }
            else if((y > 400 && y < 410) && (x > 150 && x < 330)){
                y = 410;
            }
            else if((y > 320 && y < 330) && (x > 230 && x < 410)){
                y = 330;
            }
            else if((y > 110 && y < 120) && (x > 560 && x < 850)){
                y = 120;
            }
            else if((y > 120 && y < 180) && (x > 490 && x < 810)){
                y = 120;
            }
            else if((y > 190 && y < 200) && (x > 550 && x < 800)){
                y = 200;
            }
            else if((y > 200 && y < 260) && (x > 560 && x < 860)){
                y = 200;
            }
            else if((y > 270 && y < 280) && (x >560 && x < 860)){
                y = 280;
            }
            else if((y > 280 && y < 340) && (x >500 && x < 810)){
                y = 280;
            }
            else if((y > 350 && y < 360) && (x > 500 && x < 800)){
                y = 360;
            }
            else if((y > 430 && y < 440) && (x > 550 && x < 690)){
                y = 440;
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
