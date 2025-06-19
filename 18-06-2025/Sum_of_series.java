import java.util.*;

public class Sum_of_series {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter base Number : ");
            int x=sc.nextInt();

            System.out.print("Enter Power Number : ");
            int n=sc.nextInt();

            Sum_of_series f=new Sum_of_series();
            f.BruteForce(x, n);

            int s=f.Recursion(x, n);
            System.out.println(s);
        }
    }

    public void BruteForce(int x,int n){
        int sum=0;
        while(n>=0){
            sum+=Math.pow(x, n);
            n--;
        }
        System.out.println(sum);
    }

    public int Recursion(int x,int n){
        if(n<0){
            return 0;
        }
        return (int)Math.pow(x, n)+Recursion(x, n-1);
    }
}
