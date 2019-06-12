import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int max = maximum(a,b);
      System.out.println(maximum(max,c));
	}
  public static int maximum(int a,int b){
    if(a>b)
      return a;
    else
      return b;
  }
}