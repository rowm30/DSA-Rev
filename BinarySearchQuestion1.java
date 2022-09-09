import java.util.Scanner;


public class BinarySearchQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key you want to search");
        int k = sc.nextInt();

        System.out.println("first occurance of key is");
        System.out.println(fo(arr, n, k));
        System.out.println("Last occurance of key is");
        System.out.println(lo(arr, n, k));
    }

    static int fo(int[] arr, int n, int key){
        int s = 0, e = n-1;
        int mid = (s + e)/2;
        int ans = -1;
        while (s<=e) {
            if (arr[mid]==key) {
                ans = mid;
                e = mid-1;
            } else if (key> arr[mid]) {//right mai jao
                s = mid +1;
            }else if(key < arr[mid]){//left mai jao
                e = mid -1;
            }
            mid = (s + e)/2;
        }
        return ans;
    }
    static int lo(int[] arr, int n, int key){
        int s = 0, e = n-1;
        int mid = (s + e)/2;
        int ans = -1;
        while (s<=e) {
            if (arr[mid]==key) {
                ans = mid;
                s = mid+1;
            } else if (key> arr[mid]) {//right mai jao
                s = mid +1;
            }else if(key < arr[mid]){//left mai jao
                e = mid -1;
            }
            mid = (s + e)/2;
        }
        return ans;
    }
}
