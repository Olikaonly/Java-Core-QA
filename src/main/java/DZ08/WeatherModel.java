package DZ08;

import DZ08.entity.Weather;

import java.io.IOException;
import java.util.List;

/**
 * Created by Olga Shestakova
 * Date 10.08.2021
 */
public interface WeatherModel {
    void getWeather(String selectedCity, Period period) throws IOException;

    public List<Weather> getSavedToDBWeather();
}
