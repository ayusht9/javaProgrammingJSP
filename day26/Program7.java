class Program7 {
	public static void isPanagram(String s) {
		for (char ch='a'; ch<='z'; ch++) {
			if(s.indexOf(ch)== -1){
				System.out.println("not a panagram");
				return;
			}
		}
		System.out.println("is a panagram");
	    
	}
    public static void main(String[] args) {
    	String str = "The quick brown fox jumps over the lazy dog.";
    	isPanagram(str);
        
    }
}