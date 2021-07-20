package DZ01;

/**
 * Created by Olga Shestakova
 * Date 15.07.2021
 */
public class MainApp {
    public static void main(String[] args) {
        Obstacles[] obstacles = {
                new Wall(10), new Wall(45), new Treadmill(70), new Wall(48)
        };

        Participant[] participants = {
                new Human("Bob", 30, 20), new Cat("Kitty", 70, 45),
                new Robot("Tom", 99, 49)
        };
        for (Participant p : participants) {
            for (Obstacles o : obstacles) {
                o.doIt(p);
            }
        }
    }
}
