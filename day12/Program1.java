class Program1{
	public static void getRow(int n, int nrow) {
		for(int row=1; row<=n; row++){
			for(int col=1; col<=n; col++){
				if(row==nrow)
					System.out.print("*");
				else
					System.out.print("-");
			}
			System.out.println();
		}
		System.out.println();  
	}

	public static void getColumn(int n, int ncol) {
		for(int row=1; row<=n; row++){
			for(int col=1; col<=n; col++){
				if(col==ncol)
					System.out.print("*");
				else
					System.out.print("-");
			}
			System.out.println();
		}
		System.out.println();  
	}



    public static void main(String[] args) {
        getRow(3,1);
        getRow(3,2);
        getRow(3,3);

        getColumn(3,1);
        getColumn(3,2);
        getColumn(3,3);
    }
}