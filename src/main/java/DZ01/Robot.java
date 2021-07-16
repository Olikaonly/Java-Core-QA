package DZ01;

/**
 * Created by Olga Shestakova
 * Date 15.07.2021
 */
public class Robot implements Participant {
    private String name;
    private int run;
    private int jump;

    public Robot(String name, int run, int jump) {

        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    @Override
    public void run(int distance) {
        if (distance > run) {
            System.out.println(name + " Я не смог пробежать!");
        } else {
            System.out.println("Перед " + name + " дорожка " + distance + "м!" + " Он бежит по дорожке " + run + "м!");

        }
    }

    @Override
    public void jump(int height) {
        if (height > jump) {
            System.out.println(name + " Я не смог перепрыгнуть!");
        } else {
            System.out.println("Перед " + name + " стена " + height + "м!" + " Он прыгает через стену " + jump + "м!");

        }
    }
}
