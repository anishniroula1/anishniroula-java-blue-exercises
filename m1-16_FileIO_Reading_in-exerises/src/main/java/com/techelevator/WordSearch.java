package com.techelevator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws IOException {

		finalMain();

	}

	public static String caseSensitive() {
		Scanner in = new Scanner(System.in);
		System.out.println("Should the search be case sensitive? (Y\\N) ");
		String caseSensitive = in.nextLine();

		return caseSensitive;

	}

	public static File getFile() {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the file that should be searched?:  ");
		String userInputFile = in.nextLine();

		File newFile = new File(userInputFile);

		if (newFile.exists() == false) {
			System.out.println(userInputFile + "Doesn't Exist");
			System.exit(1);
		} else if (newFile.isFile() == false) {
			System.out.println(userInputFile + " is not a file");
			System.exit(1);
		}
		return newFile;

	}

	public static String getUserChoice() {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the search word you are looking for? ");
		String userChoice = in.nextLine();
		return userChoice;

	}

	public static void finalMain() throws IOException {
		File inputFile = getFile();
		String userChoice = getUserChoice();
		String sensitive = caseSensitive();

		try (Scanner fileIn = new Scanner(inputFile)) {
			int countWord = 1;
			while (fileIn.hasNextLine()) {
				String line = fileIn.nextLine();

				if (sensitive.equals("y") || sensitive.equals("Y")) {
					String newCase = userChoice.substring(0, 1).toUpperCase() + userChoice.substring(1);
					if (line.contains(newCase))
						System.out.println(countWord + " :" + line);
				} else if (line.contains(userChoice)) {
					System.out.println(countWord + " :" + line);
				}
				countWord++;

				//
			}

		}

	}

}