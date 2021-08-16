package DZ07.entity;


/**
 * Created by Olga Shestakova
 * Date 06.08.2021
 */
public class Weather {
    private String city;
    private String localDate;
    private double temperature;
    private String text;

    public Weather(String city, String localDate, double temperature, String text) {
        this.city = city;
        this.localDate = localDate;
        this.temperature = temperature;
        this.text = text;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public String getLocalDate() {

        return localDate;
    }

    public void setLocalDate(String localDate) {
        this.localDate = localDate;
    }

    public double getTemperature() {

        return temperature;
    }

    public void setTemperature(double temperature) {

        this.temperature = temperature;
    }

    public String getText() {

        return text;
    }

    public void setText(String text) {

        this.text = text;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' +
                ", localDate='" + localDate + '\'' +
                ", temperature=" + temperature +
                ", text='" + text + '\'' +
                '}';
    }
}