import java.util.*;

public class Binary_search {
    public static int Binary(int marks[],int key){
        int start=0; 
        int end=marks.length-1;
        
        for(int i=start;i<=end;i++){
            int mid=start+end/2;
            if(marks[mid]==key){
                return mid;
            }
            else if(marks[mid]<key){
                start=mid+1;
            } else{
                end=mid-1;
            }
            
        }
        return -1;
    }

    public static void main(String args[]){
        int marks[]={1,3,4,6,7,10,12,15,17,19};
        
        System.out.println("the key is at "+Binary(marks,19));
        

    }
    
}
