import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Created by michael_hopps on 5/7/18.
 */
public class Map {

    private BufferedImage mapImage;

    public Map() {
        try{
            mapImage = ImageIO.read(new File("/res/map.jpg"));
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Map Image failed to load");
        }
    }

    public void draw(Graphics2D g2){
        if(mapImage != null)
            g2.drawImage(mapImage, 0, 0, null);
        else
            g2.fillRect(0, 0, 100, 100);
    }
}
