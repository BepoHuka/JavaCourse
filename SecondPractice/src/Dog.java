public class Dog {
        String name;        
        String size;
        int age;
        public Dog(){
                this.name = Generator.generateName();                
                this.size = Generator.generateSize();
                this.age = Generator.generateAge();
        }

        public Dog(String name, String size, int age){
        	if (name == null)
        		this.name = Generator.generateName();
        	else
                this.name = name;        	

        	if (size == null)
        		this.size = Generator.generateSize();
        	else
                this.size = size;
        	// Bad check: 0 is valid age
        	if (age == 0)
        		this.age = Generator.generateAge();
        	else
                this.age = age;        	
        }        

        public String toString(){
                String result;
                result = "Dog parametres: ";
                result += "name - " + name + ", ";
                result += "age - " + age + ", ";
                result += "size - " + size;
                return result;
        }
        
        public String getName() {
            return name;
        }
        
        public String getSize() {	
        	sizeToNum();
            return size;
        }
        
        public int getAge() {
            return age;
        }

        public int sizeToNum() {
        	if (size == "small")	
        		return 1;
        	else if (size =="medium")	
        		return 2;
        	else
        		return 3;
        }
}
