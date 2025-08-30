import java.util.*;

public class linearsearch {
    public static int linearsearch(int marks[],int key){
        for(int i=0;i<=marks.length;i++){
            if(marks[i]==key){
                return i;
            }
            
        }
        return -1;
    }

    public static void main(String args[]){
        int marks[]={1,3,4,6,7,10,12,15,17,19};
        System.out.println("the key is at "+linearsearch(marks,10));

    }
    
}
