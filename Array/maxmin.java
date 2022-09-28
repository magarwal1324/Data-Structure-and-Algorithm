package Array;

import java.util.*;
class findmaxmin{
public void meth(int arr[],int n){
    int max=arr[0];
    int min=arr[0];
    for (int i = 0; i < n-1; i++) {
        if(arr[i+1]>max){
            max=arr[i+1];
        }
        if (arr[i+1]<min) {
            min=arr[i+1];
        }
    }
    System.out.println("Maximum Element in Array: "+max);
    System.out.println("Minimum Element in Array: "+min);
}
}
public class maxmin{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Size of Array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter Elements: ");
for (int i = 0; i < n; i++) {
    arr[i]=sc.nextInt();
}
findmaxmin ob=new findmaxmin();
ob.meth(arr,n);
}
}