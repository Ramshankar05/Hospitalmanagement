
public class NumberClassifier {
	public static int m(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum=sum+n%10;
			n=n/10;
			
		}
		return sum;
		
	}
	public static void main(String[]args)
	{
		int sum_a,a=1;
		while(a<=1000){
			sum_a=m(a);
			if(sum_a%2==0){
				System.out.println(a);
				
			}
			a=a+1;
		}
		}
	}


