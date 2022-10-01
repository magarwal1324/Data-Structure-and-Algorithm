package Array;
import java.util.*;
public class buy_sell_stock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int max_p=0;
        int cur_p=0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i; j < n; j++) {
                if(arr[i]<arr[j]){
                    cur_p=arr[j]-arr[i];
                }
                if(cur_p>max_p){
                    max_p=cur_p;
                }

            }
            
        }
        System.out.println(max_p);

    }
}
