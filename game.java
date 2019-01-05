import java.util.*;
public class game{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter your choices");
		int choice;
		choice=sc.nextInt();
		switch(choice){
			case 1:
			System.out.println("Play the game");
			break;
			case 2:
			System.out.println("Show me instructions");
			break;
			case 3:
			System.out.println("Exit");
			break;
			default:
			System.out.println("please type any of these choice");
		}
	}
}

