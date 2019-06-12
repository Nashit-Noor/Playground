import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int base = sc.nextInt();
      int exponent = sc.nextInt();
      System.out.println(exponents(base,exponent));
	}
  public static int exponents(int b, int e){
    	int result = 1;
        while (e != 0)
        {
            result *= b;
            --e;
        }
    	return result;
  }
}