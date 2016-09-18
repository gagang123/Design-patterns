package Decorator;

public class Espresso extends Bevarages{
	public Espresso(){
	 description="Espresso";
	}

	@Override
	public double cost() {
		
		return 1.99;
	}

}
