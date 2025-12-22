class Program5 {
	public static void pat1(int num) {
		for(int row=1; row<=num*2-1; row++){
			for(int col=1; col<=num; col++){
				if(row+col>=num+1 && row-col<=num-1)
					System.out.print("*");
				else 
					System.out.print("-");
			}
			System.out.println();
		}
		System.out.println();
	    
	}

	public static void pat2(int num) {
		for(int row=1; row<=num*2-1; row++){
			for(int col=1; col<=num; col++){
				if(row+col<=num+1 || row-col>=num-1)
					System.out.print("*");
				else 
					System.out.print("-");
			}
			System.out.println();
		}
		System.out.println();
	    
	}

	public static void pat3(int num) {
		for(int row=1; row<=num*2-1; row++){
			for(int col=1; col<=num; col++){
				if(col==num || row+col==num+1 || row-col==num-1)
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
        pat3(3);
    }
}