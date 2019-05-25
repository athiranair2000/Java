import java.util.Scanner;
public class Ch41{
	static Scanner userinput=new Scanner(System.in);
	public static void main(String[] args){
		String contYorN="Y";
		int h=1;
		while(contYorN.equalsIgnoreCase("y")){
			System.out.println(h);
			System.out.println("Continue y or n? ");
			contYorN =userinput.nextLine();
			h++;
		}
}
}
