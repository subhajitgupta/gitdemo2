import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;



	
public class AsciiValue {

    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String text =sc.next(); 
      char[] ch = text.toCharArray();
      for(char c:ch) {
    	  System.out.print((int)c);
      }
      
      System.out.println("Text added");
      System.out.println("Some more videos");
//      byte[] bytes = null;
//    try {
//      bytes = text.getBytes("US-ASCII");
//    } catch (UnsupportedEncodingException e) {
//      e.printStackTrace();
//    }
//      System.out.println("ASCII value of " + text + " is following");
//      System.out.println(Arrays.toString(bytes));      
//    }
}}

