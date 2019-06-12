import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      prime(n);
	}
  public static void prime(int n){
    for(int i=1;i<=n;i++)
        {
            int p=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                    p++;
            }
            if(p==2)
                    System.out.println(i);
 
        }
  }
}