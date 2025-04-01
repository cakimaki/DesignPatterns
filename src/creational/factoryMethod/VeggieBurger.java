package creational.factoryMethod;

public class VeggieBurger implements Burger{
	@Override
	public void prepare(){
		System.out.println("Prepping veggie burger");
	}
}
