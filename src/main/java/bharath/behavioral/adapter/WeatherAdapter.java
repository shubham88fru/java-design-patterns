package bharath.behavioral.adapter;

/*
    This adapter will adapt the weatherUI to weather finder.
 */
public class WeatherAdapter {
    public int findWeather(int zipcode) {
        String city = null;
        if (zipcode == 19406) {
            city = "King of prussia";
        }

        WeatherFinder finder = new WeatherFinderImpl();
        return finder.find(city);
    }
}
