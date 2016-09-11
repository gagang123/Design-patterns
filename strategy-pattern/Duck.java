package strategy;

public abstract class Duck {
	FlyBehavior flybehavior;
	QuackBehavior quackbehavior;

	public Duck(){
		
	}
	
	public abstract void display();
	
	public void performfly(){
		flybehavior.fly();
		
	}
	
	public void performQuack(){
		quackbehavior.quack();
		
	}
	
	public void swim(){
		
		System.out.println("All ducks float");
	}
	
	public void setFlyBehavior(FlyBehavior fb){
		flybehavior= fb;
		
	}
	
	public void setQuackBehavior(QuackBehavior qb){
		quackbehavior= qb;
		
	}
}
