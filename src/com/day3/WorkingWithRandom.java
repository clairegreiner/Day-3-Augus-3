package com.day3;

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


public class Bowling2 {

	public static void main(String[] args) {
		
		int pins = 10;
		int frame = 10;
		int throwsPerFrame = 2;
		int pinsStruck = 0;
		int pinsSpare = 0;
		int noSpare = 0;
		int pinsRemaining = 0;
		int score = 0;
		int pinsLeft = 0;
		//random throws 1 and 2
		
	//for loops  each frame
		
		//nest loop

	 
		for (int i = 1; i <= 10; i++) {  //frames
			System.out.println("Frame " + i);
			//roll 1 mathiness
			pinsStruck = (int) (Math.random()*11);
			pinsSpare = (int) (10-pinsStruck);
			
		
		}
			for (int r = 1; r<=2; r++){
				
				noSpare = (int) (Math.random()*pinsSpare+1); //knock down the rest if any
				pinsRemaining = pins - pinsStruck;
				score = 
				System.out.println("Roll 2"  );				//nest further to record both rolls/
				
				
				//roll 2 mathiness?
				//sysout
			}
	}
}
