import java.io.InputStream;
import java.util.Scanner;

public class pivot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // System.out.println("Enter the key you want to search");
        // int k = sc.nextInt();

        System.out.println("Pivot of the array is: "+getPivot(arr, n));

    }

    public static int getPivot(int[] arr, int n){
        int s = 0;
        int e = n-1;
        int mid = (s+e)/2;

        while (s<e) {
            if (arr[mid]>= arr[0]) {
                s = mid+1;
            } else {
                e=mid;
            }
            mid = (s+e)/2;
        }
        return s;
    }
}
