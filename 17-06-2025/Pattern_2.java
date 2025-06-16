// Pattern 
//   *
//  * *
// * * *
import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            System.out.print("Enter Number :");
            int n = sc.nextInt();

            Pattern_2 f = new Pattern_2();
            
            f.BruteForce(n);
        }
    }

    public void BruteForce(int n){
        for(int i=1;i<=n;i++){

            for(int j=i;j<n;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
