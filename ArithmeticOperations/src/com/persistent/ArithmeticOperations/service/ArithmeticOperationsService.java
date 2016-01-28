package com.persistent.ArithmeticOperations.service;

import com.persistent.ArithmeticOperations.exceptions.InvalidInputException;

public interface ArithmeticOperationsService {
	
	public void primeNumbers(int num) throws InvalidInputException;
	
	public int factorial(int number);
	
	public int add(int num1,int num2);
	
	public int product(int firstNumber,int secondNumber);

	public boolean OddEven(int number);
	
	public double divide(int firstNumber,int secondNumber);
	
	public double squareRoot(int firstNumber);
	
	public int rem(int num1,int num2);
	
	public int quot(int num1,int num2);
	
	public int reverse(int number);
	
	public String palindrome(int number);
	
	public boolean armstrong(int n);
	
	public int fibonacci(int count);
	
	public int lcm(int num1, int num2);
	
	public int gcd(int num1, int num2);
}
