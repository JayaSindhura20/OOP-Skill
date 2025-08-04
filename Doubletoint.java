package prgs;
import java.util.Scanner;
public class Doubletoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a double value: ");
        double a = sc.nextDouble();
        int b= (int)a;
        System.out.println("Double value is: "+a);
        System.out.println("Int value is : "+b);
	}

}
