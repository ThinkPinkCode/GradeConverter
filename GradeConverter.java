// Melanie Myers
// 6/7/2016
// This program takes a number grade and converts it to a letter grade.

import java.util.Scanner;


public class GradeConverter {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner (System.in);
		
		String letterGrade = null;
		
		System.out.println("Welcome to the Grade Converter \n"
				+ "This program displays the corresponding letter grade for any letter grade.");

		System.out.println("What is the numerical grade?");
		double grade = reader.nextInt();
		
		
		
			if (grade >= 88){
				letterGrade= "A";
			}
			else if (grade >= 80){
				letterGrade= "B";
			}
			else if (grade >= 67){
				letterGrade = "C";

			}
			else if (grade >= 60){
				letterGrade = "D";
				
			}
			else if (grade >=0){
				letterGrade = "F";
				
			}
		
		System.out.println("The letter grade is: " + letterGrade + " .");
	}

	
}
