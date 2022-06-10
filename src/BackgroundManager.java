import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;

public class BackgroundManager {
    int check;
    MazePanel mp;
    Backgrounds background;
    Backgrounds maze;

    public BackgroundManager(MazePanel mp,int i){

        check = i;
        getBackgroundImage();
    }

    public BackgroundManager(HousePanel hp,int i)
    {
        check = i;
        getBackgroundImage();
    }
    public void getBackgroundImage(){
        if(check == 0)
        {
            try{
                background = new Backgrounds();
                background.image = ImageIO.read(new File("grass.png"));
                maze = new Backgrounds();
                maze.image = ImageIO.read(new File("maze.png"));
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(check == 1)
        {
            try{
                background = new Backgrounds();
                background.image = ImageIO.read(new File("mainRoom.png"));
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(check == 2)
        {
            try{
                background = new Backgrounds();
                background.image = ImageIO.read(new File("backyard.png"));
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(check == 3)
        {
            try{
                background = new Backgrounds();
                background.image = ImageIO.read(new File("basement.png"));
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
    public void draw(Graphics2D g2){
        g2.drawImage(background.image,0,0,950,650,null);
    }
}