package week1.day2;

public class Palindrome {
	//Build a logic to find the given string is palindrome or not

	/*
	 * Pseudo Code

	 * a) Declare A String value as"madam"

	 * b) Declare another String rev value as ""
	 * c) Iterate over the String in reverse order
	 * d) Add the char into rev
	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 

	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
	 */

	public static void main(String[] args) {
		String value="Madam";
		String rev="";
		char[] charArray = value.toCharArray();
		for (int i=0;i<charArray.length;i++)
		{			
			//System.out.println(charArray[i]);
			rev=(charArray[i])+ rev;
		}
		//System.out.println(rev);

		if(value.equalsIgnoreCase(rev))
		{
			System.out.println("'"+value+"'"+ " Palindrome");
		}
		else
		{
			System.out.println("'"+value+"'"+ " Not Palindrome" );
		}
	}

}
