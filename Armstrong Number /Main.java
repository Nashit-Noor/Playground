import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	   // Type your code here
  	    Scanner in = new Scanner(System.in);
  	    int number = in.nextInt();
      	int originalNumber, remainder, result = 0, n = 0;
      
        for (originalNumber = number;originalNumber != 0; originalNumber /= 10, ++n);

        for (originalNumber = number;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
	}
}