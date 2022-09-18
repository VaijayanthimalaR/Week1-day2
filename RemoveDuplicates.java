package week1.day2;

public class RemoveDuplicates {
	/*
	 * Pseudo code 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 * g) Displaying the String without duplicate words	
	 */

	public static void main(String[] args)
	{
		String text = "We learn java basics as part of java sessions in java week1";	
		int count=0;
		String[] arr=text.split(" ",0);

		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				//System.out.println(arr[i]);
				//System.out.println(arr[j]);
				if(arr[i].equals(arr[j]))
				{				
					count=	count+1;
					//System.out.println(arr[i]);
				}
			}
			if (count>0) 
			{
				text =text.replace(arr[i], "");
			}
			count=0;
		}
		System.out.println(text);
	}

}
