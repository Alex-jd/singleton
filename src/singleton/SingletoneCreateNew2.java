package singleton;

public class SingletoneCreateNew2 {
	
private static SingletoneCreateNew2 uniqueInstance = new SingletoneCreateNew2();
	
	private SingletoneCreateNew2() {
	}

	public static SingletoneCreateNew2 getInstance() {
		return uniqueInstance;
	}
	
	public void getInfo() {
		System.out.println("Yes, I'm singletoneCreateNew2");
	}

}
