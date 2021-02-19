import java.io.*;
import java.util.*;

public class PatternPrinting{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        
        String x=sc.nextLine(); //String input
        
        int i,j;
        
        int l=x.length();
        String y=x.substring(l/2)+x.substring(0,l/2); // Splitting words and merging them to print pattern easily
        
        for(i=0;i<l;i++)
        {
           
            for(j=i;j<l-1;j++)
            System.out.print(" "); //printing space
            System.out.print(y.substring(0,i+1)); //printing characters
            System.out.println();  //Printing new line
        }
        
     }
}//end of code