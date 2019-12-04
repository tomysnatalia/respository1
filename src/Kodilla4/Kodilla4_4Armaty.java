import java.lang.*;
import java.util.*;


class Cannon {

    String cannonNumber;
    boolean loaded = true;

    public Cannon(String cannonNumber, boolean loaded) {
        this.cannonNumber = cannonNumber;
        this.loaded = loaded;
    }
    boolean loaded(){
        return loaded = true;
    }

    public String fire() {
        if (loaded == false) {
            System.out.println(cannonNumber + " - no bullet");
        }
        return " ";
    }
}


class App2 {

    public static void main(String[] args) {


        Cannon cannon1 = new Cannon("Cannon number 1", true);
        Cannon cannon2 = new Cannon("Cannon number 2", true);
        Cannon cannon3 = new Cannon("Cannon number 3", false);
        Cannon cannon4 = new Cannon("Cannon number 4", true);

        LinkedList<Cannon> cannons = new LinkedList<Cannon>();
        cannons.add(cannon1);
        cannons.add(cannon2);
        cannons.add(cannon3);
        cannons.add(cannon4);


        for (Cannon cannon : cannons) {
            if (cannon.loaded == false) cannon.loaded(); {
                System.out.print(cannon.cannonNumber + " is ready" + "\n");
            }
        }
    }
}