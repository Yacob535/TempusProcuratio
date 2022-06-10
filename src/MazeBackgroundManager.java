import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;

public class MazeBackgroundManager {

    MazePanel mp;
    mazeBackground background;
    mazeBackground maze;

    public MazeBackgroundManager(MazePanel mp){


        getBackgroundImage();
    }
    public void getBackgroundImage(){
        try{
            background = new mazeBackground();
            background.image = ImageIO.read(new File("grass.png"));
            maze = new mazeBackground();
            maze.image = ImageIO.read(new File("maze.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void draw(Graphics2D g2){
        g2.drawImage(background.image,0,0,950,650,null);
        g2.drawImage(maze.image,0,0,950,650, null);
    }
}
