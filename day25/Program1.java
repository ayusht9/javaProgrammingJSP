class Program1 {
	public static void charAtEven(String s) {
        for (int i=0; i<s.length(); i++) {
        	if(i%2==0)
        		System.out.println(s.charAt(i));
        }  
	}

	public static void countCharType(String s1) {
		int countAlpha = 0;
		int countNumber = 0;
		int countSpecial = 0;

		for(int i=0; i<s1.length(); i++){
			char ch = s1.charAt(i);
			if(ch>='a' && ch<= 'z' || ch >='A' && ch<= 'Z')
				countAlpha++;
			else if(ch>='0' && ch<= '9')
				countNumber++;
			else
				countSpecial++;
		}

		System.out.println(countAlpha);
		System.out.println(countNumber);
		System.out.println(countSpecial);
	}

    public static void main(String[] args) {
    	// charAtEven("java");

    	countCharType("abcdefgh1234@#$%");
    }
}