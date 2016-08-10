import java.util.Comparator;

public class DescSortedByName implements Comparator<Dog> {

	public int compare(Dog obj1, Dog obj2) {
		// Create comparator for ascending order compare
		Comparator<Dog> comparator = new AscSortedByName();

		// Revert order of compare
		return comparator.compare(obj1, obj2) * (-1);
	}
}
