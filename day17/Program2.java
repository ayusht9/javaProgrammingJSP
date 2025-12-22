class Program2 {
	public static void pascal1(int num) {
	    for(int row=1; row<=num; row++){
	    	for(int col=1; col<=num; col++){
	    		if(row>=col)
	    			System.out.print("*");
	    		else
	    			System.out.print("-");
	    	}
	    	System.out.println();
	    }
	    for(int row=num-1; row>=1; row--){
	    	for(int col=1; col<=num; col++){
	    		if(row>=col)
	    			System.out.print("*");
	    		else
	    			System.out.print("-");
	    	}
	    	System.out.println();
	    }


	}
    public static void main(String[] args) {
        pascal1(5);
    }
}