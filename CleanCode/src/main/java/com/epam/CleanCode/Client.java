package com.epam.CleanCode;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Client myclient = new Client();
			System.out.println("Enter an option 1.Calculate Simple Interest 2.Calculate Compound Interest ");
			Scanner sc = new Scanner(System.in);
			int val = sc.nextInt();
			switch(val) {
			case 1:
				myclient.CalculateSimpleInterest();
				break;
			case 2:
				myclient.CalculateCompoundInterest();
				break;
			default:
				System.out.println("Enter valid input");	
				break;
			}
	}
	public void CalculateSimpleInterest(){
		SimpleInterest s = new SimpleInterest();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the amount taken");
			float principalAmount = sc.nextFloat();
			System.out.println("Enter the term of loan");
			 float timePeriod = sc.nextFloat();
			System.out.println("Enter the Rate of Interest");
			float rateOfInterest = sc.nextFloat();
		    float simpleInterest = s.CalculateSimpleInterest(principalAmount, timePeriod, rateOfInterest);
		    System.out.println("Simple Interest  " +simpleInterest);
		    
	}
	public void CalculateCompoundInterest(){
		CompoundInterest c = new CompoundInterest();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the principle");
			double principle = sc.nextDouble();
			System.out.println("Enter the interest");
			double interest = sc.nextDouble();
			System.out.println("Enter the total number of years");
			double totalNoOfYears = sc.nextDouble();
			System.out.println("Enter the interest to compound every year");
			double numberOfCompoundingsPerYear = sc.nextDouble();
			double compoundInterest = c.CalculateCompoundInterest(principle, interest, totalNoOfYears, numberOfCompoundingsPerYear);
		    System.out.println(compoundInterest);
	}
	

}
