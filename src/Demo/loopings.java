package Demo;

public class loopings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int count = 0;
		int count1 = 0;
		/*while(i<=100)
		{
			if(i%2==0)
			{
				System.out.println(i+"is even");
				count = count + 1;
				
			}
			else 
			{
				System.out.println(i+"is odd");
				count1 = count1 + 1;
				
			}
			i=i+1;
		}
		System.out.println(count);
		System.out.println(count1);*/
		while(i<=5) 
		{
			int j =1;
			while(j<=5-i+1) 
			{
				System.out.print("*");
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
		int t = 1;
		while(t<=5) 
		{
			int k =1;
			while(k<=t) 
			{
				System.out.print((char)(64+t));
				k = k + 1;
			}
			System.out.println();
			t = t + 1;
		}
	}

}
