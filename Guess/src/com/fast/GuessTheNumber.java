package com.fast;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		
		GuessTheNumber ob = new GuessTheNumber();
//		System.out.println(ob.randomNumber());
		int a = ob.randomNumber();
//		System.out.println(a);
		ob.guessTheNumber(a);
	}
	
	public int randomNumber(){
		Random objGenerator = new Random();
		int number = objGenerator.nextInt(100);
		return number;
	}
	
	public void guessTheNumber(int a) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		
		int b = sc.nextInt();
		int count=0;
		
				
		String c = "false";
		
		while(c=="false") {
			if(b>a) {
				System.out.println("Number is smaller than your input");
				b= newNumber();
				count++;
			}
			
			else if (b<a){
				System.out.println("Number is greater than your input");
				b= newNumber();
				count++;
			}
			else {
				System.out.println("correct");
				c="true";
				System.out.println("Total Count " + (count+1));
			}
		}
	}
	
	public int newNumber() {
		Scanner sc1 = new Scanner(System.in);
		int b = sc1.nextInt();
		return b;
		
	}

}
