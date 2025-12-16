class Program4 {
	public static void pat1(int num) {
		char ch='A';
		for(int row=1; row<=num; row++){
	    	for(int col=1; col<=num; col++){
    			if(row==col){
	    			System.out.print(ch);
	    			continue;
    			}
    			System.out.print(col);
	    	}
    		ch++;
	    	System.out.println();
	    } 
	    System.out.println();
	}
    public static void main(String[] args) {
        pat1(3);
    }
}