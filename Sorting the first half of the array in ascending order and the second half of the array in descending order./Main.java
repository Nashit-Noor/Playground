import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int i;
    for(i=0;i<n;i++)
      arr[i]=sc.nextInt();
    sortedArrayInTwoOrder(arr);
  }
  public static void sortedArrayInTwoOrder(int[] arr){
        
        int len=arr.length;
        int[] arr1 = new int[len/2];
        int[] arr2 = new int[len-len/2];
        for(int i=0;i<len/2;i++){
            arr1[i]=arr[i];
        }
        Arrays.sort(arr1);
        for(int j=len-1,k=0;j>=len/2 && k<=len-len/2;j--,k++){
            arr2[k] =arr[j];
        }
        Arrays.sort(arr2);
        for(int i=0;i<len;i++){
            if(i<len/2){
                arr[i]=arr1[i];
            }
            if(i>=len/2){    
                arr[i]=arr2[(len-i)-1];
            }
        }
        for (int var : arr) {
            System.out.print(var+" ");
        }
    }
}