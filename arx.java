import java.util.Scanner;

class Search {
    // Linear search works on a sorted array or an unsorted array
    public void linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at Index " + i);
                return;
            }
        }
        System.out.println("Element not found in the array");
    }

    // To perform binary search, the array should be sorted
    public void binarySearch(int[] arr, int element) {
        int l = 0, r = arr.length - 1, mid;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (arr[mid] == element) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (arr[mid] < element) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        System.out.println("Element not found");
    }

    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, choice;
        int[] arr;
        Search search = new Search();

        System.out.println("MENU DRIVEN ARRAY SORT-SEARCH PROGRAM");
        System.out.println("ALGORITHM       -   Time Complexity");
        System.out.println("1.) Linear Search  - O(n)");
        System.out.println("2.) Binary Search  - O(logn)");
        System.out.println("3.) Bubble sort    - O(n^2)");

        System.out.println("Enter the size of the array:");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter " + n + " elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter your choice:");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Searching Algorithm : Linear Search");
                System.out.println("Enter the Key to search:");
                int key = sc.nextInt();
                search.linearSearch(arr, key);
                break;

            case 2:
                System.out.println("Searching Algorithm : Binary Search");
                System.out.println("Enter the Element to search:");
                int element = sc.nextInt();
                search.binarySearch(arr, element);
                break;

            case 3:
                System.out.println("Sorting Algorithm : Bubble Sort");
                search.bubbleSort(arr);
                System.out.println("Array after Bubble Sort:");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
