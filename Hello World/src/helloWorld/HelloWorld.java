package helloWorld;
import java.util.Scanner;
import java.io.*;


public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		System.out.println("Enter data to process");
		
		Scanner in = new Scanner(System.in); 
		
        String s = in.nextLine(); 
        if(s.isEmpty())
        System.out.println("Please enter data");
        else
        {
        	 System.out.println("1");
        String delim= "[ ]";
        System.out.println("2");
        String[] data=s.split(delim);
        System.out.println("3");
        for (int i=0; !(data[i-1].isEmpty()); i++)
        {
        System.out.println(data[i]+data[i++]);
        
        }
        System.out.println("4");
        int number = Integer.parseInt( s );
        System.out.println("5");
        System.out.println(number);
        System.out.println("6");
        in.close();
        System.out.println("7");
        }
	}

		catch(NumberFormatException n)
		{
			System.out.println("User not entered number");
		}
}
}