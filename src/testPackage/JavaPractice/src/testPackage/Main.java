package testPackage;

import java.util.EnumSet;

public class Main {

	
	 public static void main(String[] args) {
		 
		 // 1)  ==================
		 int []array = {1,2,3,4,5};
		 change(array);
		 print(array);
		 
		 
		 //2) ====================
		 // create a multi dimensional array with same num elements, then different
		 int[][] multiArray1 = {{1,2,3,4,5}, {6,7,8,9,0}, {0,9,8,7,6}};
		 int[][] multiArray2 = {{1,2,3}, {0}, {5,7,4,3}};
		 
		 System.out.println("Equal elements multi array:");
		 printMultiArray(multiArray1);
		 System.out.println("Unequal elements multi array");
		 printMultiArray(multiArray2);
		 
		 
		 //3) ======================
		 System.out.println("Method with unknown number of parameters");
		 System.out.println(average(1,2,3,4,5));
		 System.out.println(average(10,20,30));
		 System.out.println();
		 
		 
		 //4) ======================
		 // See timeFormat class declaration for private int hour, min, sec
		 timeFormat time1 = new timeFormat();
		 time1.setTime(14, 27, 23);
		 System.out.println("Military time: ");
		 System.out.println(time1.toMilitaryTime());
		 System.out.println("Normal time: ");
		 System.out.println(time1.toNormalTime() + "\n");
		 
		 
		 //5) ================================
		 // See enumeration class declaration
		 System.out.println("Printing out all the values in an Enumeration.");
		 for (enumeration people: enumeration.values()){
			 System.out.printf("%s\t%s\t%s\n", 
					 people, 
					 people.getDescription(), 
					 people.getAge());
		 }
		 System.out.println("\nEnumeration Set for the range of enumeration constants");
		 
		 for(enumeration people: EnumSet.range(enumeration.lix, enumeration.dalian)){
			 System.out.printf("%s\t%s\t%s\n", 
					 people, 
					 people.getDescription(), 
					 people.getAge());
		 }
		 
		 //6) =================================
		 
		 
	}
	 
// 1)  Adding 5 to each element in array and printing it
	 public static void change (int[] x){
		for (int counter=0; counter<x.length; counter++){
		 	x[counter]+=5;
		 }
	 }
	 public static void print(int[]x){
		 for (int y:x){
			 System.out.println(y);
		 }
		 System.out.println();
	 }
	 
	 
// 2)  Printing multidimensional array
	 public static void printMultiArray(int mArray[][]){
		 for (int row=0; row<mArray.length; row++){
			 for(int col=0; col<mArray[row].length; col++){
				 System.out.print(mArray[row][col] + "\t");
			 }
			 System.out.println();
		 }
		 System.out.println();
	 }

// 3) Method with unknown number of parameters
	public static int average(int...numbers){
		int total = 0;
		for(int x:numbers){
			total+=x;
		}
		total/=numbers.length;
		System.out.println();
		return total;
	}
	





	
	
} // End public class Test













