package Observer;

public class WeatherStation {

	public static void main(String[] args) {
	
		WeatherData weather= new WeatherData();
		CurrentConditionDisplay condition= new CurrentConditionDisplay(weather);
		
		weather.setMeasurements(25, 222, 500);

	}

}
