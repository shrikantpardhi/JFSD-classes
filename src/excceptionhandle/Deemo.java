package excceptionhandle;

public class Deemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 0;
		String str = "";
		int l = str.length();
		try {
			try {
				System.out.println(25 / d);
				//
			} catch (ArithmeticException ae) {
				System.out.println("Exception occured");
			}
			System.out.println(str.charAt(2));
		} catch (StringIndexOutOfBoundsException ae) {
			System.out.println("Exception String occured");
		} finally {
			System.out.println("finally");
		}

	}

}
