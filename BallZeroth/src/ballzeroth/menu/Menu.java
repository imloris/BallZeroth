package ballzeroth.menu;

import ballzeroth.*;
import java.awt.*;
import javax.swing.*;

public class Menu extends JFrame{    
    public static Dimension size;
    public static String title;
    public static Image[] wallpaper; //= SpriteIDs.wallpaperMenu;
    
    public Point mouse = new Point(0, 0);
    
    
    public Menu(){
        size = ballzeroth.BallZeroth.size;
        title = ballzeroth.BallZeroth.title;
        this.setResizable(false);
    }
    
    public static void menuInit(){
        wallpaper[0] = new ImageIcon(SpriteIDs.wallpaperMenu).getImage();
    }
    
    public void draw(Graphics g){
        g.drawImage(wallpaper[0], 0, 0, 800, 600, null);
    }
}
