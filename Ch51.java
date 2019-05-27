import java.util.Scanner;
public class Ch51{
	static double myPI=3.14159;
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	public static void main(String[] args){
		System.out.println(addThem(a,b));
	}
	public int addThem(int a,int b)
	{	
		
		
		int c=a+b;
		return c;
	}
}
