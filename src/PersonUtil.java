import java.util.ArrayList;

/*
 * It has provide methods about Person class
 */
public class PersonUtil {

	public ArrayList<Person> getAllPersons(){
		
		ArrayList<Person> personsBag = new ArrayList();
		
		Person p1 = new Person();
		p1.setFirstName("fn1");
		p1.setLastName("ln1");
		p1.setAge(10);
		p1.setPhone("123-123-1234");
		personsBag.add(p1);
		
		
		Person p2 = new Person();
		p2.setFirstName("fn2");
		p2.setLastName("ln2");
		p2.setAge(20);
		p2.setPhone("123-123-1235");
		personsBag.add(p2);
		
		Person p3 = new Person();
		p3.setFirstName("fn3");
		p3.setLastName("ln3");
		p3.setAge(30);
		p3.setPhone("123-123-1236");
		personsBag.add(p3);
		
 		return personsBag;
	}

	/**
	 * 2 objects
	 * @return
	 */
	public ArrayList<Person> getAllSeniors(){
		
		ArrayList<Person> personsBag = new ArrayList();
		
		Person p1 = new Person();
		p1.setFirstName("sn1");
		p1.setLastName("ln1");
		p1.setAge(100);
		p1.setPhone("123-123-1234");
		personsBag.add(p1);
		
		
		Person p2 = new Person();
		p2.setFirstName("fn2");
		p2.setLastName("ln2");
		p2.setAge(200);
		p2.setPhone("123-123-1235");
		personsBag.add(p2);
		
		
 		return personsBag;
	}

}
