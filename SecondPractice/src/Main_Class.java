import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_Class {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numDogs = 0;
		String inputString = null;
		boolean loop = true;		
		
		while (loop) {			 
			try {
				System.out.print("Enter amount of dogs and their names devided by space: ");
				Pattern pattern = Pattern.compile("^\\d+\\s+\\D*|^\\d+\\s*$");
				inputString = sc.nextLine();
				Matcher matcher = pattern.matcher(inputString);
				if(!matcher.find()){
			        throw new Exception("Incorrect input!");
			    }
				loop = false;
			} catch(Exception e){
			    System.out.println(e.toString());
			}
		}
		

		String[] words = inputString.split("\\s+");
		numDogs = Integer.parseInt(words[0]);
		String[] names = new String[numDogs];
		for (int i = 0; i < numDogs; i++)
			if (i < words.length - 1)
				names[i] = words[i + 1];
		
		inputString = null;
		loop = true;	
		
		while (loop) {			 
			try {
				System.out.print("Enter sizes of dogs (small, medium, big) devided by space: ");
				Pattern pattern = Pattern.compile("([sS]mall\\s*|[mM]edium\\s*|[bB]ig\\s*)*");
				inputString = sc.nextLine();
				Matcher matcher = pattern.matcher(inputString);
				if(!matcher.find()){
			        throw new Exception("Incorrect input!");
			    }
				loop = false;
			} catch(Exception e){
			    System.out.println(e.toString());
			}
		}

		// Check if entered empty string
		if (inputString.length() > 0)
			words = inputString.split("\\s+");
		else
			words = new String[0];

		DogSize[] sizes = new DogSize[numDogs];
		for (int i = 0; i < numDogs; i++)
			if (i < words.length)
				sizes[i] = DogSize.valueOf(words[i].toUpperCase());

		inputString = null;
		loop = true;	
		
		while (loop) {			 
			try {
				System.out.print("Enter age of dogs (0-20) devided by space: ");
				Pattern pattern = Pattern.compile("(^([01]?\\d|20)(\\s+([01]?\\d|20))*)*");
				inputString = sc.nextLine();
				Matcher matcher = pattern.matcher(inputString);
				if(!matcher.find()){
			        throw new Exception("Incorrect input!");
			    }
				loop = false;
			} catch(Exception e){
			    System.out.println(e.toString());
			}
		}
		
		// Check if entered empty string
		if (inputString.length() > 0)
			words = inputString.split("\\s+");
		else
			words = new String[0];

		int[] ages = new int[numDogs];

		for (int i = 0; i < numDogs; i++)
			if (i < words.length)
				ages[i] = Integer.parseInt(words[i]);

		Dog dogs[] = new Dog[numDogs];

		for (int i = 0; i < numDogs; i++)
			dogs[i] = new Dog(names[i], sizes[i], ages[i]);

		for (Dog i : dogs)
			System.out.println(i);

		System.out.println("Sort by: ");
		System.out.println("[1] Ascending sort by name");
		System.out.println("[2] Descending sort by name");
		System.out.println("[3] Ascending sort by size");
		System.out.println("[4] Descending sort by size");
		System.out.println("[5] Ascending sort by age");
		System.out.println("[6] Descending sort by age");
		System.out.println("Enter number 1-6: ");

		int inputNum = sc.nextInt();

		Comparator<Dog> comparator = null;
		switch (inputNum) {
		case 1:
			comparator = new AscSortedByName();
			break;
		case 2:
			comparator = new DescSortedByName();
			break;
		case 3:
			comparator = new AscSortedBySize();
			break;
		case 4:
			comparator = new DescSortedBySize();
			break;
		case 5:
			comparator = new AscSortedByAge();
			break;
		case 6:
			comparator = new DescSortedByAge();
			break;
		}
		Sort.insertionSort(dogs, comparator);

		for (Dog i : dogs)
			System.out.println(i);

		sc.close();
	}
}
