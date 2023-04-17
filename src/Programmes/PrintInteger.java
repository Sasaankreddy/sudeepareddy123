package Programmes;

import java.util.Scanner;

public class PrintInteger {

	public static void main(String[] args) {
		// Creates a reader instance which takes
        // input from standard input - keyboard
		Scanner input =new Scanner(System.in);
		System.out.println("Enter Number");
		//nextInt() reads integer from the keyboard
		int number=input.nextInt();
		System.out.println("You entered number"+" "+number);

	}

}
