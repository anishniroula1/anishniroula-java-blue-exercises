package com.techelevator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) throws IOException {
		//
				File newFile = getFileFromUser();
				
				try (PrintWriter fizzBuzz = new PrintWriter(newFile);
						BufferedWriter newFizzBuzz = new BufferedWriter(fizzBuzz)) {
					String endOutput = "";
					int count = 0;

					for (int i = 1; i <= 300; i++) {
						count++;
						if ((String.valueOf(i).contains("5") && String.valueOf(i).contains("3")) || (i % 3 == 0 && i % 5 == 0)) {
							endOutput = count + " FizzBuzz";
						} else if (i % 3 == 0 && i % 5 == 0) {
							endOutput = count + " FizzBuzz";
						}

						else if (i % 3 == 0 || Integer.toString(i).contains("3")) {
							endOutput = count + " Fizz";
						} else if (i % 5 == 0 || Integer.toString(i).contains("5")) {
							endOutput = count + " Buzz";
						} else {
							endOutput = count + " " + Integer.toString(i);
						}
						newFizzBuzz.write(endOutput+"\n");
					}
					
							

						
						}
					}
			

//			public static String fizzBuzzTest(int number) {
//				String endOutput = "";
//				int count = 0;
		//
//				for (int i = 1; i <= number; i++) {
//					count++;
//					if ((String.valueOf(i).contains("5") && String.valueOf(i).contains("3")) || (i % 3 == 0 && i % 5 == 0)) {
//						endOutput = count + " FizzBuzz";
//					} else if (i % 3 == 0 && i % 5 == 0) {
//						endOutput = count + " FizzBuzz";
//					}
		//
//					else if (i % 3 == 0 || Integer.toString(i).contains("3")) {
//						endOutput = count + " Fizz";
//					} else if (i % 5 == 0 || Integer.toString(i).contains("5")) {
//						endOutput = count + " Buzz";
//					} else {
//						endOutput = count + " " + Integer.toString(i);
//					}
		//
//				}
		//
//				return endOutput;
//			}
		//	
			
			public static File getFileFromUser() throws IOException {
				Scanner in = new Scanner(System.in);
				System.out.println("What is the file name you want to create? ");
				String userInput = in.nextLine();
				
				File newChoice = new File(userInput);
				newChoice.createNewFile();
				
				if(newChoice.exists()==false) {
					System.out.println(userInput + " path doesn't exist");
					System.exit(1);
				}
				else if(newChoice.isFile()==false) {
					System.out.println(userInput+ "is not a file");
				}
				
				return newChoice;
				
			}
		}
