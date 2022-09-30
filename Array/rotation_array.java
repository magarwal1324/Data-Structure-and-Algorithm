package Array;

import java.util.Scanner;

public class rotation_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Number of Rotation:");
        int d=sc.nextInt();
        for (int i = 0; i <d; i++) {
            int last=arr[0];
            for (int j = 0; j < n-1; j++) {
                arr[j]=arr[j+1];
                
            }
            arr[n-1]=last;
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    
    }
}
