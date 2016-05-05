package practice;

import java.util.Scanner;


public class ReverseString {

	private static Scanner sc;
	public static void main(String[] args) {
		
		 sc = new Scanner (System.in);
		// Get string input from console
		System.out.println ("Enter string to reverse");
		String inString = sc.nextLine();
		String reverseString;
		String revStringAlt;
		String revStringRec;
		//get reverse string using function stringReverse()
		reverseString = stringReverse(inString);
		revStringAlt = stringReverseAlternate(inString);
		revStringRec = stringReverseRecursive(inString);
		System.out.println("Reverse is " +reverseString);
		System.out.println("Reverse is " +revStringAlt);
		System.out.println("Reverse is " +revStringRec);
		if(inString.equals(reverseString))
			System.out.println("String is palindrome");
	}
	
	private static String stringReverse(String orgnlString)
	{
		int strln = orgnlString.length();
		final char[] characters = new char[strln];
		final String revString;
		
		for (int i=0,j=strln-1;i<strln;i++,j--)
		{
			characters[i] = orgnlString.charAt(j);
			
		}
		 revString = new String(characters);
		
		return revString;
	}
	private static String stringReverseAlternate(String str)
	{
		StringBuilder strBuilder = new StringBuilder();
		//char[] strChar = str.toCharArray();
		char ch;
		for (int i= str.length()-1; i>=0; i--)
		{
			 ch = str.charAt(i);
			strBuilder.append(ch);
		}
		
		return strBuilder.toString();
	}
	
	private static String stringReverseRecursive(String str)
	{
		if (str.length()<2)
		{
			return str;
		}
		return stringReverseRecursive(str.substring(1)) + str.charAt(0);
	}
}
