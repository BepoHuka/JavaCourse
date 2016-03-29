import java.util.Scanner;

public class Dog {
        String name;        
        String size;
        int age;

        public Dog(){
                this.name = Generator.generateName();                
                this.size = Generator.generateSize();
                this.age = Generator.generateAge();
        }

        public Dog(String name, String size, int age){
        	if (name == null)
        		this.name = Generator.generateName();
        	else
                this.name = name;        	

        	if (size == null)
        		this.size = Generator.generateSize();
        	else
                this.size = size;
        	// Bad check: 0 is valid age
        	if (age == 0)
        		this.age = Generator.generateAge();
        	else
                this.age = age;        	
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
                int numDogs = Integer.parseInt(words[0]);
                String[] names = new String[numDogs];
                for (int i = 0; i < numDogs; i++)
                	if (i + 1 < words.length)
                		names[i] = words[i + 1];
                
                System.out.print("Enter sizes of dogs (small, medium, big) devided by space: ");
                inputString = sc.nextLine();
                words = inputString.split("\\s+");
                String[] sizes = new String[numDogs];
                for (int i = 0; i < numDogs; i++)
                	// If empty string were entered words length still be 1
                	if (i < words.length)
                		sizes[i] = words[i];
                
                System.out.print("Enter age of dogs devided by space: ");
                inputString = sc.nextLine();
                words = inputString.split("\\s+");
                int[] ages = new int[numDogs];
                
                for (int i = 0; i < numDogs; i++)
                	// If empty string were entered words length still be 1
                	if (i < words.length)
                		ages[i] = Integer.parseInt(words[i]);
                
                Dog dogs[] = new Dog[numDogs];
                
                for (int i = 0; i < numDogs; i++)                 	
                	dogs[i] = new Dog(names[i], sizes[i], ages[i]);                
        
                for (int i = 0; i < numDogs; i++)
                        System.out.println(dogs[i] + " ");
                
                sc.close();
                
        }

}
