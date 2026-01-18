class LetterPattern {
	public static void pat1(int num) {
    	char ch = 'A';
		for(int row=1; row<=num; row++){
	    	for(int col=1; col<=num; col++){
    			System.out.print(ch++ + " ");
	    	}
	    	System.out.println();
	    } 
	}
	public static void pat2(int num) {
    	char ch = 'Z';
		for(int row=1; row<=num; row++){
	    	for(int col=1; col<=num; col++){
    			System.out.print(ch-- + " ");
	    	}
	    	System.out.println();
	    } 
	}
	public static void pat3(int num) {
    	char ch = 'P';
		for(int row=1; row<=num; row++){
	    	for(int col=1; col<=num; col++){
    			System.out.print(ch++ + " ");
	    	}
	    	System.out.println();
	    } 
	}
	

    public static void main(String[] args) {
        pat1(3);
        pat2(3);
        pat3(3);
    }
}