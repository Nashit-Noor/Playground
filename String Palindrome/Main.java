import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      int len = str.length();
      StringBuilder temp = new StringBuilder("");
      for(int i=len-1;i>=0;i--){
        temp.append(str.charAt(i));
      }
      if(str.equals(temp.toString()))
        System.out.print("Yes");
      else
        System.out.print("No");
    } 
}