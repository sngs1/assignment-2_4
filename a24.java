package a5;

public class a24 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a=3;
		int b=75;
		int c=68; 
		int d=0;     // initialization
		// using if loop
		if (a>b)
		{
			if (a>c)
			{
				d=a;
			}
			else
			{
				d=c;
			}
			}
		else 
		{
			if(b>c)
			{
				d=b;
			}
			else
			{
				d=c;
			}
		}
		System.out.println("Highest number="+d);
		

	}

}
