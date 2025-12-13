class Program2 {
	public static void hollowBox(int n) {
	    for(int row=1; row<=n; row++){
	    	for(int col=1; col<=n; col++){
	    		if(row==1 || row==n || col==1 || col==n)
	    			System.out.print("*");
	    		else
	    			System.out.print(" ");
	    	}
	    	System.out.println();
	    }
	}

	public static void makeHollow(int n, int x, int y) {
	    for(int row=1; row<=n; row++){
	    	for(int col=1; col<=n; col++){
	    		if(row==x && col==y)
	    			System.out.print(" ");
	    		else
	    			System.out.print("*");
	    	}
	    	System.out.println();
	    }
	}

    public static void main(String[] args) {
    	int num = 3;
    	int x = num/2+1;
    	int y = num/2+1;
    	makeHollow(num,x,y);

    	hollowBox(3);
        
    }

}