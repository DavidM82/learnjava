package calculator;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x,y,z;
		double result = 0;
		while (true) {
			System.out.println("Welcome to Calculator! Select a program to use!\n 1. Add\n 2. Subtract\n 3. Multiply\n 4. Divide\n 5. Exit");
			if (scan.hasNextInt()) {
				z = scan.nextInt();
				//System.out.println(d);
				if (z == 5) {
					System.out.println("Closing program...");
					scan.close();
					break;
				}
				if (z > 0 && z < 5) {
					System.out.println("Please input the two numbers for this calculation...");
					if (scan.hasNextInt()) {
						x = scan.nextInt();
						if (scan.hasNextInt()) {
							y = scan.nextInt();
							switch (z) {
								case 1: result = add(x,y); break;
								case 2: result = subtract(x,y); break;
								case 3: result = multiply(x,y); break;
								case 4: result = divide(x,y); break;
							}
							System.out.println("Your result is " + result + "!\n");
						} else {
							System.out.println("Not a valid number!\n");
						}
					} else {
						System.out.println("Not a valid number!\n");
					}
				} else {
					System.out.println("Please choose a number between 1 and 5!\n");
				}
			}
			else {
				System.out.println("That's not a valid number!");
			}
		}
	}
	
	public static double divide(int x, int y) {
		double result = x/y;
		return result;
	}
	
	public static double multiply(int x, int y) {
		double result = x * y;
		return result;
	}
	
	public static double add(int x, int y) {
		double result = x + y;
		return result;
	}
	
	public static double subtract(int x, int y) {
		double result = x - y;
		return result;
	}
}
