import java.util.Scanner;

class Program4 {
	public static int linearSearch(int[] arr, int search) {
		boolean res = false;
		for(int i: arr)
			if(i==search){
				res = true;
				break;			
			}
		return res;
	}

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] arr = {10,20,30,40,50};
    	System.out.print("Enter search: ");
    	int search = sc.nextInt();
    	System.out.println(linearSearch(arr,search));
    }
}