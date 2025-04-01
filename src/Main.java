import creational.factoryMethod.Burger;
import creational.factoryMethod.BurgerFactory;
import creational.singleton.President;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		/* Singleton */
		System.out.println(President.getPresident("data"));
		
		/* Factory method*/
		//prepare cheeseburger.
		Burger burger1 = BurgerFactory.createBurger("cheese");
		burger1.prepare();
		
		//prepare veggieburger
		Burger burger2 = BurgerFactory.createBurger("veggie");
		burger2.prepare();
		
	}
}