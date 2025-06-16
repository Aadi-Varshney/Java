
import java.util.Scanner;

public class Reverse_no {
    public static void main(String[] args) {
        try (Scanner sc =new Scanner(System.in)){

            Reverse_no f=new Reverse_no();

            System.out.print("Number : ");
            int num = sc.nextInt();

            f.BruteForce(num);
        }
    }

    public void BruteForce(int n){
        // n=543
        // n=345
        int revNum=0;
        while(n!=0){
            int digit=n%10;
            revNum=revNum*10+digit;
            n/=10;
        }

        System.out.println("Reverse Number : "+revNum);
    }
}
