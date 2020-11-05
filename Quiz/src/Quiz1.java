import java.util.*;
public class Quiz1 {
	
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		System.out.print("Enter your inches: ");
		int inches=in.nextInt();
		System.out.print("Enter your feet: ");
		int feet=in.nextInt();
		System.out.println("Male weight is: "+(50+(6*feet))+"kg");
		System.out.print("Female weight is: "+(40+(5*feet))+"kg");
	}
}