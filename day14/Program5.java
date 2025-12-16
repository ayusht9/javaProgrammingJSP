class Program5 {
	public static void rightHalfUpper(int num) {
		for(int row = 1; row <= num; row++){
			for(int col = 1; col <= num; col++){
				if(row>=col)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	    
	}
	public static void RUTriangle(int num) {
		for(int row = 1; row <= num; row++){
			for(int col = 1; col <= row; col++){
					System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void hallowTriangle(int num) {
		for(int row = 1; row <= num; row++){
			for(int col = 1; col <= num; col++){
				if(row == num || col == 1 || row==col)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
    public static void main(String[] args) {
        rightHalfUpper(5);
        hallowTriangle(5);
        RUTriangle(5);
    }
}