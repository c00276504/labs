package ie.itcarow.lab7;

//Name: Ahmad Muselmani
//date 21/11/2022
//Student ID:C00276504
//Purpose: creating a class Vet to be use in supper Animal to confirm if the specified Animal is vaccenated and
//the method vaccinate of this class will be invoked in drive program

public class Vet 
{
	public void vaccinate(Animal object) {
		System.out.println(object.getName() + " is vaccinating");
		
		if(object instanceof Dog) {
			System.out.println(((Dog)object).toString());
			System.out.println(((Dog)object).getName()+" has been vaccinated");
			
		}
		else if(object instanceof Cat) {
			System.out.println(((Cat)object).toString());
			System.out.println(((Cat)object).getName() + " has been vaccinated");
			
			
		}
	
	}
}
