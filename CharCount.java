package week1.day2;

public class CharCount {

	public static void main(String[] args) {
		// To count the number of occurence for given character in given string
		String str = "cognizantc";
		char ch = 'c'; // 1
		char[] charArray=str.toCharArray();
		int count=0;
		for (int i=0;i<str.length();i++) 
		{
			if (charArray[i]==ch) 
			{count++;}
		}
		System.out.println(count);                 


	}

}
