
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Number :");
            int n = sc.nextInt();
        
        Fibonacci f=new Fibonacci();

        f.BruteForce(n);
        }
    }

    public void BruteForce(int n){
        int a=0;
        int b=1;
        
        if(n==1){
            System.out.print(a);
        }
        if(n>=2){
            System.out.print(a+" "+b);
        }
        int c;
        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
        }
    }
}
