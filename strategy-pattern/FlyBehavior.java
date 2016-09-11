package strategy;

public interface FlyBehavior {
	public void fly();
		
}

class FlyWithwings implements FlyBehavior{

	@Override
	public void fly() {
		
		System.out.println("I am flying");
	}
	
	
}

class FlyNOway implements FlyBehavior{

	@Override
	public void fly() {
		
		System.out.println("I can't fly");
	}
	
	
}
