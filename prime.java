package Stringclass;

public class prime
{
public static void main(String[] args) 
{
	for (int i=2;i<=100;i++)
	{
		boolean flag=true;
		int no=i;
		
		for(int j=2;j<no;j++)
		{
			if(no%j==0)
			{
				flag=false;
				break;
			}
		}
		if (flag==true)
		{
			System.out.println(no +" its a prime number");
		}
		
		else
		{
			//System.out.println(no +"its not a prime number");
			continue;
		}
		}
	
}
}
