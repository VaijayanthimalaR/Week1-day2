package week1.day2;


import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// To verify the given string is anagram or not
		String str1="hello";
		String str2="oellH";
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(arr1);
		System.out.println(arr2);
		/*
		 * if (arr1.equals(arr2)) {System.out.println("Anagram");} else
		 * {System.out.println("Not Anagram");}
		 */
		boolean anagram=true;
		for(int i=0;i<=arr1.length-1;i++) {
			if (arr1[i]!=arr2[i]) 
			{anagram=false;break;}
		}
		if(anagram){System.out.println("Anagram");}
		else {System.out.println("Not Anagram");}
	}


}
