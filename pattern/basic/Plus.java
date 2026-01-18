class Plus {
	public static void getPlus(int n) {
	    for(int row=1; row<=n; row++){
	    	for(int col=1; col<=n; col++){
	    		if(row==n/2+1 || col==n/2+1)
		    			System.out.print("*");
	    		else
	    			System.out.print(" ");
	    	}
	    	System.out.println();
	    } 
	}

	public static void getPlusHash(int n, char ch) {
	    for(int row=1; row<=n; row++){
	    	for(int col=1; col<=n; col++){
    			if(row==n/2+1 && col==n/2+1)
    				System.out.print(ch);
	    		else if(row==n/2+1 || col==n/2+1)
		    			System.out.print("*");
	    		else
	    			System.out.print(" ");
	    	}
	    	System.out.println();
	    } 
	}

    public static void main(String[] args) {
        getPlus(3);
        getPlusHash(3,'#');
    }
}