// count alphabets, numbers, special characters

class CountCharType {
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

		System.out.println("Alphabets: "+countAlpha);
		System.out.println("Numbers: "+countNumber);
		System.out.println("Special: "+countSpecial);
	}

    public static void main(String[] args) {
    	countCharType("abcdefgh1234@#$%");
    }
}