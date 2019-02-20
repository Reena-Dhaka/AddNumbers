package addNumbers;

import java.io.*;
import java.util.Scanner;

public class AddNumbers {
	
	public static void Sum(int x, int y)
	{
		
		System.out.println(x + y);
	}

	public static void Sum(String x, String y)
	{
		
		System.out.println(x + y);
	}
	
	public static void ReadFromConsole()
	{

		try
		{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter your Alphabets");
					
		String str = s.nextLine();
		String str1=s.nextLine();
		
		Sum( str , str1);
		
		System.out.println("Please enter your Numbers");
		
		int n = Integer.parseInt(s.nextLine());
		int n1=Integer.parseInt(s.nextLine());
		
		Sum(n , n1);
		
		s.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	
	}

	public static void ReadFromFile()
	{
		try
		{
				
		FileReader fr = new FileReader("C:/Users/rdhaka.ORADEV/Documents/Sum.txt");
		 
		char [] a = new char[50];
	    fr.read(a); 
	  
	    String s = String.valueOf(a[0]);
	    String s1 = String.valueOf(a[1]);
	    System.out.println("Read from File and displaying Alphabets output");
	    Sum(s,s1);
	    s = String.valueOf(a[2]);
	    s1 = String.valueOf(a[3]);
	    System.out.println("Read from File and displaying Numbers output");
	   Sum( Integer.parseInt(s), Integer.parseInt(s1));  
	   
		fr.close();	
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		//FileWriter fw = new FileWriter(f);
		//fw.write();
		//fw.close();
	}
	public static void main(String[] args) 
	{
		System.out.println("Do you want input from file or Console. Type F for file and C for Console" );
		
		Scanner s1 = new Scanner(System.in);
		String value = s1.nextLine();
		switch(value)
		{
		case "F" :
			ReadFromFile();
			break;
		case "C" :
			ReadFromConsole();
			break;
		default :
			System.out.println("Sorry!!! you entered wrong input. EXITING");
		}

			
		s1.close();
			
			
	
		}
		
}
