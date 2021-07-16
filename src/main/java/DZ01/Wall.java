package DZ01;

/**
 * Created by Olga Shestakova
 * Date 15.07.2021
 */
public class Wall implements Obstacles {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant participant) {
        participant.jump(height);
    }
}
