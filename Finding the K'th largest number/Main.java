import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      int i;
      for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
      int k = sc.nextInt();
      SelectionSort(arr);
      System.out.print(arr[k-1]);
    } 
  public static void SelectionSort(int arr[]){
    for (int i = 0; i < arr.length - 1; i++)  
    {  
      int index = i;  
      for (int j = i + 1; j < arr.length; j++){  
        if (arr[j] > arr[index]){  
          index = j;//searching for greater index  
        }  
      }  
      int greaterNumber = arr[index];   
      arr[index] = arr[i];  
      arr[i] = greaterNumber;  
    }  
  }
}