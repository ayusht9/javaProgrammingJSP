class GetDiagonal {
	public static void primaryDiagonal(int num) {
		for(int row=1; row<=num; row++){
			for(int col=1; col<=num; col++){
				if(row==col)
					System.out.print("*");
				else
					System.out.print("-");
			}
			System.out.println();
		} 
	}
	public static void secondaryDiagonal(int num) {
		for(int row=1; row<=num; row++){
			for(int col=1; col<=num; col++){
				if(row+col==num+1)
					System.out.print("*");
				else
					System.out.print("-");
			}
			System.out.println();
		}
	}
    public static void main(String[] args) {
        primaryDiagonal(3);
        secondaryDiagonal(3);
    }
}