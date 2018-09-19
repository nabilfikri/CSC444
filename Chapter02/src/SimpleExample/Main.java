package SimpleExample;

public class Main {
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.setName("Tompok");
		
		Dog dog = new Dog();
		dog.setName("Silver");
		
		System.out.println(cat.speak());
		System.out.println(dog.speak() + "\n" + dog.fetch());
		
		System.out.println();
		
		Pet p = new Cat();
		p.setName("Oren");
		
		System.out.println("Cat name: " + p.getName());
		System.out.println(p.speak());
		System.out.println();
		
		Pet p2 = new Dog();
		p.setName("Gray");
		System.out.println("Dog name: " + p.getName());
		System.out.println(p2.speak());
		
		//Invalid declarations
//		Cat c = new Pet();
//		Dog d = new Pet();
		
		//Invalid method calls
//		p.fetch(); // no method fetch defined in class Pet
		
		//to overcome, do casting
		Dog d = (Dog) p2;
		System.out.println();
		System.out.println(d.fetch());;
	}
}