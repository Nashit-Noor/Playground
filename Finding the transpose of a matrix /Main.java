import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    int i,j;
	Scanner s = new Scanner(System.in);
	int row = s.nextInt();
	int column = s.nextInt();
	int array[][] = new int[row][column];
	
 	for(i = 0; i < row; i++)
  	{
      for(j = 0; j < column; j++) 
      {
        array[i][j] = s.nextInt();
      }
  	}
  	
  	for(i = 0; i < column; i++)
    {
      for(j = 0; j < row; j++)
      {
        System.out.print(array[j][i]+" ");
      }
      System.out.println(" ");
    }
  }
}