class XZPattern {
	public static  void xPattern(int num){
	    for(int row=1; row<=num; row++){
	    	for(int col=1; col<=num; col++){
	    		if(row==col || row+col==num+1)
		    			System.out.print("*");
	    		else
	    			System.out.print("-");
	    	}
	    	System.out.println();
	    } 
	}
	public static void zPattern(int num) {
	    for(int row=1; row<=num; row++){
	    	for(int col=1; col<=num; col++){
	    		if(row==1 || row==num || row==col)
		    			System.out.print("*");
	    		else
	    			System.out.print("-");
	    	}
	    	System.out.println();
	    } 
	    
	}
    public static void main(String[] args) {
        xPattern(3);
        zPattern(3);
    }
}