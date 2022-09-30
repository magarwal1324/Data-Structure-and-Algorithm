package Array;
import java.util.*;
class arr{
    public boolean check_arr(int arr[],int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j]){
    return true;
                }
            }
        }
        return false;
    }
}
public class contain_duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
arr a=new arr();
if(a.check_arr(arr, n)){
System.out.println("True");
}
else{
    System.out.println("False");
}
    }

}
