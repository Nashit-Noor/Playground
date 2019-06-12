import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int arr_size=sc.nextInt();
    int arr[]=new int[arr_size];
    int i,max_ending_here=0,max_so_far=0;
    for(i=0;i<arr_size;i++)
      arr[i]=sc.nextInt();
    int max=0;
    for (i = 0; i < arr_size; i++) 
    { 
      max_ending_here = max_ending_here + arr[i]; 
      if (max_so_far < max_ending_here) 
        max_so_far = max_ending_here; 
      if ((i!=arr_size-1) && arr[i+1]<arr[i]) 
        max_ending_here = 0; 
    } 
    System.out.print(max_so_far); 
  }
}