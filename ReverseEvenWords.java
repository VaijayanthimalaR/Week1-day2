package week1.day2;

public class ReverseEvenWords {
	//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String[] arr = test.split(" ");
		String result="";
		for (int i=0;i<arr.length;i++)
		{
			if (i%2==0)
			{
				result=result +arr[i];
			}
			if(i%2!=0)
			{
				String rev="";
				for (int j=0;j<arr[i].length();j++)
				{
					rev=arr[i].charAt(j) +rev;
				}
				result=result + " " + rev +" ";
			}

		}
		System.out.println(result);


	}

}
