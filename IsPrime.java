package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int n=7;
		boolean prime=false;
		for (int i=2;i<n;i++)
		{
			if (n%i==0) {
				prime=false;
				break;
			}
			else {prime=true;}
		}
		if (prime){
			System.out.println("prime");
		}
		else
		{	System.out.println("not prime");}
	}

}