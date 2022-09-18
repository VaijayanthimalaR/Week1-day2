package week1.day2;

public class Reversestring {

	public static void main(String[] args) {
		// To Reverse the given string
		String str="Test Leaf";
		String result="";
		char ch;
		for (int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			result=ch + result;
		}
		System.out.println(result);
	}

}
