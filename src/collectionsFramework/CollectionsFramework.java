package collectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsFramework {
	
	// Array ==> Data type can store multiple values with similar data type together at one place
	
	// Challenges of Arrays
	
	// 1. Arrays are fixed in size
	// 2. Memory will be allocated at the beginning of creating array / static memory allocation
	// 3. Array allows similar data types only
	// 4. Modifications also not allowed
	
	//	String[] newEmpNames = new  String[4] ;
	//	newEmpNames[0]="Teja";
	//	newEmpNames[1]="Afreen";
	//	newEmpNames[2]="Arayan";
	//	newEmpNames[3]="Bharath";
		
	
	// Collections Framework
	
	// List ==> ArrayList, LinkedList
	
	// 1. List can store multiple values with similar data type together at one place by allocating memory dynamically
	// 2. List can follow dynamic memory allocation
	// 3. List allows modifications
	// 4. List allows duplicate values
	
	// Set ==> HashSet, LinkedHashSet, TreeSet
	
	// 1. Set can store multiple values with similar data type together at one place by allocating memory dynamically
	// 2. Set can follow dynamic memory allocation
	// 3. Set allows modifications
	// 4. Set won't allow duplicate values
	
	// Map ==> HashMap, LinkedHashMap, TreeMap & HashTable
	
	// 1. Map can store multiple values with different data type together in the form of key and value at one place by allocating memory dynamically
	// 2. Map can follow dynamic memory allocation
	// 3. Map allows modifications
	// 4. Map won't allow duplicate keys but values can be duplicate
	
	public static void main(String[] args) {
		
		
			String[] newEmpNames = new  String[4] ;
			newEmpNames[0]="Teja";
			newEmpNames[1]="Afreen";
			newEmpNames[2]="Arayan";
			newEmpNames[3]="Bharath";
		
	/*************ArrayList*************/
		
		System.out.println("*************ArrayList*************");
		
	//Syntax to Initialize/create: 	List<DataType> variable = new ArrayList<DataType>();
	//Syntax to add data: variable.add(value);
	//Syntax to remove the data:variable.remove(value);	
	//Syntax to get the data: variable.get(index);	
	//Syntax to get the total value : variable.size();	
		
	//Order of Storing Values: Insertion Order
	//Null Values : Allowed
				
		List<String> empNamesArrayList = new ArrayList<String>();	
		empNamesArrayList.add("Teja");
		empNamesArrayList.add("Afreen");
		empNamesArrayList.add("Arayan");
		empNamesArrayList.add("Bharath");
		empNamesArrayList.add("Teja");
		empNamesArrayList.add(null);
		empNamesArrayList.add(3,"Sushmitha");
		empNamesArrayList.remove("Bharath");
		System.out.println("ArrayList size is :"+empNamesArrayList.size());
		System.out.println(empNamesArrayList);

		
	/*************LinkedList*************/
		
		System.out.println("*************LinkedList*************");
		
	//Syntax to Initialize/create: 	List<DataType> variable = new LinkedList<DataType>();
	//Syntax to add data: variable.add(value);
	//Syntax to remove the data:variable.remove(value);	
	//Syntax to get the data: variable.get(index);	
	//Syntax to get the total value : variable.size();	
		
	//Order of Storing Values: Insertion Order
	//Null Values : Allowed
				
		List<String> empNamesLinkedList = new LinkedList<String>();	
		empNamesLinkedList.add("Teja");
		empNamesLinkedList.add("Afreen");
		empNamesLinkedList.add("Arayan");
		empNamesLinkedList.add("Bharath");
		empNamesLinkedList.add("Teja");
		empNamesLinkedList.add(null);
		empNamesLinkedList.add(3,"Sushmitha");
		empNamesLinkedList.remove("Bharath");
		System.out.println("LinkedList size is :"+empNamesLinkedList.size());
		System.out.println(empNamesLinkedList);
	}

}
