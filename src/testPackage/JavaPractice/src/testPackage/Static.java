package testPackage;

/**
 * Static variables can be used when all objects
 * in a class share a common variable.
 * 	Ex)
 * An organization of women all have different member variables (names)
 * but all contribute to the total number of members.  One member can't see
 * the private instance variables of another member, but they can all see the
 * total number of members.
 * @author gnguy
 *
 */
public class Static {
	private String firstName;
	private String lastName;
	private static int numMembers = 0;		// total number of members
	
	public Static(String fn, String ln){
		firstName = fn;
		lastName = ln;
		numMembers++;
		System.out.printf
		("%s %s has joined the org.  Total members: %d\n", firstName, lastName, numMembers);
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	// Any method using static variables must also be declared static
	public static int getMembers(){
		return numMembers;
	}
}
