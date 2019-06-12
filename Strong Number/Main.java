import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here\
      Scanner in = new Scanner(System.in);
      int Number = in.nextInt();
      int Temp, Remainder, Sum = 0, i, Factorial;
		Temp = Number;
		while( Temp > 0)
		{
			Factorial = 1; 
			i = 1; 
		    Remainder = Temp % 10;
		    while (i <= Remainder)
		    {
		     	Factorial = Factorial * i;
		     	i++;
		    }
		    Sum = Sum + Factorial;
		    Temp = Temp /10;
		}
		
		if ( Number == Sum )
		{
			System.out.println("Yes");
		}
		else
		{
		   System.out.println("No");
		}
	}
}