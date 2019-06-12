import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int arr_size = sc.nextInt();
    int arr[] = new int[arr_size];
    int num[] = new int[10];
    int i,count=0;
    for(i=0;i<10;i++)
      num[i]=0;
    for(i=0;i<arr_size;i++){
      arr[i]=sc.nextInt();
      ++num[arr[i]];
    }
    for(i=0;i<10;i++){
      if(num[i]>=count)
        count=i;
    }
    System.out.print(count);
  }
}