package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {

	String str = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";

	final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile(str, Pattern.CASE_INSENSITIVE);

	boolean validate(String emailStr) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		return matcher.find();
	}

	void forSplit() {
		String text = "shri1shri2shri";

		// Specifies the string pattern which is to be searched
		String delimiter = "\\d";
		Pattern pattern = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);

		// Used to perform case insensitive search of the string
		String[] result = pattern.split(text);

		for (String temp : result)
			System.out.println(temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "^((\\+|00)(\\d{1,3})[\\s-]?)?(\\d{10})$";
		String str2 = "+123-9854875847";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str2);
		if (m.matches()) {
			System.out.println("Country = " + m.group(3));
			System.out.println("Data = " + m.group(4));
		}

	}

}

/*
Important Observations/Facts:

We create a pattern object by calling Pattern.compile(), there is no constructor. compile() is a static method in Pattern class.
Like above, we create a Matcher object using matcher() on objects of Pattern class.
Pattern.matches() is also a static method that is used to check if given text as a whole matches pattern or not.
find() is used to find multiple occurrences of pattern in text.
We can split a text based on a delimiter pattern
using split()*/
