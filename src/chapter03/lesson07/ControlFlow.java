package chapter03.lesson07;

import java.util.Scanner;

public class ControlFlow {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		String question = "What is the current version of Java?";
		String choiceOne = "11";
		String choiceTwo = "13";
		String choiceThree = "9";
		
		String correctAnswer = choiceTwo;
		
		// Write a print statement asking the question
		System.out.println(question);
		
		// Write a print statement giving the answer choices
		System.out.println("These are the possible answers:");
		System.out.println("> 1) Java 11");
		System.out.println("> 2) Java 13");
		System.out.println("> 3) Java 9");
		System.out.println("Choose between 1, 2, or 3?\n");
		
		// Have the user input an answer
		// Retrieve the user's input
		System.out.print("Enter your answer (version number!): ");
		String answer = scanner.next();
		
		// If the user's input matches the correctAnswer...
		// then the user is correct and we want to print out a congrats message to the user.
		if (answer.equals(correctAnswer)) {
			System.out.println("Congratulations! Answer is correct.");
		} else {
			System.out.println("No! Think twice. Try, again!");
			System.out.println("Correct answer was version: " + correctAnswer);
		}
		
		// If the user's input does not match the correctAnswer...
		// then the user is incorrect and we want to print out a message saying
		// that the user is incorrect as well as what the correct choice was.
		scanner.close();
	}
}
