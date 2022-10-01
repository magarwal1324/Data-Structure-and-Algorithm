package Array;
import java.util.Scanner;
public class kth_largest_el {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter integer: ");
        int key=sc.nextInt();
        sort(arr,n);
        System.out.println("kth largest element in the array "+arr[key+1]);
    }
    public static void sort(int arr[],int n) {
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
}
