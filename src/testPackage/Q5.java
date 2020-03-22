package testPackage;



public class Q5 {
	
	//Write a java program to reverse String? Reverse a string word by word?
	
	public static void main(String[] args) {
		
		
		String given = "I love Java";
		String reversed = "";
		
		for (int i = given.length()-1 ; i>=0; i--) {
			
			reversed = reversed+given.charAt(i);
		}
		
		
		System.out.println("Reversed String ="+reversed);
		
		// Other way
		
		String [] array = given.split(" ");
		String reverseWords = "";
		
		for (int i = array.length-1; i >=0 ; i--) {
			reverseWords = reverseWords + array [i]+" ";
			
		}
		System.out.println(reverseWords);
	}

}
