
public class Quiz2 {

	public static void main(String[] args) {
		Question1();
		Question2();
		Question3();
		Question4();	
	}
		
	public static void Question1() {
		System.out.println("Question 1: ");
		int n=1;
		while (n<=5) {
			System.out.println(n);
			n++;
		} System.out.println();
	}
	
	public static void Question2() {
		System.out.println("Question 2: ");
		int number=1;
		int total=25;
		while (number<=(total/2)) {
			total=total-number;
			System.out.println(total+" "+number);
			number++;
		} System.out.println();
	}
		
	public static void Question3() {
		System.out.println("Question 3: ");
		int a=1;
		while (a<=2) {
			int b=1;{
				while (b<=3) {
					int c=1;{
						while (c<=4) {
							System.out.print("*");
							c++;
						}
					}System.out.print("!");
					b++;
				} 	
			}System.out.println();
			a++;
		}System.out.println();
	}
	
	public static void Question4() {
		System.out.println("Question 4: ");
		int number=4;
		int count=1;
		while(count<=number) {
			System.out.println(number);
			number=number/2;
			count++;
		}
	}

}


