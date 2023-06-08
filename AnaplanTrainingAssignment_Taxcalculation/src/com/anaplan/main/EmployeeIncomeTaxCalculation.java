package com.anaplan.main;

import java.util.Scanner;

public class EmployeeIncomeTaxCalculation {
	public static void main(String[] args) {
	    double tax =0, it;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Please enter the Emplyee Ammount ");
	    it=sc.nextDouble();
	    if(it<50000)
	        tax=0;
	    else if (it<=60000)
	        tax=0.1*(it-50000);
	        else if (it<=150000)
	            tax=(0.2*(it-60000))+(0.1*100000);
	        else
	            tax=(0.3*(it-150000))+(0.2*90000)+(0.1*10000);

	    System.out.println("income tax is: " + tax);
	}
}
