import java.util.Scanner;

public class Main_Class {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount of dogs and their names devided by space: ");
		String inputString = sc.nextLine();
		
		while (!inputString.matches("^\\d+\\s+\\D*|^\\d+\\s*$")) {
			System.out.print("Incorrec input. Enter amount of dogs and their names devided by space: ");
			inputString = sc.nextLine();
		}
	   
		String[] words = inputString.split("\\s+");    
		int numDogs = Integer.parseInt(words[0]);
		String[] names = new String[numDogs];
		for (int i = 0; i < numDogs; i++)
	   		if (i < words.length - 1)
	   			names[i] = words[i + 1]; 
	   
		System.out.print("Enter sizes of dogs (small, medium, big) devided by space: ");
		inputString = sc.nextLine();
	   
		while (!inputString.matches("([sS]mall\\s*|[mM]edium\\s*|[bB]ig\\s*)*")) {    	   
			System.out.print("Incorrec input. Enter sizes of dogs (small, medium, big) devided by space: ");
			inputString = sc.nextLine();
		}
	   
		// Check if entered empty string
		if (inputString.length() > 0)
			words = inputString.split("\\s+");
		else
			words = new String[0];
		
		String[] sizes = new String[numDogs];
		for (int i = 0; i < numDogs; i++)                	
	   		if (i < words.length)
	   			sizes[i] = words[i];
		
		System.out.print("Enter age of dogs (0-20) devided by space: ");
		inputString = sc.nextLine();
		
		while (!inputString.matches("(((1?[0-9])|20)\\s*)*")) {    	   
			System.out.print("Incorrec input. Enter age of dogs (0-20) devided by space: ");
			inputString = sc.nextLine();
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
   
        for (Dog i: dogs)
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
	            
        switch (inputNum) {
        	case 1:	Sort.insertionSort(dogs, new AscSortedByName());
        			break;
	       	case 2:	Sort.insertionSort(dogs, new DescSortedByName());
	           		break;
	       	case 3:	Sort.insertionSort(dogs, new AscSortedBySize());
	       			break;
	       	case 4:	Sort.insertionSort(dogs, new DescSortedBySize());
	       			break;
	       	case 5:	Sort.insertionSort(dogs, new AscSortedByAge());
					break;
	       	case 6:	Sort.insertionSort(dogs, new DescSortedByAge());
					break;
        }
        
        for (Dog i: dogs)
        	System.out.println(i);
	       
        sc.close();
        
	}

}
