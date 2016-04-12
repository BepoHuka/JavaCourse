import java.util.Comparator;

public class Sort {
//	public static Dog[] insertionSort(Dog[] array, Comparator<Dog> comparator){
	public static <T> T[] insertionSort(T[] array, Comparator<? super T> comparator){
		
    	for (int i = 1; i < array.length; i++) {
    		T arrayElement = array[i];
    		int j = i-1;
    		while(j >= 0 && comparator.compare(arrayElement, array[j]) < 0) {
    			array[j+1] = array[j];
    			j=j-1;
    		}
    		array[j+1]=arrayElement;
    	}
    	return array;
    }
}