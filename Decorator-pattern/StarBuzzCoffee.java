package Decorator;

public class StarBuzzCoffee {

	public static void main(String[] args) {
		
		Bevarages beverage= new Espresso();
			System.out.println(beverage.getDescription()+"$$ "+beverage.cost());

			Bevarages beverage1= new HouseBlend();
			beverage1= new Mocha(beverage1);
			beverage1= new Mocha(beverage1);
			beverage1= new Mocha(beverage1);
			beverage1= new Whip(beverage1);
			
			System.out.println(beverage1.getDescription()+"$$ "+beverage1.cost());
			
			
			
	}
}
