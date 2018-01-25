import java.util.Random;

public class OOPDemonstration {
    public static void main(String[] args) {
        int fieldX = 10, fieldY = 10;

        Random rand = new Random();
        Sniper sniper = new Sniper("Guardian", rand.nextInt(fieldX), rand.nextInt(fieldY));
        Rifler rifler = new Rifler("Scream", rand.nextInt(fieldX), rand.nextInt(fieldY));
        System.out.println(sniper.introduction());
        System.out.println(rifler.introduction());
        while(!sniper.checkHitting(rifler.shoot(fieldX, fieldY), rifler.getDamage())&&!rifler.checkHitting(sniper.shoot(fieldX, fieldY), sniper.getDamage())) {
            System.out.println("Shoot!");
            if(rand.nextInt(100)< 20){
                rifler.changeLocation(fieldX, fieldY);
            }
        }
    }
}
