package demo;

import java.util.Scanner;

public class Cal implements Calculator {

	@Override
	public Integer Add(Integer a, Integer b) {
		// TODO Auto-generated method stub
		Integer addition = a + b;
		return addition;
	}

	@Override
	public Long Multiply(Integer a, Integer b) {
		// TODO Auto-generated method stub
		Long multiply = (long) (a * b);
		return multiply;
	}

	@Override
	public Integer division(int a, int b) {
		// TODO Auto-generated method stub
		Integer div = a/b;
		return div;
	}

	@Override
	public Integer Subtract(int a, int b) {
		// TODO Auto-generated method stub
		Integer subtract = a - b;
		return subtract;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal Calculate  = new Cal();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Two number");
		Integer a = input.nextInt();
		Integer b = input.nextInt();
		System.out.println("select your choice : 1. Addition 2. Subtraction 3. multiplication 4. Division");
		
		Integer choices = input.nextInt();
		
		
		switch(choices) {
		case 1:
			System.out.println(Calculate.Add(a,b));
			break;
		case 2:
			System.out.println(Calculate.Subtract(a,b));
			break;
		case 3:
			System.out.println(Calculate.Multiply(a,b));
			break;
		case 4:
			try {
			System.out.println(Calculate.division(a,b));
			} catch(ArithmeticException e) {
				System.out.println("can't divide by zero");
			}
			break;
		default :
			System.out.println("No action available for this Choice");
		}
		

	}

}
