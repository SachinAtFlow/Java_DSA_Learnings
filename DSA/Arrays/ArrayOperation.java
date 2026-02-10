// import java.util.*;

public class ArrayOperation {
    public static void LinearSearchNum(int arr[], int key) { // Time Complexity=O(n)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("We found the key at " + i + " index");
                return;
            }

        }
        System.out.println("Key Not Found");
    }

    public static void LinearSearchFood(String arr[], String key) { // Time Complexity=O(n)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("We found the key at " + i + " index");
                return;
            }

        }
        System.out.println("Key Not Found");
    }

    public static int largestInt(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int binarySearch(int arr[], int key) { // Time Complexity=O(log n)
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // compare
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            }

        }

        return -1;
    }

    public static void reverseArray(int arr[]) {
        int st = 0;
        int end = arr.length - 1;
        while (st < end) {
            int temp = 0;
            temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // pairing the elements of a array
    public static void pairing(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + " , " + arr[j] + ")");
            }
            System.out.println();
        }
    }

    // printing subarrays
    public static void subarray(int arr[]) {
        for (int i = 0; i <arr.length; i++) {
            for (int j = i ; j < arr.length; j++) {
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        int num[] = { 2, 4, 6, 8, 10};
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 86 };
        int Numkey=86;
        LinearSearchNum(numbers, Numkey);
        String food[]={"samosa","kachori","chai","halwa"};
        String foodKey="coffee";
        LinearSearchFood(food, foodKey);
        System.out.println(largestInt(numbers));
        int found=binarySearch(numbers, Numkey);
        System.out.println(found);
        reverseArray(numbers);
        pairing(num);
        subarray(num);
    }
}
