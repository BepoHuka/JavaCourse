import java.util.Comparator;

public class AscSortedByAge implements Comparator<Dog> {
	      
	       public int compare(Dog obj1, Dog obj2) {
	            
	             double age1 = obj1.getAge();
	             double age2 = obj2.getAge();

	             if(age1 > age2) {
	                    return 1;
	             }
	             else if(age1 < age2) {
	                    return -1;
	             }
	             else {
	                    return 0;
	             }
	       }
	}