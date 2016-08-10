import java.util.Random;

public class Generator {
	
	static Random randomushka = new Random();

	public static String generateName() {
		String[] beginning = { "Vr", "Ca", "Rok", "Cru", "Ray", "Bre", "Zed", "Dak", "Mor", "Jag", "Mel", "Har",
				"Mol" };
		String[] middle = { "ol", "ire", "min", "so", "me", "clo", "red", "cra", "ark", "arc", "mir", "lori", "cre" };
		String[] end = { "d", "ed", "ruk", "arc", "es", "er", "der", "tron", "med", "ure", "zur", "red", "mur" };
		return beginning[randomushka.nextInt(beginning.length)] + middle[randomushka.nextInt(middle.length)]
				+ end[randomushka.nextInt(end.length)];
	}

	public static int generateAge() {
		return randomushka.nextInt(20) + 1;
	}

	public static DogSize generateSize() {
		return DogSize.values()[(int) (randomushka.nextInt(DogSize.values().length))];
	}
}