package array;
import java.util.Scanner;

class sorting {
    public static void sort(int arr[]) {
        for (int i = 0; i <= (arr.length - 2); i++) {
            int min = i;
            for (int j = i; j <= arr.length - 1; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
    }
}

public class selectionsort {
    public static void main(String[] args) {
        System.out.println("enter the array size");
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int arr[] = new int[size];
        System.out.print("enter the array numbers");
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = obj.nextInt();
        }
        sorting.sort(arr);
        System.out.println("the sorted array is");
        for (int i = 0; i <= size - 1; i++) {
            System.out.print(arr[i] + "");
        }
        obj.close();

    }
}