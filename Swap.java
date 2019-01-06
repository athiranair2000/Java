import java.util.*;
public class Swap{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 1rst number");
		a=sc.nextInt();
		System.out.println("Enter 2nd number");
		b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("After swap a:"+a+" "+"andb:"+b);
	}
}
		
		
		
