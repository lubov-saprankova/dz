package model;


public class DBRow {
    private String city;
    private String localDate;
    private String weatherText;
    private Double temperature;

    public DBRow(String city, String localDate, String weatherText, Double temperature) {
        this.city = city;
        this.localDate = localDate;
        this.weatherText = weatherText;
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public String getLocalDate() {
        return localDate;
    }

    public String getWeatherText() {
        return weatherText;
    }

    public Double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return  "Город='" + city + '\'' +
                ", дата='" + localDate + '\'' +
                ", погода='" + weatherText + '\'' +
                ", температура=" + temperature +
                '}';
    }

    public String toCuteString() {
        return  localDate + '\t' +
                " — " + weatherText + ",\t" +
                "t°C = " + temperature;
    }

}
