import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int first_digit = n/100;
      int last_digit = n%10;
      System.out.println(first_digit+last_digit);
	}
}