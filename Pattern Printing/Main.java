import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner sc = new Scanner(System.in);
      int row = sc.nextInt();
      int column = sc.nextInt();
      for (int i = row; i > 0; i--)
      {
        for (int j = column; j > i; j--)
        System.out.print(j);
        for (int j = i; j > 0; j--)
          System.out.print(i);
        System.out.println();
      }
    }
}