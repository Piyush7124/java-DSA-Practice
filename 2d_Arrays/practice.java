/*Print the number of 7’s that are in the 2d array.
Example :
Input - int[][] array = { {4,7,8},{8,8,7} }; */

public class practice{

    public static int prac(int[][] array){
        int num=0;
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                if (array[i][j]==7){
                    num++;
                }
            }
        }
        return num;

    }

    public static void main(String [] args){
        
        int[][] array= {{7,7,7},{7,7,7}};
        System.out.println(prac(array));

    }

}