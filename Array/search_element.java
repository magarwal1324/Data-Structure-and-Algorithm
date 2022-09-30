package Array;
import java.util.*;
class search{
    public void sort(int arr[],int n){
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
public int bin_search(int arr[],int n,int key,int l,int h){
    
int mid=(l+h)/2;
if(arr[mid]==key){
    return mid;
}
else if(arr[mid]<key){
    return bin_search(arr,n,key,mid+1,n-1);
}
else if(arr[mid]>key) {
    return bin_search(arr,n,key,0,mid-1);
}
else{
    return 0;
}
}
}
public class search_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Key Element:");
        int key=sc.nextInt();
        search s=new search();
        s.sort(arr,n);
System.out.println("After Sorting: ");
for (int i = 0; i < n; i++) {
    System.out.print(arr[i]+" ");
}
        int idx=s.bin_search(arr,n,key,0,n-1);
        System.out.println("Element "+key+" Found at "+idx);
    }
}
