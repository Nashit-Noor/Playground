import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc = new Scanner(System.in);
      int arr_size=sc.nextInt();
      int arr[] = new int[arr_size];
      for(int i=0;i<arr_size;i++)
        arr[i]=sc.nextInt();
      subset(arr,arr_size);
    }
  public static void subset(int arr[],int n){
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        for(int k=j+1;k<n;k++){
          System.out.print("("+arr[i]+", "+arr[j]+", "+arr[k]+") ");
        }
      }
      if(i!=(n-3))
      	System.out.println();
    }
  }
}