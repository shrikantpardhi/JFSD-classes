package regexp;

import java.util.regex.*;

public class Regexdemo1 {

	private static final String REGEX = "\\bcat\\b";
	private static final String INPUT = "cat cat cat cat tie cat";

	public static void main(String[] args) {
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT); // get a matcher object
		int count = 0;

		while (m.find()) {
			count++;
			System.out.println("Match number " + count);
			System.out.println("start(): " + m.start());
			System.out.println("end(): " + m.end());
		}

//		// String to be scanned to find the pattern.
//		String line = "12455";
//
//		String pattern = "^[1-4]*[5]{2}";
//
//		// Create a Pattern object
//		Pattern r = Pattern.compile(pattern);
//
//		// Now create matcher object.
//		boolean m = Pattern.matches(pattern, line);
//		if (m) {
//			System.out.println("true");
//		} else {
//			System.out.println("NO MATCH");
//		}

	}
}
