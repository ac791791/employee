package practice;

import java.util.Scanner;

public class PrintHello {
	public static void main(String[] args) {
		System.out.println("Hello World");
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 + num2);
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String name = myObj.nextLine();

		System.out.println("Your name is " + name);
	}

}
