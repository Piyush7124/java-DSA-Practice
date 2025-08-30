import java.util.*;
public class optPrime {
    public static boolean isPrime(int n) {
        if(n==2){
            System.out.println("is prime no");
            return (true);
            
        }
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0){
                System.out.println("is not prime no");
                return false;
            }
        }
        System.out.println("is prime no");
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check");

        int n=sc.nextInt();
    
        System.out.println(isPrime(n));

    }

    
}