abstract class Demo{
	
	Demo (){}
	Demo (String name){}
	
	abstract void display();
	
	void displaynon() {
		System.out.println("non abtract method");
	}
	
}


public class AbstractClassDemo extends Demo {
	
	AbstractClassDemo(){
		super();
	}
	void display() {
		System.out.println("abtract method");
	}

	public static void main(String[] args) {
		
		AbstractClassDemo obj =  new AbstractClassDemo();
		
		obj.display();
		obj.displaynon();
	}

}
