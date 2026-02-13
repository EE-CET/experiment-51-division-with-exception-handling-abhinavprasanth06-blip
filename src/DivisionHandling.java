import java.util.Scanner;

public class DivisionHandling{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    try{
	    int num1 = sc.nextInt();
	    int num2 = sc.nextInt();
	    int rem = num1/num2;
		System.out.println(rem);
	}
	catch(ArithmeticException e){
	    System.out.println("Divide by zero error");
	}
}
}
