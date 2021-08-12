package com.company;
import java.util.Scanner;
public class Main {
    //import java.util.Scanner;
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int grades;
	int interview;
	int confidence;

	System.out.print("Enter your KCSE average grades:");
	grades = input.nextInt();

	System.out.print("Enter Interview Marks");
	interview = input.nextInt();

	System.out.print("Enter Confidence Score");
	confidence = input.nextInt();

	if ( grades >= 65 && interview >=6)
	    System.out.println("Pass");
        else
            if (grades >= 65 && confidence >=5 )
                System.out.println("Pass");
                else
                    System.out.println("Fail");
    }
}
