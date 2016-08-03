package com.day3;

public class Bowling {

	public static void main(String[] args) {
		
		
		
		
	}

	
	
}


//(for int frame = 1; i<10; i++)


public class WorkingWithRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int sidesOnADie = 6;
			int numberOfDice = 10;
			for(int i = 0; i <numberOfDice; i++) {
			
			int diceRoll = (int) ((Math.random()*sidesOnADie)+1);  //casting?
			System.out.println(diceRoll);				//Math is a CLASS calling random method	
			}
					
	
	}

}

