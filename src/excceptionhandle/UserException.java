package excceptionhandle;

class MyException extends Exception {
	public String toString() {
		return ("this is my exception for uneligible voter");
	}
}

public class UserException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age  = 2;
		try {
			if (age<18)
				throw new MyException();
			// throw is used to create a new exception and throw it.
		} catch (MyException e) {
			System.out.println(e);
		}
		
		System.out.println("noromal flow");

	}

}
