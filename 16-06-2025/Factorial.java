import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Number :");
            int n = sc.nextInt();
        
        Factorial f=new Factorial();

        
        f.BruteForce(n);
        int v = f.Recursion(n);
        System.out.println(v);
        }
    }

    public void BruteForce(int n){

        int fact=1;
        
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);

    }

    public  int Recursion(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*Recursion(n-1);
        }
    }
}
