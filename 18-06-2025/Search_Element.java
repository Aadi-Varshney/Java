import java.util.*;

public class Search_Element {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            // int [] arr={2,3,4,5,6,7};
            System.out.print("Enter Size of Array : ");
            int n =sc.nextInt();
            int [] arr=new int[n];

            for(int i=0;i<n;i++){
                int element=sc.nextInt();
                arr[i]=element;
            }

            // Print Array
            System.out.print("Array : ");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            System.out.println("Enter element to search : ");
            int Search_Element=sc.nextInt();
            int t = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==Search_Element){
                t=arr[i];
                System.out.println("Element Found :)");
                break;
            }
        }
        if(t!=n){
            System.out.println("Not Found :(");
        }
        
    }
    }
}
