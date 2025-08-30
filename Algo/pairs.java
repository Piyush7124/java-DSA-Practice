import java.util.*;

public class pairs {
    public static void pairs(int marks[]){
        int tp=0;
        for(int i=0;i<marks.length;i++){
            int curr=marks[i];
            for(int j=i+1;j<marks.length;j++){
                System.out.print("("+curr+","+marks[j]+")");
                tp++;



            }
            System.out.println();
        }
        System.out.println("total pairs is "+tp);
    }

    public static void main(String args[]){
        int marks[]={1,3,4,6,7,10,12,15,17,19};
        pairs(marks);
    

    }
    
}
