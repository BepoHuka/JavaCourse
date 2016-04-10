import java.util.Random;

public class Generator {

	public static String generateName() {
		String[] Beginning = { "Vr", "Ca", "Rok", "Cru", "Ray", "Bre", "Zed", "Dak", "Mor", "Jag", "Mel", "Har", "Mol"};
		String[] Middle = { "ol", "ire", "min", "so", "me", "clo", "red", "cra", "ark", "arc", "mir", "lori", "cre"};
		String[] End = { "d", "ed", "ruk", "arc", "es", "er", "der", "tron", "med", "ure", "zur", "red", "mur" };
		Random randomushka = new Random();
		return Beginning[randomushka.nextInt(Beginning.length)] + Middle[randomushka.nextInt(Middle.length)] + End[randomushka.nextInt(End.length)];
	}

	public static int generateAge() {
		Random randomushka = new Random();
		return randomushka.nextInt(20) + 1;
	}

	public static String generateSize() {
		Random randomushka = new Random();
		String[] sizes = new String[] {"big", "medium", "small"};
		String random = (sizes[randomushka.nextInt(sizes.length)]);
		return random;
	}

	public static void main(String [] Args){
		generateName();
		generateAge();
		System.out.println(generateName());
		System.out.println(generateAge());
		System.out.println(generateSize());
	}
}