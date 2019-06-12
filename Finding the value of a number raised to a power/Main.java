import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc = new Scanner(System.in);
      int base = sc.nextInt();
      int exponent = sc.nextInt();
      int num = 1;
      while(exponent>0){
        num = num*base;
        exponent--;
      }
      System.out.println(num);
    }
}