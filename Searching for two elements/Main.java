import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int arr_size = sc.nextInt();
      int p,q;
      p=-1;q=-1;
      int arr[] = new int[arr_size];
      for(int i=0;i<arr_size;i++){
        arr[i]=sc.nextInt();
      }
      int a = sc.nextInt();
      int b = sc.nextInt();
      for(int i=0;i<arr_size;i++){
        if(arr[i]==a)
          p=i;
      }
      for(int i=0;i<arr_size;i++){
        if(arr[i]==b)
          q=i;
      }
      System.out.println(p);
      System.out.println(q);
    }
}