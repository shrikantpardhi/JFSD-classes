package excceptionhandle;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				System.out.println(25 / 0);
				System.out.println("after");
			} catch (ArithmeticException e) {
				// TODO: handle exception
			}
			System.out.println("after");
		} catch (NullPointerException e) {
			// TODO: handle exception

		} finally {
			System.out.println("finnaly block");
		}

		System.out.println("after getting exception");
	}

}
