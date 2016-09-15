package Observer;

public class CurrentConditionDisplay implements Observer ,DisplayElement {
	
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject WeatherData;

	
	public CurrentConditionDisplay(Subject WeatherData){
		this.WeatherData= WeatherData;
		WeatherData.registerObserver(this);
	}
	

	@Override
	public void update(float temp, float humidity, float pressure) {
	
		this.temperature=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		display();
		
	}
	
	@Override
	public void display() {
		
		System.out.println("Current conditions of the weather "+temperature+" degrees "+humidity+" humidity "+pressure+" pressure in mg");
		
	}

}
