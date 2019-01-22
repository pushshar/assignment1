import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter your number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int ans=1;
		for(int i=1;i<=n;i++)
		{
			ans=ans*i;
		}
		System.out.println(ans);
		sc.close();
		
	}

}
