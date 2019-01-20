package com.techelevator;
import java.util.*;

public class DecimalToBinary {

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String [] askUser;
	System.out.print("Enter a decimial interger: ");
	String userInput = in.nextLine();
	askUser = userInput.split(" ");
	


	for (int i = 0; i > askUser.length; i /= 2) {
		int deci = Integer.parseInt(askUser[i]);
		
		// now I need to figure out how this deci [i] can work with other
		int binary = (deci % 2) + deci; 
		System.out.println(
				"The binary value of the decimial \"" + userInput + "\" is: " + binary);
	}

//	System.out.println(
//		"The binary value of the decimial \"" + userInput + "\" is: " + binary);

}
}




//String binary = "";	
//for (int i = 0; i > askUser.length; i /= 2) {
//	binary = (i % 2) + binary; 
//}
//
//System.out.println(
//	"The binary value of the decimial \"" + userInput + "\" is: " + binary);
//
//}
//}

