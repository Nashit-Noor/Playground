import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int f = n/100;
    int m = (n/10)%10;
    int l = n%10;
    System.out.println((l*100)+(m*10)+f);
  }
}