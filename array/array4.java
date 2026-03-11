package array;
import java.util.Scanner;

class solution {
    public static int checkduplicates(int arr[]) {
        int i =0;
        for (int j = 1; j <= arr.length - 1; j++) {
            if (arr[i] != arr[j]) {
                arr[i+1] = arr[j];
                i++;

            } 
        }
        return i+1;
    }

}

public class array4 {
        public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner obj = new Scanner(System.in);
        int arr[] = new int[obj.nextInt()];
        System.out.println("enter the array elements");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = obj.nextInt();
        }
        int unique = solution.checkduplicates(arr);
        System.out.println("the number of unique elements are"+":"+unique);
        obj.close();
    }
}
