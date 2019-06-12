import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a = n/10;
      int b = n%10;
      System.out.println(a+b);
	}
}