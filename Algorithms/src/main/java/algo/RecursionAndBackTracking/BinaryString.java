package algo.RecursionAndBackTracking;

import java.util.Arrays;

public class BinaryString {

	public static void main(String[] args) {
		int n = 4;
		int arr[] = new int[n];
		System.out.println("Binary string");
		Binary(n, arr);
		System.out.println("\nKstring");
		k_string(n, 3, arr);
	}
//	tao tat ca cach chuoi n bit . Gia su A[0...n-1] la mot mang co kich thuoc n.
	public static void Binary(int n, int arr[]) {
		if( n < 1 ) {
			System.out.println(Arrays.toString(arr));
		}else {
			arr[n - 1] = 0;
			Binary(n-1, arr);
			arr[n-1] = 1;
			Binary(n-1, arr);
		}
	}
//	tao tat ca cac chuoi co do dai n voi cac gia tri tung phan tu tu 0...k-1 ( k < n)
	public static void k_string(int n, int k, int arr[]) {
		if(n < 1) {
			System.out.println(Arrays.toString(arr));
		}else {
			for (int i = 0; i < k; i++) {
				arr[n - 1] = i;
				k_string(n-1, k, arr);
			}
		}
	}
}
