package stringOperations;

public class StringOperations {

	public static void main(String[] args) {
		
		//Store text value
		String value =" Username : Admin | Password : admin123 ";
		
		//Total chars available with in the String  ==> String.length();
		System.out.println("Total Chars in the String :"+value.length());
		
		//Get Specific char from specific index ==> String.charAt(Index);
		System.out.println("Char at 5th Index :"+value.charAt(5));
		
		//Reverse the String
		String reverseString="";
		
		for(int i=value.length()-1;i>=0;i--) {
			reverseString=reverseString+value.charAt(i);
		}
		System.out.println(reverseString);
		
		//Remove unwanted spaces from the String ==> String.trim();
		System.out.println("Normal Value:"+value);
		System.out.println("Trimmed Value:"+value.trim());
		
		//Remove all spaces from the String ==> String.replace(oldChar,newChar);
		System.out.println(value.replace(" ", ""));

		//Remove all alphabets from the String ==> String.replaceAll(regExp,newChar);
		System.out.println(value.replaceAll("[a-zA-Z]", ""));
		
		//Remove all numbers from the String ==> String.replaceAll(regExp,newChar);
		System.out.println(value.replaceAll("[0-9]", ""));

		//Remove all special chars from the String ==> String.replaceAll(regExp,newChar);
		System.out.println(value.replaceAll("[^a-zA-Z0-9]", ""));
		
		//Change the case of chars in String ==> String.toUpperCase(); , String.toLowerCase();
		System.out.println("Normal Value:"+value);
		System.out.println("Upper Case Value:"+value.toUpperCase());
		System.out.println("Lower Case Value:"+value.toLowerCase());
		
		// Extract part of String ==> value.subString(beginingIndex);value.subString(beginingIndex,endingIndex+1);
		System.out.println(value.substring(12,17));
		System.out.println(value.substring(31));

		// Extract part of String from dynamic text ==> value.split(expression);
		String [] splittedText = value.split(" ");
		System.out.println(splittedText[3]);
		System.out.println(splittedText[7]);
		
		// Compare the String values ==> equals (exact match),equalsIgnoreCase (exact match without case sensitive), contains (partial match), startWith(prefix),endsWith(trailing chars) 
		String name = "Bharath";
		System.out.println(name.equals("Bharath"));
		System.out.println(name.equals("bharath"));
		System.out.println(name.equalsIgnoreCase("bharath"));
		System.out.println(name.contains("hara"));
		System.out.println(name.contains("Hara"));
		System.out.println(name.startsWith("Bh"));
		System.out.println(name.endsWith("h"));




		
		
		
	}

}
