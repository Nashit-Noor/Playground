import java.util.Scanner;
class Main 
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int arr_size=sc.nextInt();
    int arr[] = new int[arr_size];
    int i;
    for(i=0;i<arr_size;i++)
      arr[i]=sc.nextInt();
    int r = sc.nextInt();
    rotation(arr,arr_size,r);
    for(i=0;i<arr_size;i++)
      System.out.print(arr[i]+" ");
  }
  private static void rotation(int[] arr, int n, int r) {
    int odd[] = new int[n];
    int even[] = new int[n];
    int i,o=0,e=0;
    for(i=0;i<n;i=i+2)
      odd[o++]=arr[i];
    for(i=1;i<n;i=i+2)
      even[e++]=arr[i];
    int temp1=0,temp2=0;
    while(r>0) {
      temp1=odd[o-1];
      for(i=o-1;i>0;i--) {
        odd[i]=odd[i-1];
      }
      odd[0]=temp1;
      temp2=even[0];
      for(i=0;i<e-1;i++) {
        even[i]=even[i+1];
      }
      even[e-1]=temp2;
      r--;
    }
    int j=0;
    for(i=0;i<n;i=i+2) {
      arr[i]=odd[j++];
    }
    j=0;
    for(i=1;i<n;i=i+2) {
      arr[i]=even[j++];
    }	
  }
}