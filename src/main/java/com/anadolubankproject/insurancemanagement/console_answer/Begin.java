package com.anadolubankproject.insurancemanagement.console_answer;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Begin {

	public static Scanner input = new Scanner(System.in);

	private static PolicyConsoleHandler consoleHandler;

	@Autowired
	public Begin(PolicyConsoleHandler consoleHandler) {
		this.consoleHandler = consoleHandler;
	}

	public static void inprocess() {
		System.out.println("What do you want to do? ");

		System.out.println(

				"A. Get access to data with tables.\n" + "B. Make report according to the table.\n"
						+ "C. Compare data with each other.\n" + "D. See data by graph\n" + "Q. Exit"

		);

		String result = input.nextLine();
		switch (result) {
		case "A": {
			consoleHandler.tableFinanceData();

		}
		case "B": {
			consoleHandler.makeReportTable();

		}
		case "C": {
			consoleHandler.compareData();
		}
		case "D": {

		}
		case "Q": {
			System.out.print("Bye bye!");
			System.exit(0);
		}

		}

	}

}
