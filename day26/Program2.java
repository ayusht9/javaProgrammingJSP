class Program2 {
	public static boolean isPallindrome(String s1) {
		char[] c1 = s1.toCharArray();
		
		int st=0, end=c1.length-1;

		while(st<=end){
			if(c1[st++] != c1[end--])
				return false;
		}
		return true;    
	}
    public static void main(String[] args) {
        System.out.println(isPallindrome("racecar"));
        System.out.println(isPallindrome("malayalam"));
        System.out.println(isPallindrome("madame"));
    }
}