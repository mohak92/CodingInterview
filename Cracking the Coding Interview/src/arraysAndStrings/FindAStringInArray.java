package arraysAndStrings;

import java.util.Scanner;
import java.util.Arrays;

public class FindAStringInArray {
	
	public static void main(String args[]){
		String[] names = {"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity"
				, "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore",
				"Taylor", "Anderson", "Thomas", "Jackson"};
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter a name to check");
		String name = sr.nextLine();
		System.out.println(Arrays.asList(names).contains(name));
		sr.close();
	}
}
