package edu.fa;

public class Switch {

	public static void main(String[] args) {
		int day = 2;
		switch(day){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thurs");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;
		default:
			System.out.println("Sunday");
			break;
		}
	}

}
