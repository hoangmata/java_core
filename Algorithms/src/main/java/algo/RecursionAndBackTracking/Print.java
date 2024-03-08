package algo.RecursionAndBackTracking;


public class Print {
	public int _Print(int n) {
		if(n == 0) {
			return 0;
		}else {
			System.out.println(n);
			_Print(n - 1);
		}
		return n;
	}
	public static void main(String[] args) {
		Print print = new Print();
		print._Print(10);
	}
}
