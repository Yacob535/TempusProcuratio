import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

public class MowLawn extends characterPosition{

    MowPanel mp;
    KeyHandler keyH;
    BufferedImage image = null;
    ArrayList<int[]> grass = new ArrayList<int[]>();

    public MowLawn(MowPanel mp, KeyHandler keyH){

        this.mp = mp;
        this.keyH = keyH;
        setDefaultValues();
        getPlayerImage();
    }


    public void setDefaultValues(){
        x = 0;
        y = 0;
        speed = 4;
        direction = "right";
    }
    public void getPlayerImage(){
        try{
            up = ImageIO.read(new File("mowUp.png"));
            down = ImageIO.read(new File("mowDown.png"));
            right = ImageIO.read(new File("mowRight.png"));
            left = ImageIO.read(new File("mowLeft.png"));

            coverGrass = ImageIO.read(new File("grass.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void update(){

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
        if(x > 870){
            x = 870;
        }
        if(x < 0){
            x = 0;
        }
        else if( y < 0){
            y = 0;
        }
        if (y > 570){
            y = 570;
        }


    }
    public void draw(Graphics2D g2){


        if(direction == "up"){
            image = up;
        }
        else if(direction == "down"){
            image = down;
        }
        else if(direction == "right"){
            image = right;
        }
        else if(direction == "left") {
            image = left;
        }


        int temp[] = {x,y};

        if(x >= 120) {
            grass.add(temp);
        }
        for (int i = 0; i < grass.size(); i++) {
            g2.drawImage(coverGrass, grass.get(i)[0], grass.get(i)[1], 80, 80, null);
        }
        g2.drawImage(image, x, y, 80, 80, null);
    }
}