import java.util.Comparator;

public class AscSortedBySize implements Comparator<Dog> {

	public int compare(Dog obj1, Dog obj2) {

		int size1 = obj1.sizeToNum();
		int size2 = obj2.sizeToNum();

		if (size1 > size2) {
			return 1;
		} else if (size1 < size2) {
			return -1;
		} else {
			return 0;
		}
	}
}
