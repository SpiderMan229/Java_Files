import java.util.Scanner;
class PerfectSq
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number:");
		int num=sc.nextInt(); //81
		double num2=Math.sqrt(num);//9.0
		int num3=(int)num2;//9
		if(num2==num3)
		
			System.out.println(num+"  is a perfect Square");
		else
			System.out.println(num+" not a perfect Square");
               System.out.println("code executed successfully");
		
		
	}
	
}
		