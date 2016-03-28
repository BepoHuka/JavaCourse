import java.util.Scanner;

public class Dog {
	String name;
	int age;
	String size;
	
	public Dog(){
		this.name = Generator.generateName();
		this.age = Generator.generateAge();
		this.size = Generator.generateSize();
	}
	
	public Dog(String name, int age, String size){
		this.name = name;
		this.age = age;
		this.size = size;
	}
	
	public Dog(String name, int age){
		this.name = name;
		this.age = age;
		this.size = Generator.generateSize();
	}
	
	public Dog(String name){
		this.name = name;
		this.age = Generator.generateAge();
		this.size = Generator.generateSize();
	}
	
	
	public String toString(){
		String result;
		result = "Dog parametres: ";
		result += "name - " + name + ", ";
		result += "age - " + age + ", ";
		result += "size - " + size;
		return result;
	}
	

	public static void main(String[] args) {
					
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount of dogs and their names devided by space: "); 
		String inputString = sc.nextLine();
		String[] words = inputString.split("\\s+");
		int firstElem = new Integer(words[0]);		
		Dog dogs[] = new Dog[firstElem];
		for (int i = 0; i < firstElem; i++) 
			if (i < words.length - 1)
				dogs[i] = new Dog(words[i + 1]);
			else
				dogs[i] = new Dog(); 
		
		for (int i = 0; i < firstElem; i++)
	    	System.out.println(dogs[i] + " ");

	}	

}
