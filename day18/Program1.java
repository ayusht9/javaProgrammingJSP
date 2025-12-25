class Program1 {
	public static void butterfly(int num) {
		for(int row=1; row<=num*2-1; row++){
			for(int col=1; col<=num*2-1; col++){
				if(row>=col && row+col<=num*2 || row+col >=num*2 && row<=col)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void hbutterfly(int num) {
		for(int row=1; row<=num*2-1; row++){
			for(int col=1; col<=num*2-1; col++){
				if(row==col || row+col==num*2|| col==1 || col == num*2-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

    public static void main(String[] args) {
        // butterfly(3);
        hbutterfly(3);
    }
}