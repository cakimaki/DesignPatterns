package creational.factoryMethod;

public class BurgerFactory {
	public static Burger createBurger(String type){
		if(type.equals("cheese")){
			return new CheeseBurger();
		}else if(type.equals("veggie")){
			return new VeggieBurger();
		}else{
			throw new IllegalArgumentException("Unknown burger type: " + type);
		}
	}
}
