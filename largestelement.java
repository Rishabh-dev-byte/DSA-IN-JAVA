import java.util.Scanner;

public class largestelement {
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner obj = new Scanner(System.in);
        int arr[] = new int[obj.nextInt()];
        System.out.println("enter the array elements");
        int largest = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = obj.nextInt();
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("the largest element from the array is" + ":" + largest);
        obj.close();
    }
}
