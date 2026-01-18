import java.util.Arrays;

class BinarySearch {
	public static boolean binarySearch(int[] a, int ele) {
		Arrays.sort(a);
		int st = 0, end = a.length - 1;
		while (st <= end) {
			int mid = (st + end) / 2;
			if (ele == a[mid])
				return true;
			else if (ele > a[mid])
				st = mid + 1;
			else
				end = mid - 1;
		}
		return false;
	}

	public static void main(String[] args) {
		int a[] = { 5, 7, 10, 12, 18, 29, 44 };
		System.out.println(binarySearch(a, 29));
	}
}