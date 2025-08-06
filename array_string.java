package prgs;
import java.util.Scanner;
public class array_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char[] a = {'j','b','c','d','e'};
       String str = "sindhu";
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter a string: ");
       String input = sc.nextLine();
       System.out.println(str);
       System.out.println(input);
       String c= new String(a);
       System.out.println(c);
	}

}
