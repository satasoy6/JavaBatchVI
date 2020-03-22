package testPackage;

public class Q4 {
	public static void main(String[] args) {
		
		
//		Find out how many alpha characters are present in a String? 
//		Find number of words in string?
		
		String str = "dauh#sdge&wy^98213123";
		
		str = str.replaceAll("[^A-Za-z]", "");
		
		
		int number = str.length();
		System.out.println("Number of alpha character = "+number);
		
		String myString = "Today is Wednesday";
		String [] array = myString.split(" ");
		
		int words = array.length;
		
		System.out.println("Total count of words in  "+myString+" is "+words);
		
	}

}
