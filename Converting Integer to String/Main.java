import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   	int i,temp;
    int length=0,flag=0;
    if(n<0){
      flag=1;
      n*=-1;
    }
    temp=n;
    while(n>0){
      length++;
      n/=10;
    }
    char str[] = new char[length];
    for(i=length-1;i>=0;i--){
      str[i]=(char)(temp%10 + '0');
      temp/=10;
    }
    if(flag==1){
      System.out.print("-");
      System.out.print(str);
    }
    else
      System.out.print(str);
  }
}