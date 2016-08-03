package com.day3;

public class TwelveDays {

	public static void main(String[] args) {
		for (int i = 1; i <= 110; i++) {
			switch (i) {
			case 1:
				System.out.println("It's a one");
				break;
			case 2:
				System.out.println("It's a two");
				break;
			default:
				System.out.println("It's some other number");
				break;
			}
		}

	}

}

//switch statements need a break to tell the statement to finish/move on