import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
 
public class ArraySorting {

    public static void main(String[] args) {
    	int arraySize = 0;
    	Scanner in = new Scanner(System.in);
        System.out.print("������� ������ �������: ");      		
        try {
        	arraySize = in.nextInt(); 
        	} 
	    catch (InputMismatchException ex) {
	    	System.err.println("�� ����� �� ����� �����");
	    	return;
	    	}
	    int [] array = new int[arraySize];	   
	    int [] array2 = new int[arraySize];
	    array = randomize(arraySize);
	    array2 = array.clone();		        
   
	    System.out.print("������������ ������ ��������� �����: ");    
	    for (int i = 0; i < arraySize; i++) {
	    	System.out.print(array[i] + " ");
	    	 }
	    System.out.println();
	    array = bublesort(array);
	    array2 = insertionSort(array2);    
		System.out.print("������ ������������ �� ����������� ������� ��������: "); 
		for (int i = 0; i < arraySize; i++) {
			System.out.print(array[i] + " ");
			}
		System.out.println();
		System.out.print("������ ������������ �� ����������� ������� �������: ");
		for (int i = 0; i < arraySize; i++) {
			System.out.print(array2[i] + " ");
			}
		System.out.println();
		in.close();	
    }    
    private static int[] randomize(int size) {
    	int [] randomArray = new int[size];
    	Random randomushka = new Random();  
        for (int i = 0; i < size; i++) {
        	randomArray[i] = randomushka.nextInt(100);        	
        }        
        
        return randomArray;            
    }
    
    private static int[] bublesort(int[] arrayToSort) {  	
    	for (int i = 0; i < arrayToSort.length - 1; i++) {
    		for (int j = 0; j < arrayToSort.length - 1; j++) {
    			if (arrayToSort[j] > arrayToSort[j + 1]) {
    				int tmp = arrayToSort[j];
    				arrayToSort[j] = arrayToSort[j + 1];
    				arrayToSort[j + 1] = tmp;
    				}
    			}
    		}  	
    	return arrayToSort;  
    	}  
    private static int[] insertionSort(int[] insArray) {
    	for (int i = 1; i < insArray.length; i++) {
    		int arrayElement = insArray[i];
    		int j = i-1;
    		while(j >= 0 && insArray[j] > arrayElement) {
    			insArray[j+1] = insArray[j];
    			j=j-1;
    			}
    		insArray[j+1]=arrayElement;
    		}
    	return insArray;
    	}
    }