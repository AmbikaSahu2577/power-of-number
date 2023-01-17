import java.util.Scanner;
class power_of_Number_Example
{
	public static void main(String[] args) 
	{
		int num,pow,res=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		num = sc.nextInt();
		System.out.println("enter power");
		pow = sc.nextInt();
		for (int i=1;i<=pow;i++) 
		{
			res = num*res;
		}
		System.out.println(res);
	}
}