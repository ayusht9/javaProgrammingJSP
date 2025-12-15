class Program4 {
	public static void pat1(int num) {
	    for(int row=1; row<=num; row++){
	    	char ch = 'A';
	    	for(int col=1; col<=num; col++){
    			System.out.print(ch++);
	    	}
	    	System.out.println();
	    } 
	}
    public static void main(String[] args) {
    	pat1(3);
    }
}