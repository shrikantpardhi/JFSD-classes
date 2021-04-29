package Inheritancetopic;

//class Demo {
//	int age = 24;
//
//	void display() {
//		System.out.println("in parent age " + age);
//	}
//}

public class OverloadingDemo {
	int age;
	String str ;

	void display() {
		try {
			System.out.println("in parent age " + str.length());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	void display(int age) {
		try {
			if (age % 0 == 1) {
				System.out.println("give exception");
			}
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("after exception");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo obj = new OverloadingDemo();
		obj.display();
		obj.display(30);
	}

}
