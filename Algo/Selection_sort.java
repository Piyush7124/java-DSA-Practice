import java.util.*;

public class Selection_sort {
    public static void Sort( int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            //swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;

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

