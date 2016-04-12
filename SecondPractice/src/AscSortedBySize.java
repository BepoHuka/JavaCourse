import java.util.Comparator;

public class AscSortedBySize implements Comparator<Dog> {
	
       public int compare(Dog obj1, Dog obj2) {
            
             String str1 = obj1.getSize();
             String str2 = obj2.getSize();              
             return str1.compareTo(str2);
       }
       
}
