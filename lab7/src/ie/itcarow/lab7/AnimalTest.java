package ie.itcarow.lab7;

// Name: Ahmad Muselmani
//date 21/11/2022
//Student ID:C00276504
//Purpose: drive program to test super class Animal  and inhearted subclasses cat and Dog 

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Dog("Poodle", 4, 'M');
		Vet vaccine = new Vet();
		
		System.out.println(dog);
		((Dog) dog).eat();
		((Dog) dog).sleep();
		((Dog) dog).makeSound();
		vaccine.vaccinate(dog);
		
		System.out.println();
		
		Animal cat = new Cat("Tom", 2, 'F');
		System.out.println(cat);
		((Cat) cat).eat();
		((Cat) cat).sleep();
		((Cat) cat).makeSound();
		vaccine.vaccinate(cat);

		System.out.println();

		Animal cow = new Cow("Daisy", 3, 'F');
		System.out.println(cow);
		((Cow) cow).eat();
		((Cow) cow).sleep();
		((Cow) cow).makeSound();

	}

}
