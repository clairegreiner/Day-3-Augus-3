package com.day3;

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
		int frameScore = 0;
		// random throws 1 and 2

		// for loops each frame

		// nest loop

		for (int i = 1; i <= 10; i++) { // frames
			System.out.println("Frame " + i);
			// roll 1 mathiness

			for (int r = 1; r <= 2; r++) {
				pinsStruck = (int) (Math.random() *1); // roll 1
				System.out.println("Roll 1" + pinsStruck);
				pinsSpare = (int) ((10 - pinsStruck) - (Math.random() * (10 - pinsStruck))); // roll
																								// 2
																								// math
																								// random
																								// of
																								// remaining
																								// pins
				System.out.println("Roll 2" + pinsSpare);

				frameScore = pinsStruck + pinsSpare;
				System.out.println("Frame score " + frameScore); // nest further
																	// to record
																	// both
																	// rolls/

				
			}

		}
	}
}

