import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String remv = sc.nextLine();
    for(int i=0;i<remv.length();i++){
      for(int j=0;j<str.length();j++){
        if(remv.charAt(i)==str.charAt(j)){
          str = str.substring(0, j) + str.substring(j + 1);
        }
      }
    }
    System.out.print(str);
  }
}