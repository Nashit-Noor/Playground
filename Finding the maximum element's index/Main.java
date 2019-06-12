import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int i,index=0,max=0;
    for(i=0;i<n;i++)
      arr[i]=sc.nextInt();
    for(i=0;i<n;i++)
      if(arr[i]>=max){
        max=arr[i];
        index=i;
      }
    System.out.println(index);
  }
}