import java.util.regex.*;
import java.util.*;
public class Roman{
	public static void main(String[] args){
		String text="When in Rome,do as the Romans";
		String textSplit[]=text.split(" ");
		Pattern myPattern=Pattern.compile("Ro.+");
		for(int i=0;i<textSplit.length;i++)
		{
			Matcher myMatcher=myPattern.matcher(textSplit[i]);
			boolean myBoolean=myMatcher.matches();
			System.out.println(myBoolean);
		}
	}
}
