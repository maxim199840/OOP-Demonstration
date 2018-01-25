import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Shooter implements Character {

    private String name;
    private Point location;
    private int health = 100;
    private int damage = 50;

    Shooter() {
        this.name = "Unknown Hero";
        this.location = generateLocation(10, 10);
    }

    Shooter(String name, int locationX, int locationY) {
        this.name = name;
        this.location = new Point(locationX, locationY);
    }

    public ArrayList<Point> shoot(int maxX, int maxY) {
        ArrayList<Point> shots = new ArrayList<Point>();
        shots.add(generateLocation(maxX, maxY));
        return shots;
    }

    public Boolean checkHitting(ArrayList<Point> shots, int damagePerShot) {
        for (Point shot : shots) {
            if (shot.x == getLocation().x&&shot.y == getLocation().y) {
                this.health -= damagePerShot;
                System.out.print("Hit! ");
                if (health > 0) {
                    System.out.println(name + " now has: " + health + " hp.");
                } else {
                    System.out.println(name + " died.");
                    return true;
                }
            }
        }
        return false;
    }

    void setName(String name) {
        this.name = name;
    }

    void setLocation(Point location) {
        this.location = location;
    }

    void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public Point getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public String introduction() {
        return "Hi, my name is " + name;
    }

    public Point generateLocation(int x, int y) {
        return new Point(new Random().nextInt(x), new Random().nextInt(y));
    }
}
