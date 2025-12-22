class Program1 {
	public static void pascal1(int num) {
	    for(int row=1; row<=num; row++){
	    	for(int col=1; col<=num; col++){
	    		if(row>=col)
	    			System.out.print("*");
	    		else
	    			System.out.print("-");
	    	}

			for(int col=num; col>=1; col--){
				if(row>=col)
	    			System.out.print("*");
	    		else
	    			System.out.print("-");
	    	}

	    	System.out.println();
	    }

	}
    public static void main(String[] args) {
        pascal1(3);
    }
}