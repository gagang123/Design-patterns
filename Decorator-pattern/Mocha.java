package Decorator;

public class Mocha extends CondimentsDecorator {

	Bevarages bevarage;
	
	public Mocha(Bevarages bevarage){
		this.bevarage=bevarage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return bevarage.getDescription()+" Mocha";
	}
	
	@Override
	public double cost() {
		
		return .20+ bevarage.cost();
	}

	
	

}
