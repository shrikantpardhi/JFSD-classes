package excceptionhandle;

import java.io.IOException;

public class MyChainedEx {
	public static void main(String[] args) throws Throwable {
		int x ;
		try {
			throw new MyException()
			.initCause(new IOException("IO cause."));
		} catch (MyException ae) {
			System.out.println("Caught : " + ae);
			System.out.println("Actual cause: " + ae.getCause());
		}
	}
}
