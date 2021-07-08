import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by Olga Shestakova
 * Date 08.06.2021
 */
public class Main {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://icanhazdadjoke.com/")
                .header("Accept", "application/json")
                .build();

        Response response = okHttpClient.newCall(request).execute();

        System.out.println(response.body().string());
    }
}
