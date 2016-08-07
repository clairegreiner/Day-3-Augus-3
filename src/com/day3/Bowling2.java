package com.day3;

public class Bowling2 {

	public static void main(String[] args) {

		int initialPins = 10;
		int numFrames = 10;
		int throwsPerFrame = 2;
		int runningScore = 0;
		

		// random throws 1 and 2

		// for loops each frame

		// nest loop

		for (int i = 0; i < numFrames; i++) { // frames
			int pinsStruck = 0;
			int pinsSpare = 0;
			int noSpare = 0;
			int pinsRemaining = 0;
			int pinsLeft = 0;
			int frameScore = 0;
			
			System.out.println("Frame #" + (i+1));
			// roll 1 mathiness

			pinsStruck = (int) (Math.random() *11); // roll 1
			System.out.println("Roll 1: " + pinsStruck);
			pinsSpare = (int) ((10 - pinsStruck) - (Math.random() * (11 - pinsStruck))); 
														//does this make sense?
			
																										// roll
																							// 2
																							// math
																							// random
																							// of
																							// remaining
																							// pins
			System.out.println("Roll 2: " + pinsSpare);
			
			frameScore = pinsStruck + pinsSpare;
			runningScore = runningScore + frameScore;
			System.out.println("Frame score " + frameScore); // nest further
																// to record
																// both
			System.out.println("Running score is " + runningScore );											// rolls/
				
				

		}
	}
}

