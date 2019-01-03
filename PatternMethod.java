import java.util.regex.*;
import java.util.*;
public class PatternMethod
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the desired pattern:" );
		String pattern=sc.nextLine();
		System.out.println("Enter the text: ");
		String matcher=sc.nextLine();
		Pattern myPattern2=Pattern.compile(pattern);
		Matcher myMatcher2=myPattern2.matcher(matcher);
		Boolean myBoolean2=myMatcher2.matches();
		boolean b = myBoolean2;
		if(b==true)
		{
			System.out.println("I found the text:"+myMatcher2.group()+"Starting at"+myMatcher2.start()+"\n"+"Ending at 				index:"+myMatcher2.end());
		}
		else if(b==false)
		{
			System.out.println("No match found");
		}
	}
	
}
