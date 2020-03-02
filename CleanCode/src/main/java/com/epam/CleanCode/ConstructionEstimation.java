package com.epam.CleanCode;

import java.util.Scanner;

public class ConstructionEstimation {
	
	public static void Estimation(){
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the area of the house");
	double area = sc.nextDouble();
	double totalCost = 0.0;
	System.out.println("Enter the value 1.Standard materials 2.Above standard materials 3.High standard materials "
			+ "4.High standard material and fully automated home 5.");
	int val = sc.nextInt();
	switch(val) {
	case 1:
		totalCost = 1200*area;
		break;
	case 2:
		totalCost = 1500*area;
		break;
	case 3:
		totalCost = 1800*area;
		break;
	case 4:
		totalCost = 2500*area;
		break;
	default:
		System.out.println("Enter valid input");	
		break;
	}
	System.out.println("House Construction Cost" +totalCost);
	}
}
