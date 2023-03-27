package Demo;

public class MyVibe 
{
	int a = 23;
	int b = 40;
	void add()
	{
		int sum =  a + b;
		System.out.print("this is addition - ");
		System.out.print(sum);
	}
	

	public static void main(String a[]) 
	{
		MyVibe v = new MyVibe();
		v.add();
	}
}
