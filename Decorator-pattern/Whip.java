package Decorator;

public class Whip extends CondimentsDecorator {

	Bevarages beverage;
	
	public Whip(Bevarages beverage){
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+" Whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .10+ beverage.cost();
	}
	
	
	
}
