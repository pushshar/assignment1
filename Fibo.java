import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		System.out.println("enter your number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a=0;
		int b=1;
		int c;
		if(n<=0)
		{
			System.out.println("input a valid number");
		}
		else if(n==1)
		{
			System.out.println(a);
		}
		else if(n==2)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(a);
			System.out.println(b);
			for(int i=3;i<=n;i++)
			{
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
			
			}
		
		
		
		sc.close();
}
	}

