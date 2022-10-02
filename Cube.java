//Design method public int getNumberCube(int num), 
//return int value to that method and result should be into main method.
package com.velocity;

import java.util.Scanner;

public class Cube {
	public int getNumberCube(int num) {
		int number =num*num*num;
		System.out.println(number);
		return number;
	}
	public static void main (String args[]) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the number to find cube");
		int number1=scanner.nextInt();
		Cube cube =new Cube();
		int GetCube=cube.getNumberCube(number1);
		System.out.println(GetCube)
;	}

}
