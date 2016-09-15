package Observer_with_built_in_support;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer,DisplayElement{

	Observable observable;
	private float temperature;
	private float humidity;
	private float pressure;

	public CurrentConditionDisplay(Observable observable ){
		this.observable=observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
	if(arg0 instanceof WeatherData){
		WeatherData weather=(WeatherData)arg0;
		this.temperature=weather.getTemperature();
		this.pressure=weather.getPressure();
		this.humidity=weather.getHumidity();
		display();
	}
		
	}
	
	
	@Override
	public void display() {
		System.out.println("Current conditions of the weather "+temperature+" degrees "+humidity+" humidity "+pressure+" pressure in mg");
		
	}
	

}
