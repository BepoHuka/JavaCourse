public class Dog {

	private String name;
	private DogSize size;
	private int age;

//	 public Dog() {
//	 	this.name = Generator.generateName();
//	 	this.size = Generator.generateSize();
//	 	this.age = Generator.generateAge();
//	 } 

	public Dog(String name, DogSize size, int age) {
		setName(name);
		setSize(size);
		setAge(age);
	}

	@Override
	public String toString() {
		String result;
		result = "Dog parametres: ";
		result += "name - " + name + ", ";
		result += "age - " + age + ", ";
		result += "size - " + size.toString();
		return result;
	}

	public String getName() {
		return name;
	}

	public DogSize getSize() {
		return size;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		if (name == null)
			this.name = Generator.generateName();
		else
			this.name = name;
	}

	public void setSize(DogSize size) {
		if (size == null)
			this.size = Generator.generateSize();
		else
			this.size = size;
	}

	public void setAge(int age) {
		// Bad check: 0 is valid age
		if (age <= 0)
			this.age = Generator.generateAge();
		else
			this.age = age;
	}

	public int sizeToNum() {
		return size.ordinal();
	}
}
