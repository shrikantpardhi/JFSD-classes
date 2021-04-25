package excceptionhandle;

class ThrowDemo {
	static void demoproc() {
		try {
			System.out.println(25 / 0);
//			throw new ArithmeticException("demo");
		} catch (ArithmeticException e) {
			System.out.println("Caught inside demoproc.");
			throw e; // rethrow the exception
		}
	}

	static void validate(int age)  {
		if (age < 18)
			throw new ArithmeticException("not eligible for voting");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {

		 try{
			 validate(17);
		 }catch (ArithmeticException e) {
			// TODO: handle exception
			 System.out.println(e.getMessage());
		}
		 
		 System.out.println("Demo");
	}
}
