package DZ02;

/**
 * Created by Olga Shestakova
 * Date 19.07.2021
 */
public class MyArrayDataException extends Exception {
    public int i;
    public int j;

    public MyArrayDataException (int i, int j) {
        this.i = i;
        this.j = j;
    }
}
