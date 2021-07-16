package DZ01;

/**
 * Created by Olga Shestakova
 * Date 15.07.2021
 */
public class Treadmill implements Obstacles {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }


    @Override
    public void doIt(Participant participant) {

        participant.run(distance);
    }
}
