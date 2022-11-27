package ie.itcarow.lab7;

//Name: Ahmad Muselmani
//date 21/11/2022
//Student ID:C00276504
//Purpose: creating a child class Cat extending from parent class Animal with attrebutes Name, age, gender
public class Cat extends Animal 
{

	public Cat(String name, int age, char gender) {
		super(name, age, gender);
		
	}
	
	public void eat() {
		System.out.println("Cat is eating");
		
	}
	
	public void sleep() {
		System.out.println("Cat is sleeping");
		
	}
	
	public void makeSound() {
		System.out.println("meow");
		
	}

	@Override
	public String toString() {
		return "Cat [Name:" + getName() + ", Age:" + getAge() + ", Gender:" + getGender()
		+ "]";
	}


}
