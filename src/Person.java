
public class Person extends java.lang.Object{

	private String firstName;
	private String lastName;
	private int age;
	private String phone;

	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	@Override
	public String toString() {
		return "First Name: "+this.firstName+"\nLast Name: "+this.lastName+"\n age :"+this.age+"\n Phone :"+this.phone+"\n\n";
	}
	
	
}
