class Program5 {
	public static void rightHalfUpper(int num) {
		for(int row = 1; row <= num; row++){
			for(int col = 1; col <= row; col++){
				if(row+col>=0)
					System.out.print("*");
				else
					System.out.print("-");
			}
			System.out.println();
		}
	    
	}
    public static void main(String[] args) {
        rightHalfUpper(5);
    }
}