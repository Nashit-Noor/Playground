import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc = new Scanner(System.in);
      int ch = sc.nextInt();
      switch(ch){
        case 1:
          int side=sc.nextInt();
          System.out.println(side*side);
          break;
        case 2:
          int length=sc.nextInt();
          int breadth=sc.nextInt();
          System.out.println(length*breadth);
          break;
        case 3:
          int base=sc.nextInt();
          int height=sc.nextInt();
          System.out.println(0.5*base*height);
          break;
        case 4:
          int r=sc.nextInt();
          System.out.println(3.14*r*r);
          break;
      }
    }
}