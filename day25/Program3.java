class Program3 {
	public static void countAlphaType(String s) {
		s = s.toLowerCase();
		int vowel = 0;
		int consonant = 0;
		String vowels = "";
		String consonants = "";

		String res = "";

		for(int i=0; i<s.length(); i++){		
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
				res+=ch;
		}

		for(int i=0; i<res.length(); i++){		
			char ch = res.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
				vowel++;
				vowels+=ch;
			}
			else{
				consonant++;
				consonants+=ch;
			}
		}

		System.out.println("vowels: "+vowel);
		System.out.println("consonant: "+consonant);
		System.out.println("vowels are: "+vowels);
		System.out.println("consonant are: "+consonants);


	}

	public static boolean isVowel(char ch) {
		return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
	}
	
    public static void main(String[] args) {
    	countAlphaType("abcde");
    	System.out.println(isVowel('a'));
    }
}