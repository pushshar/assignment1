import java.util.Scanner;

public class GradeEx {

	public static void main(String[] args) {
		
		int marks;
		System.out.println("enter your marks");
		Scanner sc=new Scanner(System.in);
		marks=sc.nextInt();
		if(marks>=50&&marks<60)
		{
			System.out.println("passed");
		}
		else if(marks>=60&&marks<=74)
		{
			System.out.println("first class");
		}
		else if(marks>75)
		{
			System.out.println("Distinction");
		}
		else
		{
			System.out.println("fail");
		}
		
		sc.close();

	}

}
