package testPackage;

/**
 * Static variables can be used when all objects
 * in a class share a common variable.
 * 	Ex)
 * An organization of women all have different member variables (names)
 * but all contribute to the total number of members.
 * @author gnguy
 *
 */
public class Static {
	private String firstName;
	private String lastName;
	private static int numMembers = 0;
	
	public Static(String fn, String ln){
		firstName = fn;
		lastName = ln;
		numMembers++;
		System.out.printf("%s %s is a member in the total "
				+ "organization size of %i", firstName, lastName, numMembers);
	}
}
