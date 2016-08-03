package com.day3;

public class TwelveDaysofXmas {

	public static void main(String[] args) {
		for (int day = 1; day < 13; day++) {
			System.out.print("On the " + day);

			switch (day) { // switch has to be in the for loop
			case 1:
				System.out.print("st");
				break;
			case 2:
				System.out.print("nd");
				break;
			case 3:
				System.out.print("rd");
				break;

			default:
				System.out.print("th");
				break;
			}

			System.out.println(" day of Christmas ");
			System.out.println("my true love gave to me ");
			
			switch (day) {

			case 12:
				System.out.print("\tdrummers drumming ");
				break;
			case 11:
				System.out.print("\tpipers piping ");
				break;

			case 10:
				System.out.print("\tlord a-leaping ");
				break;
			case 9:
				System.out.print("\tlord a-leaping ");
				break;
			case 8:
				System.out.print("\tmaids a-milking ");
				break;
			case 7:
				System.out.print("\tseven swans a-swimming ");
				break;
			case 6:
				System.out.print("\t6 geese-a-laying ");
				break;
			case 5:
				System.out.print("\tFIVE GOLDEN RINGS! ");
				break;
			case 4:
				System.out.print("\tcalling birds ");
				break;
			case 3:
				System.out.print("\tthree French hens ");
				break;
			case 2:
				System.out.print("\ttwo turtle doves ");
				break;
			case 1:
				System.out.print("\ta partridge in a pear tree ");
				break;

			}
			// default is the
															// "th" suffix
		}
	}

	/*
	 * Sysout for loop switch
	 * 
	 * For-loop can print the day as a number. So "on the 1 day of" switch on
	 * the "st" or "th" on the days
	 * 
	 */

}
