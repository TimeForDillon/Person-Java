package Person;
/**
 * A class to test the Person class.
 */
public class PersonTester 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Person Dillon = new Person("Dillon");
		Person Asa = new Person("Asa");
		Person Andrea = new Person("Andrea");
		Person George = new Person("George");
		Person Marla = new Person("Marla");
		Person Jessica = new Person("Jessica");
		Dillon.befriend(Andrea);
		Dillon.befriend(George);
		Dillon.befriend(Marla);
		Dillon.befriend(Asa);
		Dillon.befriend(Jessica);
		System.out.println(Dillon.getFriendNames());
		Dillon.unfriend(Jessica);
		System.out.println(Dillon.getFriendNames());
		Dillon.unfriend(Marla);
		Dillon.unfriend(George);
		System.out.println(Dillon.getFriendNames());
	}
}

/*
Output:
Andrea, George, Marla, Asa, Jessica
Andrea, George, Marla, Asa
Andrea, Asa
Expected:
Andrea, George, Marla, Asa, Jessica
Andrea, George, Marla, Asa
Andrea, Asa
*/