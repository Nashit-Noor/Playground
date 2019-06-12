import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[]= new int[n];
    int i,j,k,flag=0;
    for(i=0;i<n;i++)
      arr[i]=sc.nextInt();
    for(i=0;i<n;i++){
      for(j=i+1;j<n;j++){
        if(arr[j]>arr[i]){
          for(k=i+1;k<j;k++){
            if(arr[k]>arr[i] && arr[k]>arr[j])
              flag=1;
          }
          if(flag==0)
          	System.out.println(arr[i]+","+arr[j]);
          else
            flag=0;
        }
      }
    }
  }
}