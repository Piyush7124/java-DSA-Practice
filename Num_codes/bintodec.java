package Num_codes;
import java.util.*;
public class bintodec {

    public static void bintodec(int binnum){
        int yes=binnum;
        int pow=0;
        int dec=0;
        while (binnum>0){
            int lastdigit=binnum%10;
            dec=dec+ (lastdigit* (int)Math.pow(2,pow));
            pow++;
            binnum=binnum/10;


        }
        System.out.println("the dec of "+yes+" is "+ dec);

    }
    public static void main(String args[]){
    bintodec(1111111);

    }
    
}
