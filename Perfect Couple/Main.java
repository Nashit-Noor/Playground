import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc = new Scanner(System.in);
      int arr_size=sc.nextInt();
      int arr[] = new int[arr_size];
      for(int i=0;i<arr_size;i++)
        arr[i]=sc.nextInt();
      int value=sc.nextInt();
      perfect_couple(arr,arr_size,value);
    }
  public static void perfect_couple(int arr[],int n,int v){
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]+arr[j]==v){
          System.out.println(arr[i]+", "+arr[j]);
        }
      }
      //System.out.println();
    }
  }
}