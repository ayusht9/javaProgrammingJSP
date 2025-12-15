class Program3 {
	public static void pat1(int num) {
	    for(int row=1; row<=num; row++){
	    	for(int col=1; col<=num; col++){
	    		if(col==1 || row==1 || row==col)
		    			System.out.print("*");
	    		else
	    			System.out.print("-");
	    	}
	    	System.out.println();
	    } 
	}
	public static void pat2(int num) {
	    for(int row=1; row<=num; row++){
	    	for(int col=1; col<=num; col++){
	    		if(true)
		    			System.out.print("*");
	    		else
	    			System.out.print("-");
	    	}
	    	System.out.println();
	    } 
	}
    public static void main(String[] args) {
        pat1(3);
        pat2(3);
    }
}