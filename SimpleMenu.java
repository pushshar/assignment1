import java.util.Scanner;

public class SimpleMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		System.out.println("enter 1-add \n 2-sub \n 3-multiply \n 4-divide \n any other to exit");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
        int a;
        int b;
		while(n<=5&&n>=0)
		{
			
		if(n==1)
			{
			System.out.println("enter two numbers");
			
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println(a+b);
			}
				
		if(n==2)
			{
			System.out.println("enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(a-b);
			}
		
		if(n==3)
			{
			System.out.println("enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(a*b);
			}
		
		if(n==4)
		{
			System.out.println("enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(a/b);
		}
		
		System.out.println("enter 1-add \n 2-sub \n 3-multiply \n 4-divide \n any other to exit");
		n=sc.nextInt();
		}
		
		sc.close();
	}

}
