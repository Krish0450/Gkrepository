import java.util.ArrayList;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//I will call your method
		
		//You need write a method which will return all persons
		PersonUtil pu = new PersonUtil();
		//personList will have all persons (3)
		ArrayList<Person> personList = pu.getAllPersons();
		
		
		//loop through all persons and print data
		printObjects(personList);
		
		//add a new person
		Person p5 = new Person();
		p5.setFirstName("p5");
		personList.add(p5);
		
		//How to print size of the List
		System.out.println("New size after ading p5: "+personList.size());
		
		//Get second person's object
		Person secondPerson = personList.get(1);
		System.out.println(secondPerson);
		
		
		ArrayList<Person> sList = pu.getAllSeniors();
		//It will add all the elements/objects in the other list
		personList.addAll(sList);
		//Print size
		System.out.println(personList.size());
		
		Person p7 = new Person();
		p5.setFirstName("p7");
		personList.add(3,p7);
		
		//Print size
		System.out.println(personList.size());
		
		printObjects(personList);
		
	}
	
	/**
	 * It will iterate all objects and prints the data
	 * @param persons
	 */
	private static void printObjects(ArrayList<Person> persons) {
		//loop through all persons and print data
				for(Person p  : persons) {
					//it call toString method
					//System.out.println(p.toString());
					System.out.println(p);
				}
	}

}
