import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here 
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String rep = sc.nextLine();
      String inc = sc.nextLine();
      System.out.print(str.replace(rep,inc));
    }
}