package testPackage;

public class Q6 {

	
	public static void main(String[] args) {
		
		//QUESTION
		//Write a Java Program to find whether a String is palindrome or not?
		
		// Palindrome is a string, which when read in both forward and backward way is same.
				//Example: madam, lol, pop, radar, rubber, etc.
				//Java program asks the user to provide a string input, and checks it for the Palindrome String.
				//Scanner class and its function nextLine() is used to obtain the input, and println() function is used to print on the screen.
		    //Scanner class is a part of java.util package, so we required to import this package in our Java program.
				//To check if a string is a palindrome or not, a string needs to be compared with the reverse of itself.
		    //Consider a palindrome string: radar,
		    //---------------------------
		    //index: 0 1 2 3 4
		    //value: r a d a r
		
		
		String str = "kayak";
		
		//1st way
		
		char [] charArray = str.toCharArray();
		
		String reverse = "";
		System.out.println(reverse.isEmpty());
		
		for (int i = charArray.length-1; i>=0 ; i--) {
			
			
		}
		
		
	}
}
