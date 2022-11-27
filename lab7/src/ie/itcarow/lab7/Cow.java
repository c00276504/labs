package ie.itcarow.lab7;

//Name: Ahmad Muselmani
//date 21/11/2022
//Student ID:C00276504
//Purpose: creating a child class Cow extending from parent class Animal with attrebutes Name, age, gender
public class Cow extends Animal {
	
	public Cow(String name, int age, char gender) {
		super(name,age,gender);
	}
	
	public void eat() {
		System.out.println("Cow is eating");
	
	}
	
	public void sleep() {
		System.out.println("cow is sleeping");
	
	}
	
	public void makeSound() {
		System.out.println("moo");
	
	}

	@Override
	public String toString() {
		return "Cow [Name:" + getName() + ", Age:" + getAge() + ", Gender:" + getGender()
		+ "]";
	}
	
	

}
