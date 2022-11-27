package ie.itcarow.lab7;

//Name: Ahmad Muselmani
//date 21/11/2022
//Student ID:C00276504
//Purpose: creating a child class Dog extending from parent class Animal with attrebutes Name, age, gender
public class Dog extends Animal  
{

	public Dog(String name, int age, char gender) {
		super(name, age, gender);
		// TODO Auto-generated constructor stub
		
		
	}
	
	public void eat() {
		System.out.println("Dog is eating");
		
	}
	
	public void sleep() {
		System.out.println("Dog is sleeping");
		
	}
	
	public void makeSound() {
		System.out.println("Woof Woof!");
		
	}

	@Override
	public String toString() {
		return "Dog [Name:" + getName() + ", Age:" + getAge() + ", Gender:" + getGender()
				+ "]";
	}

}
