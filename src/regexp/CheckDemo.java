package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckDemo {

	static boolean validateEmail(String email) {
		String str = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern p = Pattern.compile(str, Pattern.CASE_INSENSITIVE);
		Matcher matcher = p.matcher(email);
		return matcher.find();
	}

	static boolean valideNumber(String num) {
		String str = "^((\\+[0-9]{1,3}[\\-])?[0]?[1-9][0-9]{9})$";
//		String str = "^\\d{10}$";
		Pattern p = Pattern.compile(str);
		Matcher matcher = p.matcher(num);
		return matcher.find();
	}

	static void forSplit() {
		String text = "shri1shri2shri";
		String delimiter = "\\d";
		Pattern pattern = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);
		String[] result = pattern.split(text);
		for (String temp : result)
			System.out.println(temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validateEmail("bc@gmail.com"));
		System.out.println(valideNumber("3854875847"));
		
		forSplit();
	}

}
