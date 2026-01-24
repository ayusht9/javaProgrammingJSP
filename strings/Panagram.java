class Panagram {
	public static boolean isPanagram(String s) {
		for (char ch='a'; ch<='z'; ch++) {
			if(s.indexOf(ch)== -1){
				return false;
			}
		}
		return true;
	    
	}
    public static void main(String[] args) {
    	String str = "The quick brown fox jumps over the lazy dog.";
    	System.out.println(isPanagram(str));        
    }
}