import java.util.Scanner;

public class stringReversed {

	public static void main(String[] args) {
		
		String input;  
		Scanner scanner=new Scanner(System.in);  
		System.out.print("Enter a String: ");  
		input=scanner.nextLine(); //reading string from user  
		
		System.out.print("After reverse string is: ");  
		for(int i=input.length();i>0;--i)                //i is the length of the string  
		{  
		System.out.print(input.charAt(i-1));            //printing the character at index i-1  
		}  
		}  

	

}
