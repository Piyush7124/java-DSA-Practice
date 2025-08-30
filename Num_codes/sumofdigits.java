package Num_codes;
import java.util.*;

public class sumofdigits {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the Number:");
        int Number= sc.nextInt();

        int sum=0;
        
    

        while(Number!=0){
            int digit=Number %10;
            sum = sum+digit;
            Number/=10;
         }

         System.out.println("the sum of the number is:"+sum);



    }
    
}
