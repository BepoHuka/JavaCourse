import java.util.Random;

public class Generator {
	
	static Random random = new Random();

	public static String generateName() {
		String[] beginning = { "Vr", "Ca", "Rok", "Cru", "Ray", "Bre", "Zed", "Dak", "Mor", "Jag", "Mel", "Har",
				"Mol" };
		String[] middle = { "ol", "ire", "min", "so", "me", "clo", "red", "cra", "ark", "arc", "mir", "lori", "cre" };
		String[] end = { "d", "ed", "ruk", "arc", "es", "er", "der", "tron", "med", "ure", "zur", "red", "mur" };
		return beginning[random.nextInt(beginning.length)] + middle[random.nextInt(middle.length)]
				+ end[random.nextInt(end.length)];
	}

	public static int generateAge() {
		return random.nextInt(20) + 1;
	}

	public static DogSize generateSize() {
		return DogSize.values()[(int) (random.nextInt(DogSize.values().length))];
	}
}