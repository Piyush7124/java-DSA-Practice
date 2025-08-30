import java.util.*;

public class subarrays {
    public static void subarrays(int marks[]){
        int tp=0;
        for(int i=0;i<marks.length;i++){     //start
            for(int j=i;j<marks.length;j++){   // end
                for(int k=i;k<=j;k++){        //print
                    System.out.print(marks[k]+" ");
                }
                tp++;
                System.out.println();

            }
            System.out.println();
        }
        System.out.println("total pairs is "+tp);
    }

    public static void main(String args[]){
        int marks[]={2,4,6,8,10};
        subarrays(marks);
    

    }
    
}
