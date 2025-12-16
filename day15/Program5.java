interface NumberPattern{
	void run(int num);
}

class Program5 {
    public static void main(String[] args) {
        NumberPattern np1 = (num) -> {
			for(int row = 1; row <= num; row++){
				int i=1;
				for(int col = 1; col <= num; col++){
					if(row+col>=num+1)
						System.out.print(i++);
					else
						System.out.print(" ");
				}
				System.out.println();
			}
			System.out.println();
        };
        NumberPattern np2 = (num) -> {
			int i=1;
			for(int row = 1; row <= num; row++){
				for(int col = 1; col <= num; col++){
					if(row+col>=num+1)
						System.out.print(i++);
					else
						System.out.print(" ");
				}
				System.out.println();
			}
			System.out.println();
        };

        np1.run(3);
        np2.run(3);

    }
}