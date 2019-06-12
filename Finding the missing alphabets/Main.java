import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      int alpha[] = new int[26];
      int i,offset;
      for(i=0;i<26;i++)
        alpha[i]=0;
      for(i=0;i<str.length();i++){
        if(str.toLowerCase().charAt(i)!=32){
          offset=str.toLowerCase().charAt(i)-'a';
          ++alpha[offset];
        }
      }
      char p=0;
      for(i=0;i<26;i++){
        if(alpha[i]==0){
          p=(char)('a'+i);
          System.out.print(p+" ");
        }
      }
    }
}