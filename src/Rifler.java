import java.awt.*;
import java.util.ArrayList;

public class Rifler extends Shooter {
    Rifler() {
        setName("Unknown Hero");
        setLocation(generateLocation(10, 10));
        setDamage(20);
    }

    Rifler(String name, int locationX, int locationY) {
        setName(name);
        setLocation(new Point(locationX, locationY));
        setDamage(20);
    }

    @Override
    public ArrayList<Point> shoot(int maxX, int maxY) {
        ArrayList<Point> shots = new ArrayList<Point>();
        for (int i = 0; i < 30; i++)
            shots.add(generateLocation(maxX, maxY));
        return shots;
    }

    public void changeLocation(int maxX, int maxY) {
        setLocation(generateLocation(maxX, maxY));
        System.out.println(getName() + " changed location to: [x: " + getLocation().x + ", y: " + getLocation().y+"]");
    }
}
