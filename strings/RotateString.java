class RotateString{
	public static String rotateLeft(String s, int n) {
	    if (s.length() == 0) return s;

	    n = n % s.length();
	    return s.substring(n) + s.substring(0, n);
	}

	public static String rotateRight(String s, int n) {
	    if (s.length() == 0) return s;
	    n = n % s.length();
	    return s.substring(s.length() - n) + s.substring(0, s.length() - n);
	}

	public static void main(String[] args) {
		System.out.println(rotateLeft("abcde",2));
		System.out.println(rotateRight("abcde",2));
	}


}