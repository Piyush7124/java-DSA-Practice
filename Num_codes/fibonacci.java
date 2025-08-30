package Num_codes;
import java.util.Scanner;

public class fibonacci {
    public static void main (String Args[]){

        Scanner sc = new Scanner (System.in);
        System.out.println( " enter the n term :");
        int term= sc.nextInt();

        int first=0 ,second=1;
        

        System.out.println("the numbers are: ");

        for(int i=1;i<=term;i++){
            System.out.print(first+"");
            int next= first+second;
            first= second;
            second=next; 


        }




    }
}
