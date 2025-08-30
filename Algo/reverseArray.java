import java.util.*;

public class reverseArray {
    public static void rev (int marks[]){
        int start=0, end=marks.length-1;
        while(start<end){
            int temp=marks[start];
            marks[start]=marks[end];
            marks[end]=temp;

            start++;
            end--;
        }
        
    }

    public static void main(String args[]){
        int marks[]={1,3,4,6,7,10,12,15,17,19};
        rev(marks);
        for(int i=0;i<marks.length;i++){
        System.out.print(marks[i]+" ");
        }
       

    }
    
}
