package strategy;

public class MallardDuck extends Duck {

	public MallardDuck(){
		
		quackbehavior= new Quack();
		flybehavior= new FlyWithwings();
		
	}
	
	public void display(){
		System.out.println(" i am mallard duck");
	}

	
}
