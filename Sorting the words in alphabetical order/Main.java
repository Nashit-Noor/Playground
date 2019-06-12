import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int count;
    String temp;
    Scanner sc = new Scanner(System.in);
    count = sc.nextInt();
    String str[] = new String[count];

    for(int i = 0; i < count; i++)
      str[i] = sc.next();
    for(int i=0; i<count; i++)
        {
            for(int j=1; j<count; j++)
            {
                if(str[j-1].compareTo(str[j])>0)
                {
                    temp=str[j-1];
                    str[j-1]=str[j];
                    str[j]=temp;
                }
            }
        }
    for (int i = 0; i < count ; i++) 
      System.out.println(str[i].toLowerCase());
  }
}