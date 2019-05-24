import java.util.Scanner;
public class Ch2{
static Scanner userinput=new Scanner(System.in);

public static void main(String[] args){
    System.out.println("Your favourite number:");
    if(userinput.hasNextInt()){
        int numberEntered=userinput.nextInt();
        System.out.println("You entered "+numberEntered);
        }
    else{
        System.out.println("Enter an integer next time");
        }
}}
