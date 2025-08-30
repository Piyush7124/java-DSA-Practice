import java.util.*;

public class subarraysMax {
    public static void subarraysMax(int marks[]){
        int curr=0,max=Integer.MIN_VALUE;

        for(int i=0;i<marks.length;i++){     //start
            for(int j=i;j<marks.length;j++){    // end
                curr=0;                     
                for(int k=i;k<=j;k++){        //print
                    curr=curr+marks[k];
                }
                System.out.print(curr);
                if (max<curr){
                    max=curr;
                }
                
                System.out.println();

            }
            System.out.println();
        }
        System.out.println("max is"+max);
    }

    public static void main(String args[]){
        int marks[]={2,4,6,8,10};
        subarraysMax(marks);
    

    }
    
}
