
import java.util.Scanner;

public class NumberProcessor {
	public  static  int m(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum=sum+n%10;
			n=n/10;
			
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter f name");
		int a=sc.nextInt();
		System.out.print("enter second");
		int b=sc.nextInt();
		x=m(a);
		y=m(b);
		System.out.println((x>y)?a:b);
	}

}



