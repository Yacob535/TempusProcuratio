import javax.swing.*;

public class printLogo extends JLabel
{
    public printLogo(int x, int y)
    {
        this.setIcon(new ImageIcon("logo.png"));
        this.setBounds(x,y,100,100);
    }
}
