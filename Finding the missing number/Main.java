import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[]=new int[n];
      int i,j;
      for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
      for(i=1;i<=n;i++){
        int flag=0;
        for(j=0;j<n;j++){
          if(arr[j]==i)
            flag=1;
        }
        if(flag==0)
          System.out.print(i);
      }
    }
}