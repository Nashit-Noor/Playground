import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedHashSet;

class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder strb = new StringBuilder(str);
    String[] strWords = str.split("\\s+");
    LinkedHashSet<String> lhSetWords 
            = new LinkedHashSet<String>( Arrays.asList(strWords) );
        
        //join the words again by space
        StringBuilder sbTemp = new StringBuilder();
        int index = 0;
        
        for(String s : lhSetWords){
            
            if(index > 0)
                sbTemp.append(" ");
        
            sbTemp.append(s);
            index++;
        }
        System.out.println(sbTemp.toString());
  }
}