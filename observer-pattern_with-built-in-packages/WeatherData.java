package Observer_with_built_in_support;
import java.util.Observable;

public class WeatherData extends Observable {
	
	private float temperature;
	private float humidity;
	private float pressure;

	
	public WeatherData(){
		
	}
	
	
	// We are using the pull functionality from subject class.
	// Observer will get data when only they need the updated data

	public void measurementschanged() {
		setChanged();
		notifyObservers();
		
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementschanged();
		}

	public float getTemperature(){
		return temperature;
	}
	
	public float getHumidity(){
		return humidity;
	}
	
	public float getPressure(){
		return pressure;
	}

}
