package test;

import singleton.SingletonDoubleCheckedLocking3;
import singleton.SingletonSimpleSyn1;
import singleton.SingletoneCreateNew2;

public class SingletonTest {
	
	public static void main(String[] args) {
		SingletonSimpleSyn1  singleton = SingletonSimpleSyn1.getInstance();
		singleton.getInfo();
		
		SingletoneCreateNew2 singleton2 = SingletoneCreateNew2.getInstance();
		singleton2.getInfo();
		
		SingletonDoubleCheckedLocking3 singleton3 = SingletonDoubleCheckedLocking3.getInstance();
		singleton3.getInfo();
	}

}
