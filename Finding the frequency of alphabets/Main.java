import java.io.*;
import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int alpha[] = new int[26];
      int i,offset;
      for(i=0;i<26;i++)
        alpha[i]=0;
      String str = sc.nextLine();
      for(i=0;i<str.length();i++){
        if(str.charAt(i)>='a' && str.charAt(i)<='z'){
          offset = str.charAt(i)-'a';
          ++alpha[offset];
        }
        else if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
          offset = str.charAt(i)-'A';
          ++alpha[offset];
        }
      }
      int arr[] = new int[str.length()];
      for(i=0;i<str.length();i++){
        offset = str.toLowerCase().charAt(i)-'a';
        if(alpha[offset]!=0){
        	System.out.print(""+str.toLowerCase().charAt(i)+alpha[offset]+" ");
          alpha[offset]=0;
        }
      }
    }
}