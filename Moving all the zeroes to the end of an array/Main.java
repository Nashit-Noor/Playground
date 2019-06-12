import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc = new Scanner(System.in);
      int arr_size=sc.nextInt();
      int arr[] = new int[arr_size];
      int i;
      for(i=0;i<arr_size;i++)
        arr[i]=sc.nextInt();
      Move_zero(arr,arr_size);
      for(i=0;i<arr_size;i++)
        System.out.print(arr[i]+" ");
    }
  public static void Move_zero(int arr[],int n){
    int i,a=0;
    int arr1[] = new int[n];
    for(i=0;i<n;i++){
      if(arr[i]>0){
        arr1[a++]=arr[i];
      }
    }
    for(i=0;i<a;i++){
      arr[i]=arr1[i];
    }
    for(i=a;i<n;i++)
      arr[i]=0;
  }
}