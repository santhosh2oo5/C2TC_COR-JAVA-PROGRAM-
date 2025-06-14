package day1;
import java.util.Scanner;

public class additional {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("enter a:");
		a = sc.nextInt();
				
	    System.out.println("enter b:");
		b = sc.nextInt();
		c=a+b;
	System.out.println("addition of a="+a+" and b="+b+" is  "+c);
	}

}
