import java.awt.*;
import java.util.ArrayList;

public interface Character {
    String introduction();
    Point generateLocation(int x,int y);
    Boolean checkHitting(ArrayList<Point> shots, int damagePerShot);
}
