package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Door extends SuperObject{
    public OBJ_Door() {
        name = "Porte";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/resources/objects/door.png"));
        } catch (IOException e){
            e.printStackTrace();
        }
        collision = true;
    }
}
