// Java program to find largest among two
// numbers using ternary operator

import java.io.*;

public class ternary_operator {
    public static void main(String[] args)
	{

		// variable declaration
		int a = 30, b = 20,c=40;

		// System.out.println("First num: " +a);
		// System.out.println("Second num: " +b);

		// Largest among a and b
		String result = (a < b) ? "a is lesser" : "b is lesser";

		// Print the largest number
		System.out.println(result);

		// nested conditional using ternary operator
		int num=(a<b)? (a<c ? a: b): (b<c ? b:c);

		System.out.println(num);
	}
}
