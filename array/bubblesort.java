package array;
import java.util.Scanner;

class Sorted{
    public static void sort(int arr[]){
        for(int i = arr.length-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

public class bubblesort {
    public static void main(String[] args){
        System.out.println("enter the size of the array");
        Scanner obj = new Scanner(System.in);
        int arr[] = new int[obj.nextInt()];
        System.out.println("enter the array elements");
        for(int i=0;i<=arr.length-1;i++){
            arr[i] = obj.nextInt();
        }
        Sorted.sort(arr);
        System.out.println("the sorted array is");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+"");
        }
        obj.close();
    }
}
