import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.print(square(n));
	} 
  public static int square(int n){
    return n*n;
  }
}