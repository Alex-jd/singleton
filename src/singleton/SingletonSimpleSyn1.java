package singleton;

public class SingletonSimpleSyn1 {
	private static SingletonSimpleSyn1 uniqueInstance;
	
	private SingletonSimpleSyn1() {
	}

	public static synchronized SingletonSimpleSyn1 getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonSimpleSyn1();
		}
		
		return uniqueInstance;
	}
	
	public void getInfo() {
		System.out.println("Yes, I'm a SingletonSimpleSyn1");
	}
}
