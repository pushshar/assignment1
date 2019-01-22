import java.util.Scanner;

public class MenuObj {
	public void add(int a,int b)
	{
		
			System.out.println(a+b);
		}
			
	public void sub(int a,int b)
		{
	System.out.println(a-b);
		}
	
	public void mul(int a,int b)
		{
		
	System.out.println(a*b);
		}
	
	public void divide(int a, int b)
	{
		
	System.out.println(a/b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter 1-add \n 2-sub \n 3-multiply \n 4-divide \n any other to exit");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
        int a;
        int b;
        while(n<1&&n>4)
        {
        	System.out.println("enter two numbers");
        
		
		a=sc.nextInt();
		b=sc.nextInt();
		MenuObj o=new MenuObj();
		if(n==1)
		 o.add(a, b);
		else if(n==2)
			o.add(a, b);
		else if(n==3)
			o.add(a, b);
		else if(n==4)
			o.add(a, b);
		else
			System.out.println("end of program");
        }
        
		sc.close();

	}

}
