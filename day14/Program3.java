class Program3 {
	public static void pat1(int num) {
		for(int row=1; row<=num; row++){
	    	for(int col=1; col<=num; col++){
	    		if(col%2==1)
	    			System.out.print("1");
	    		else
	    			System.out.print("0");
	    	}
	    	System.out.println();
	    } 
	    System.out.println();
	}
	public static void pat2(int num) {
		for(int row=1; row<=num; row++){
	    	for(int col=1; col<=num; col++){
	    		if(row%2==1)
	    			System.out.print("1");
	    		else
	    			System.out.print("0");
	    	}
	    	System.out.println();
	    } 
	    System.out.println();
	}

    public static void main(String[] args) {
        pat1(3);
        pat2(3);
    }
}