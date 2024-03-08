package algo.RecursionAndBackTracking;

public class TowersOfHanoi {
	public void towers_of_hanoi(int n, String fromPeg, String topeg, String auxeg) {
//		Neu co mot dia thuc hien di chuyen va return
		if(n == 1) {
			System.out.println("Di chuyen disk 1 tu coc " + fromPeg + " toi coc: " + topeg);
			return;
		}
//		Di chuyen n - 1 dia dau tu coc A sang B, su dung C la phu tro
		towers_of_hanoi(n - 1, fromPeg, auxeg, topeg);
//		di chuyen dia con lai tu coc A --->>> C
		System.out.println("Di chuyen disk tu coc " + fromPeg + " toi coc: " + topeg);
//		Di chuyen n - 1 dia tu B --> C voi A la phu tro
		towers_of_hanoi(n - 1, auxeg, topeg, fromPeg);
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		TowersOfHanoi a = new TowersOfHanoi();
		a.towers_of_hanoi(3, "a", "b", "c");
	}
}
