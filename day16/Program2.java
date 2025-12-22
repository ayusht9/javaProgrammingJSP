class Program2 {
	public static void mirror1(int num) {
		for (int row=1; row<=num; row++) {
			for (int col=1; col<=num*2-1; col++) {
				if(row+col>=num+1 && col-row <= num-1)
					System.out.print("*");
				else
					System.out.print("-");
			}
			System.out.println();
		}
	    
	}

	public static void mirror2(int num) {
		for (int row=1; row<=num; row++) {
			for (int col=1; col<=num*2-1; col++) {
				if(row+col<=num+1 || col-row >= num-1)
					System.out.print("*");
				else
					System.out.print("-");
			}
			System.out.println();
		}
	    
	}


    public static void main(String[] args) {
        mirror1(5);
        System.out.println();
        mirror2(5);
    }
}