

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Boat();
		Vehicle v2 = new Car();
		Vehicle v3 = new Rocket();
		Person p = new Person(v1);
		p.setDrive(v2);
		p.setDrive(v3);
		p.drive();
	}

}