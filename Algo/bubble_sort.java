import java.util.*;

public class bubble_sort {
    public static void Sort( int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }

public static void Print(int arr[]) {
    for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}    

    public static void main (String[] args){        
        int arr[]={33,55,9,4,77,566,774,55,99};
        Sort(arr);
        Print(arr);
    }
}
