import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		System.out.println("enter your number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int flag=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("prime no");
		}
		else
		{
			System.out.println("not prime");
		}
	}

}
