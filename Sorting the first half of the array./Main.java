import java.util.*;

class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
 	int arr[]=new int[n];
    int i;
    for(i=0;i<n;i++)
      arr[i]=sc.nextInt();
    int mid;
    mid = n/2;
    int temp[]=new int[mid];
    for(i=0;i<mid;i++)
      temp[i]=arr[i];
    sort(temp,arr,mid,n);
  }
  public static void sort(int temp[],int arr[], int mid,int n){
    Arrays.sort(temp);
    int i;
    for(i=0;i<mid;i++)
      arr[i]=temp[i];
    for(i=0;i<n;i++)
      System.out.print(arr[i]+" ");
  }
}