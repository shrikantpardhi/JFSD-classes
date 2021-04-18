package excceptionhandle;

public class ThrowsEx {

	static void cal() throws ArithmeticException, NullPointerException {
		int x = 25;

		if (x / 0 == 1) {
//			throw new ArithmeticException("Odd is not allowd");
//			System.out.println("haha");
		}

	
		System.out.println("hahaahhahah");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			cal();
		} catch (ArithmeticException e) {
			// TODO: handle exception
		}

		System.out.println("gahahhahah");

	}

}
