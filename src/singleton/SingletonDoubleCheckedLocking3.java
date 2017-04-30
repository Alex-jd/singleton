package singleton;

public class SingletonDoubleCheckedLocking3 {
	
	private volatile static SingletonDoubleCheckedLocking3 uniqueInstance;
	
	private SingletonDoubleCheckedLocking3() {
	}

	public static synchronized SingletonDoubleCheckedLocking3 getInstance() {
		if (uniqueInstance == null) {
			synchronized (SingletonDoubleCheckedLocking3.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new SingletonDoubleCheckedLocking3();
				}
			}
		}
		
		return uniqueInstance;
	}
	
	public void getInfo() {
		System.out.println("Yes, I'm a SingletonDoubleCheckedLocking3");
	}

}
