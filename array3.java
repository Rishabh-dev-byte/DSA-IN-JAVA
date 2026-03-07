import java.util.Scanner;

class solution {
    public static boolean checksorted(int arr[]) {
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] >= arr[i - 1]) {

            } else {
                return false;
            }
        }
        return true;
    }

}

public class array3 {
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner obj = new Scanner(System.in);
        int arr[] = new int[obj.nextInt()];
        System.out.println("enter the array elements");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = obj.nextInt();
        }
        boolean issorted = solution.checksorted(arr);
        System.out.println("is the array sorted" + ":" + issorted);
        obj.close();
    }
}
