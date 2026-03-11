package array;
import java.util.Scanner;

class sortedd {
    public static void sortt(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] >= arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

    }
}

public class insertionsort {
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner obj = new Scanner(System.in);
        int arr[] = new int[obj.nextInt()];
        System.out.println("enter the array elements");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = obj.nextInt();
        }
        sortedd.sortt(arr);
        System.out.println("the array elements are ");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + "");
        }
        obj.close();
    }
}
