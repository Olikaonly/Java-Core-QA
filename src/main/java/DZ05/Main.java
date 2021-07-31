package DZ05;

import java.util.Arrays;

/**
 * Created by Olga Shestakova
 * Date 31.07.2021
 */
public class Main {
    public static void main(String[] args) {
        AppData appData = new AppData();
        appData.load("appData.csv");

        System.out.println(Arrays.toString(appData.getHeader()));
        System.out.println(Arrays.deepToString(appData.getData()));

        appData.save("appDataSave.csv");

    }
}
