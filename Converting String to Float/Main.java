import java.util.Scanner;
import java.io.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int i;
    double n = 0.0,s=0.0;
    for(i=0;i<str.length();i++){
      if(str.charAt(i)>='0' && str.charAt(i)<='9'){
        n=n*10+str.charAt(i)-'0';
        s*=10.0;
      }
      else if(str.charAt(i)=='.'){
        s=1.0;
      }
    }
    n=n/(s==0.0?1.0:s);
    System.out.printf("%.6f",n);
  }
}