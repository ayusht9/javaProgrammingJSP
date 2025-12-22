class Program4 {
	public static void pascal1(int num) {
	    for(int row=1; row<=num*2-1; row++){
	    	for(int col=1; col<=num; col++){
	    		if(row<=col || row+col>=num*2)
	    			System.out.print("*");
	    		else
	    			System.out.print("-");
	    	}
	    	System.out.println();
	    }
	    System.out.println();

	}

	public static void pascal2(int num) {
	    for(int row=1; row<=num*2-1; row++){
	    	for(int col=1; col<=num; col++){
	    		if(col==1 || row+col==num*2 || row==col)
	    			System.out.print("*");
	    		else
	    			System.out.print("-");
	    	}
	    	System.out.println();
	    }

	}

    public static void main(String[] args) {
        pascal1(5);
        // pascal2(5);
    }
}