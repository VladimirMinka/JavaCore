package HW.threadsWeather;

public class Data {
    private int temp;
    private String city;


    public Data(int temp, String city) {
        this.temp = temp;
        this.city = city;

    }

    public int getTemp() {
        return temp;
    }

    public String getCity() {
        return city;
    }


}
