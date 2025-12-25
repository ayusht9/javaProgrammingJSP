class Program1 {
	public static void print(int a) {
		if(a<=0)
			return;
		else{
			System.out.println("java is easy");
			print(a-1);
		}
	}

	public static void print10(int i) {
		if(i>10)
			return;
		else
			System.out.print(i+" ");
			print10(i+1);
	}

	public static void printEven10(int i) {
		if(i>10)
			return;
		else
			System.out.print((i%2==0?i:"")+" ");
		printEven10(i+1);

	}
    public static void main(String[] args) {
        // print(5);
        // print10(1);
        printEven10(1);
    }
}