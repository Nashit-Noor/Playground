import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      String str=sc.nextLine();
      reverse_string(str);
    }
    // Function to reverse a string
    public static void reverse_string(String sb)
    {
        // Type your code here
      String words[] = sb.split("\\s");
      String ab = "";
      for(int i=words.length-1;i>=0;i--){
        ab = ab + words[i] + " ";
      }
      System.out.print(ab);
    }
}