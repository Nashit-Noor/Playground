import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int g = gcd(a,b);
      System.out.println(gcd(g,c));
	}
  public static int gcd(int a, int b){
    int g_c_d = 0;
    for(int i=1;i<=a && i<=b ;i++){
      if(a%i==0 && b%i==0)
        g_c_d=i;
    }
    return g_c_d;
  }
}