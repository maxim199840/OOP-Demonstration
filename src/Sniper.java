import java.awt.*;
import java.util.ArrayList;

public class Sniper extends Shooter {
    Sniper(){
        setName("Unknown Hero");
        setLocation(generateLocation(10, 10));
        setDamage(70);
    }

    Sniper(String name, int locationX, int locationY){
        setName(name);
        setLocation(new Point(locationX, locationY));
        setDamage(70);
    }

    @Override
    public ArrayList<Point> shoot(int maxX, int maxY){
        ArrayList<Point> shots = new ArrayList<Point>();
        for(int i = 0; i < 10; i++)
        shots.add(generateLocation(maxX, maxY));
        return shots;
    }
}
