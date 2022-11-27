package ie.itcarow.lab7;

//Name: Ahmad Muselmani
//date 21/11/2022
//Student ID:C00276504
//Purpose: creating a parent class Animal with attrebutes Name, age, gender

public class Animal {
	private String name;
	private int age;
	private char gender;
	
	
	
	public Animal(String name, int age, char gender) 
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public char getGender() {
		return gender;
	}



	public void setGender(char gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
