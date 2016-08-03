package com.day3;

public class FizzBuzz {

	public static void main(String[] args) {

		// FizzBuzzBang

		// test if 3 is cleanly divisible- 	fizz
		// test if 5 is clearly divisible	buzz
		// test if 7 is cleanly divisible	bang
		
		for (int i = 0; i<= 110; i++){
			if (((i % 3) == 0) && ((i%5) == 0) && ((i%7) == 0)) {
				System.out.println("FizzBuzzBang");
				
			} else if (((i % 3) == 0) && ((i%5) == 0)){
				System.out.println("FizzBuzz");
			}
			
			else if (((i % 5) == 0) && ((i%7) == 0)) {
				System.out.println("BuzzBang");
			}
			else if (((i % 3) == 0) && ((i%7) == 0)) {
				System.out.println("FizzBang");
			}
			else if ((i % 3) == 0) )) {
			System.out.println(i);
			}
			
		}
			
		}
		
	

		
	 
	//The most precise argument should go first or else the statement won't go beyond the broad one



}

