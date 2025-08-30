import java.util.*;

public class largest_in_array{
    public static int Large(int marks[]){
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<marks.length;i++){
            if(marks[i]>largest){
                largest=marks[i];
            }
            
        }
        return largest;
    }

    public static void main(String args[]){
        int marks[]={1,3,4,6,7,10,12,87,15,17,99,19};
        System.out.println("the largest no. is "+Large(marks));

    }
    
}
