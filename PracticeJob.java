
public class PracticeJob {

	public static void main(String[] args) {
		
		for(int i = 1;i<6;i++)
		{
			System.out.println(i+". Hello jenkins job!");
		}
		
		int x = 6;
		
		System.out.println("the number for :" + x+" is :"+call(x));

	}
	
	public static int call(int n)
	{
		if(n <= 0)
		{
			return 0;
		}
		else
		{
			return n + call(n-1);
		}
	}
}
