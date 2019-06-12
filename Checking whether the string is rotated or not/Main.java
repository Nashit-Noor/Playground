import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      //StringBuilder strb = new StringBuilder(str);
      String temp = str1.concat(str1);
      if(temp.contains(str2))
        System.out.print("Yes");
      else
        System.out.print("No");         
    }
}