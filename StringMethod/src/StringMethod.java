
public class StringMethod {
	static String addString(String s1, int index, String s2) {
		return s1.substring(0, index + 1) + s2 + s1.substring(index + 1);
	}
	
	static String reverse(String s) {
		String result = "";
		for(int i = s.length() - 1; i >= 0; i --) {
			result += s.charAt(i);
		}
		return result;
	}
	
	static String removeString(String s1, String s2) {
		String[] parts = s1.split(s2);
		String result = "";
		
		for(int i = 0; i < parts.length; i ++) {
			result += parts[i];
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(addString("0123456", 3, "-"));
	System.out.println(reverse("abc"));
	System.out.println(removeString("01001000", "00"));
	
	}

}
