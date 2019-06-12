import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner sc = new Scanner(System.in);
      int arr_size = sc.nextInt();
      int arr[] = new int[arr_size];
      int i,count=0,temp=0;
      for(i=0;i<arr_size;i++){
        arr[i]=sc.nextInt();
        if(arr[i]==1)
          temp++;
        else if(count<temp){
          count=temp;
          temp=0;
        }
      }
      System.out.print(count);
    }
}