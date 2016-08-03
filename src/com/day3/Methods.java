package com.day3;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean doWeHaveAllTheNotebooks = true;			//set true as the  default
		doWeHaveAllTheNotebooks = false;  //went to count the books and found one missing. Ergo, false.
		String whatHappened = notebook(doWeHaveAllTheNotebooks);  // Method. Notebook told "let me give this to you" method call down to method outside scope below
		//Ask the students
		System.out.println(whatHappened);												//"blame the students" gets passed to 
		System.out.println(doWeHaveAllTheNotebooks);	
	
		String doThisNext = whatHappened + " Do you know where the notebook is?";
			System.out.println(doThisNext);
	}
	//
	
	
	
	public static String notebook(boolean isLost){			//New method grabs data notebook from above is grabbed here. Needed to be in another method
		
		String whatToDoNow = null; //this answer comes from the bottom of the block.
		
		if (isLost) { whatToDoNow = "Ask the students.";  //the name in the Main does not have to match the method further down
			
			
		} else {
			whatToDoNow = "Good, we have all the books";
		}
		
	return whatToDoNow;	 //this snaps back to the top of the  loop. It feeds doWeHaveAllTheNotebooks
	}
}
