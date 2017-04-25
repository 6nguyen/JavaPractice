package testPackage;

/**
 * Enumeration creates an array of objects
 * 1) create the objects with the given type and values
 * 2) declare the instance variables
 * 3) create the constructor
 * 4) create accessor methods to access the instance variables
 */
public enum enumeration {
	george("the best", 24),
	lix("the hunk", 23),
	thom("the hulk", 22),
	dalian("the runt", 21),
	kebin("the incon", 20);
	
	private final String description;
	private final int age;
	
	enumeration(String description, int age){
		this.description = description;
		this.age = age;
	}
	
	public String getDescription(){
		return description;
	}
	
	public int getAge(){
		return age;
	}
}
