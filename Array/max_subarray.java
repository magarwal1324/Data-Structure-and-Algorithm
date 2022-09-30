package Array;
import java.util.*;
public class max_subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        subarray(arr,n);
    }
    public static void subarray(int arr[],int n) {
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            curr_sum=curr_sum+arr[i];
            if(curr_sum<0){
                curr_sum=0;
            }
            if(curr_sum>max_sum)
            max_sum=curr_sum;
        }
        System.out.println("Maximum Sum of Subarray: "+max_sum);
    }
}
