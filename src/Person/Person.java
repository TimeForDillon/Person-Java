package Person;
/**
 * A person with a name and friends.
 */
public class Person
{
	String name;
	String friends;
	
	/**
	 * Constructs a person with given name and no friends.
	 * @param name name of person
	 */
	public Person(String name)
	{
		this.name = name;
		friends = "";
	}
	
	/**
	 * Adds given person's name to string friends.
	 * @param p person to befriend
	 */
	public void befriend(Person p)
	{
		if(friends.isEmpty()) friends += p.name;
		else friends += (", " + p.name);
	}
	
	/**
	 * Removes given person's name from string friends.
	 * @param p person to unfriend
	 */
	public void unfriend(Person p)
	{
		friends = friends.replace((", " + p.name), "");
		friends = friends.replace(p.name, "");
	}
	
	/**
	 * List of friends names separated by commas.
	 * @return string friends
	 */
	public String getFriendNames()
	{
		return friends;
	}
}
