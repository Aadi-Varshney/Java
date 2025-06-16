// pattern
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 
import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Length/size of pattern : ");
            int n=sc.nextInt();

            Pattern_1 f=new Pattern_1();
            System.out.println("BruteForce -> ");
            f.BruteForce(n);

            System.out.println("Optimized -> ");
            f.Optimize(n);
        }
    }

    public void BruteForce(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public void Optimize(int n) {
    int row = 1;

    for (int i = 1; row <= n; i++) {
        System.out.print(i + " ");
        if (i == row) {
            System.out.println();
            row++;
            i = 0;
        }
        }
    }

}
