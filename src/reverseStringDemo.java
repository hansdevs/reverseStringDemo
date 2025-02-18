/*
CSCI 1302 Spring 2024
Chapter 17 Recursion Coding Exercise
Due date: 3/29/24 @ 11:59 pm
20 Points

Hans Gamlien

*/
import java.util.Scanner;

public class reverseStringDemo {

    public static void main(String[] args) {
       
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        
        System.out.println();
      
        String input = scanner.nextLine();
        
        System.out.print("The reverse of the string is: ");
        
        reverseString(input);
    }

    public static void reverseString(String str) {

    	if (str == null || str.length() <= 1) {
            
    		System.out.print(str); 
            
        } else {
        	
            System.out.print(str.charAt(str.length() - 1));
            
            reverseString(str.substring(0, str.length() - 1));
        }
    }
}
