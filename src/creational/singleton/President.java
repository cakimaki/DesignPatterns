package creational.singleton;

public class President {
	private static volatile President president;
	private String name;
	
	private President(String name){
		this.name = name;
	}
	
	public static President getPresident(String name){
		President result = president;
		if(result == null){
			synchronized (President.class){
				result = president;
				if(result == null){
					president = result = new President(name);
				}
			}
		}
		return result;
	}
}
