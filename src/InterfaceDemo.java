
interface Abc{
	void print();
}

interface Bbc{
	void print();
}

class Mice implements Abc, Bbc{
	public void print() {
		System.out.println("class method");
	}
}
public class InterfaceDemo extends Mice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDemo obj =  new InterfaceDemo();
		obj.print();
		
		Abc n = new Mice();
		
	}

}
