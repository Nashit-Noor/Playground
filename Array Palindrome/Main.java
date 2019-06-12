import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int arr_size=sc.nextInt();
      int arr[]=new int[arr_size];
      int i;
      for(i=0;i<arr_size;i++)
        arr[i]=sc.nextInt();
      int left=0;
      int right=arr_size-1;
      int flag=0;
      while(left<right){
        if(arr[left]!=arr[right])
          flag=1;
        left++;
        right--;
      }
      if(flag==0)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}