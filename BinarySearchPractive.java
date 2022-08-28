import java.util.Scanner;

public class BinarySearchPractive {
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
        int index = bs(arr, n, k);
        System.out.println("index of key is: "+index);


    }

    static int bs(int[] arr, int size, int key){
        int start = 0;
        int end = size-1;

        int mid = (start+end)/2;

        while(start<=end){
            if (arr[mid]==key) {
                return mid;
            }

            if(key>arr[mid]){
                start = mid+1;
            }else{
                end=mid-1;
            }
            mid = (start+end)/2;
        }
        return -1;
    }
}
