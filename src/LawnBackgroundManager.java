import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;

public class LawnBackgroundManager {
    MowPanel Mp;
    LawnBackground background;
    LawnBackground grass;
    LawnBackground coverGrass;

    public LawnBackgroundManager(MowPanel Mp){

        getBackgroundImage();
    }
    public void getBackgroundImage(){
        try{
            background = new LawnBackground();
            background.lawn = ImageIO.read(new File("ground.png"));
            grass = new LawnBackground();
            grass.lawn = ImageIO.read(new File("shaveGrass.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void draw(Graphics2D g2){
        g2.drawImage(background.lawn,0,0,950,650,null);
        g2.drawImage(grass.lawn,0,0,950,650,null);
    }
}
