import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int arr[]=new int[n];
      int i;
      for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
      int temp[]=new int[k];
      for(i=0;i<k;i++)
        temp[i]=0;
      for(i=0;i<n;i++){
        ++temp[arr[i]-1];
      }
      for(i=0;i<k;i++)
        System.out.println(i+1+" "+temp[i]);
    }
}