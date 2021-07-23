package DZ03;

/**
 * Created by Olga Shestakova
 * Date 23.07.2021
 */
public class Main {
    public static void main(String[] args) {
        new Box<Apple>();
        new Box<Orange>();
    }

    public static void changeArrElements(Object[] array, int a, int b) {
        Object tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}
