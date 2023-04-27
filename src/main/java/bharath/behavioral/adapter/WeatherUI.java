package bharath.behavioral.adapter;

/*
    Weather ui needs to display weather info
    but all it has is a zipcode while the weather finder
    needs a city name to be able to get weather info.
    To fix this we'll use an adapter that will sit between
    Weather UI class and the finder.
 */
public class WeatherUI {
    public void showTemp(int zipcode) {
        WeatherAdapter adapter
                 = new WeatherAdapter();

        System.out.println(adapter.findWeather(zipcode));
    }

    public static void main(String[] args) {
        WeatherUI ui = new WeatherUI();
        ui.showTemp(19406);
    }

}
