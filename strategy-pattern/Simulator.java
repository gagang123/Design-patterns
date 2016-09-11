package strategy;

public class Simulator {

	public static void main(String[] args) {
		Duck mallard= new MallardDuck();
	
		mallard.performQuack();
		mallard.performfly();
		
		//Now at run time set the new Flying behavior of Duck
		
		mallard.setFlyBehavior(new FlyNOway ());

		mallard.performfly();
		
	}

}
