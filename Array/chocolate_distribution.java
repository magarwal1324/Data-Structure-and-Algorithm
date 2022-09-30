package Array;
import java.util.*;
public class chocolate_distribution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
System.out.println("Enter no of Student: ");
        int m=sc.nextInt();
        int min=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int cur_min=arr[m-1]-arr[j];
                if(cur_min>min){
min=cur_min;
                }
            }
        }
        System.out.println("Minimum Difference is "+min);

    }
}
